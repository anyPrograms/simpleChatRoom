package com.simpleChatRoom.Controller.Servlets;

import com.simpleChatRoom.Controller.Daos.impl.userDaoImpl;
import com.simpleChatRoom.Module.userBean;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserServlet")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path=request.getContextPath();
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        String account=request.getParameter("account");
        String password =request.getParameter("password");

        ServletContext application=this.getServletContext();//获取application对象
        List<String> list=(List<String>)application.getAttribute("allUser");
        if(list.indexOf(account)!=-1){
            userBean bean=new userDaoImpl().login(account,password);
            if(bean!=null){
                HttpSession session=request.getSession(true);
                session.setAttribute("account",account);
            }
        }
        response.sendRedirect(path+"/index.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
