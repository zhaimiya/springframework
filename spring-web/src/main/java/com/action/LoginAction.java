package com.action;

import com.pojo.User;
import com.srv.UserSrv;
import com.srv.impl.UserSrvImpl;
import com.util.SpringBeanHolder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("usrnm");
        String pwd = req.getParameter("pwd");
        UserSrv userSrv = (UserSrv)SpringBeanHolder.getBean(UserSrvImpl.class);
        User user = userSrv.login(username,pwd);
        if(null!= user){
            req.getSession().setAttribute("user",user);
            req.getRequestDispatcher("/WEB-INF/view/success.jsp").forward(req,resp);
        }else{
            req.setAttribute("loginError","用户名或密码错误");
            req.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(req,resp);
        }
    }
}
