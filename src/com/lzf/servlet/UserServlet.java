package com.lzf.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lzf.bean.User;
import com.lzf.dao.IUserDao;
import com.lzf.dao.impl.UserDao;
import com.lzf.util.Encrypt;

import jdk.nashorn.internal.ir.debug.JSONWriter;
import jdk.nashorn.internal.parser.JSONParser;

/**
 * 用户的servlet
 */
@WebServlet(name = "user", urlPatterns = { "/user" })
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IUserDao userDao = new UserDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (password.length() != 64) {
			password = Encrypt.encrypt(password);
		}
		User user = userDao.select(username);
		PrintWriter out = response.getWriter();
		if (user != null) {
			if (password.equals(user.getPassword())) {
				out.print("OK");
			} else {
				out.print("密码不正确");
			}
		} else {
			out.print("该用户不存在");
		}
	}

}
