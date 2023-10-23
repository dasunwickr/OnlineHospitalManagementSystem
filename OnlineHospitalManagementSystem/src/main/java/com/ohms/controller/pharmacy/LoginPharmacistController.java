package com.ohms.controller.pharmacy;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ohms.dao.pharmacy.PharmacistDAO;
import com.ohms.model.pharmacy.Pharmacist;

@WebServlet("/LoginPharmacistController")
public class LoginPharmacistController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PharmacistDAO pharmacistDAO = new PharmacistDAO();
        Pharmacist pharmacist = pharmacistDAO.getPharmacist(username, password);

        if (pharmacist != null) {
            // Login successful
            // You can set session attributes here
            response.sendRedirect("PharmacistDashboard.jsp"); // Redirect to the dashboard
        } else {
            // Login failed
            response.sendRedirect("LoginError.jsp"); // Redirect to an error page
        }
    }
}
