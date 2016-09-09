package com.lzf.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.lzf.bean.User;
import com.lzf.dao.IUserDao;
import com.lzf.util.DBUtil;
import com.lzf.util.Encrypt;
import com.sun.org.apache.bcel.internal.generic.Select;

import sun.applet.Main;

public class UserDao implements IUserDao {
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	@Override
	public User select(String username) {
		User user = null;

		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(
					"SELECT username, password FROM users WHERE username = ? collate Chinese_PRC_CS_AI");
			ps.setString(1, username);
			rs = ps.executeQuery();
			while (rs.next()) {
				user = new User(rs.getString("username"), rs.getString("password"), "");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeDB(conn, ps, rs);
		}
		return user;
	}

	@Test
	public void addUser() {
		User user = new User("lzf0", "lzf", "");
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement("INSERT INTO users (username, password, remark) VALUES (?, ?, ?)");
			ps.setString(1, user.getUsername());
			ps.setString(2, Encrypt.encrypt(user.getPassword()));
			ps.setString(3, user.getRemark());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeDB(conn, ps, rs);
		}
	}

}
