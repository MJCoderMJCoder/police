package com.lzf.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lzf.util.DBUtil;

public class Test {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement("SELECT * FROM worklog");
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("time£º" + rs.getString("time") + " \t workLog£º" + rs.getString("worklog") + "\t remark£º"
						+ rs.getString("remark"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeDB(conn, ps, rs);
		}
	}

}
