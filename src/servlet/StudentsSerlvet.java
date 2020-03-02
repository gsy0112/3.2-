package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Students;
import service.StudentsService;
import service.impl.StudentsServiceImpl;

@WebServlet("/index")
public class StudentsSerlvet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		StudentsService ss = new StudentsServiceImpl();
		// 创建一个集合收取所有的值 
		List<Students> stus = ss.stus();
		req.getSession().setAttribute("stus",stus);
		req.getRequestDispatcher("index.jsp").forward(req,resp);
		}
	
	
}
