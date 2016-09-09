package com.lzf.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lzf.bean.TasksType;
import com.lzf.dao.ITasksDao;
import com.lzf.dao.impl.TasksDao;

/**
 * 任务类型
 */
@WebServlet(name = "tasksType", urlPatterns = { "/tasksType" })
public class TasksTypeServlet extends HttpServlet {

	private ITasksDao tasksDao = new TasksDao();
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<TasksType> types = tasksDao.getTasksTypes();
		String str = "";
		for (TasksType tasksType : types) {
			str += "{\"inspect\":\"" + tasksType.getInspect() + "\",\"inspected\":\"" + tasksType.getInspected()
					+ "\",\"time\":\"" + tasksType.getTime() + "\",\"taskType\":\"" + tasksType.getTaskType() + "\"},";
		}
		str = str.substring(0, str.length() - 1);
		response.getWriter().print("[" + str + "]");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
