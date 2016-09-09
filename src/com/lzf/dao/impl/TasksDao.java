package com.lzf.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lzf.bean.TasksType;
import com.lzf.dao.ITasksDao;
import com.lzf.util.DBUtil;

public class TasksDao implements ITasksDao {
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	private List<String> selectAll() {
		List<String> taskList = new ArrayList<String>();
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement("SELECT DISTINCT taskType FROM tasks");
			rs = ps.executeQuery();
			while (rs.next()) {
				taskList.add(rs.getString("taskType"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeDB(conn, ps, rs);
		}
		return taskList;
	}

	@Override
	public List<TasksType> getTasksTypes() {
		List<TasksType> taskList = new ArrayList<TasksType>();
		List<String> temp = selectAll();
		for (String t : temp) {
			try {
				conn = DBUtil.getConnection();
				ps = conn.prepareStatement(
						"SELECT SUM(inspect) AS inspectS, SUM(inspected) AS inspectedS, MAX(time) AS timeM FROM tasks WHERE taskType = ?");
				ps.setString(1, t);
				rs = ps.executeQuery();
				while (rs.next()) {
					TasksType tasksType = new TasksType(rs.getInt("inspectS"), rs.getInt("inspectedS"),
							rs.getInt("timeM"), t);
					taskList.add(tasksType);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBUtil.closeDB(conn, ps, rs);
			}
		}
		return taskList;

	}

}
