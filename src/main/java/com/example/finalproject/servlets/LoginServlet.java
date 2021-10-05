package com.example.finalproject.servlets;

import com.example.finalproject.dto.RoleDto;
import com.example.finalproject.dto.UserDto;
import com.example.finalproject.entity.Role;
import com.example.finalproject.servise.RoleServise;
import com.example.finalproject.servise.UserServise;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");


        String email = request.getParameter("emailField");
        String password  = request.getParameter("passwordField");

        UserDto userDto = new UserDto();

        try {
            userDto = new UserServise().getByemail(email);
        }
        catch (Exception e)
        {
            // что то сделать если вылезла ошибка
        }

        Role roleDto = new RoleServise().getRoleByID(userDto.getRoleId());

        if(password.equals(userDto.getPassword())) {


            HttpSession session = request.getSession();
            // session.setAttribute("username",username);

            switch (roleDto.getName())
            {
                case "speaker":
                    //   getServletContext().getRequestDispatcher("/basic.jsp").forward(request, response);  moderatorPage.jsp   simpleUserPage.jsp speakerPage.jsp
                     session.setAttribute("user",userDto);
                     response.sendRedirect("speakerPage.jsp");
                    break;

                case "moderator":
                    session.setAttribute("user",userDto);
                    response.sendRedirect("moderatorPage.jsp");
                    break;

                case "simple user":
                    session.setAttribute("user",userDto);
                    response.sendRedirect("simpleUserPage.jsp");
                    break;
            }
        }
        else {

        }

    }
}
