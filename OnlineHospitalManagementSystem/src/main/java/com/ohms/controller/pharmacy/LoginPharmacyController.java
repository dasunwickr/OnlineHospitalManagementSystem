package com.ohms.controller.pharmacy;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginPharmacyController
 */
@WebServlet("/LoginPharmacyController")
public class LoginPharmacyController extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginPharmacyController() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // This method is not used in this example, but you can add GET-related logic here.
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the username and password from the form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Replace this with your actual authentication logic, e.g., checking against a database
        if (isValidUser(username, password)) {
            // Successful login
            response.getWriter().write("Login successful. Welcome, " + username + "!");
        } else {
            // Failed login
            response.getWriter().write("Login failed. Please check your credentials.");
        }
    }

    private boolean isValidUser(String username, String password) {
        // Replace this with your actual authentication logic, e.g., checking against a database
        return "user".equals(username) && "password".equals(password);
    }
}
