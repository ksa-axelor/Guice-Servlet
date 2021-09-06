package com.kaif.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.kaif.service.GuiceService;

@Singleton
public class GuiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1861227452784320290L;

	@Inject
	private GuiceService guiceServiece;

//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		response.getWriter().println(guiceServiece.sayHello());
//	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		resp.getWriter().println("My name is "+ name);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doPost(req, resp);
		String name = req.getParameter("name");
		resp.getWriter().println("My name is "+ name);
	}
}
