package com.example.finalproject.servlets;

import com.example.finalproject.dto.UserDto;
import com.example.finalproject.entity.Role;
import com.example.finalproject.request.UserRegistrationRequest;
import com.example.finalproject.servise.RoleServise;
import com.example.finalproject.servise.UserServise;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegistrationServlet", value = "/registrationServlet")
public class RegistrationServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "hellow servelet ";
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        UserRegistrationRequest userRegistrationRequest = new UserRegistrationRequest();

        userRegistrationRequest.setLastName(request.getParameter("lastNameField"));
        userRegistrationRequest.setFirstName(request.getParameter("firstNameField"));
        userRegistrationRequest.setEmail(request.getParameter("emailField"));
        userRegistrationRequest.setPassword(request.getParameter("passwordField"));
        userRegistrationRequest.setRoleName(request.getParameter("select_role"));

        UserDto userDto = new UserDto();

        RoleServise roleServise = new RoleServise();

        userDto.setLastName(userRegistrationRequest.getLastName());
        userDto.setFirstName(userRegistrationRequest.getFirstName());
        userDto.setEmail(userRegistrationRequest.getEmail());
        userDto.setPassword(userRegistrationRequest.getPassword());

        Role role = roleServise.getRoleByName(userRegistrationRequest.getRoleName());

        userDto.setRoleId(role.getId());

         UserServise userService = new UserServise();
         userService.save(userDto) ;

    }
}
