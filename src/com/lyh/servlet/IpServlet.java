package com.lyh.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lyh.dao.IIPDao;
import com.lyh.dao.impl.IPDao;

public class IpServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		String IP = req.getParameter("ip");
		IIPDao ipDao = new IPDao();
		String iplocation = ipDao.load(IP);
		req.setAttribute("IPLocation", iplocation);
		this.getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
	}
}
