package com.ohms.controller.pharmacy;

import com.ohms.dao.pharmacy.SupplierDAO;
import com.ohms.model.pharmacy.Supplier;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddSupplierController")
public class AddSupplierController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form parameters
        String supplierName = request.getParameter("supplierName");
        String contactPerson = request.getParameter("contactPerson");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");
        String address = request.getParameter("address");

        // Create a new Supplier object
        Supplier newSupplier = new Supplier();
        newSupplier.setName(supplierName);
        newSupplier.setContactPerson(contactPerson);
        newSupplier.setEmail(email);
        newSupplier.setPhoneNumber(phoneNumber);
        newSupplier.setAddress(address);

        // Insert the new supplier into the database
        SupplierDAO supplierDAO = new SupplierDAO();
        supplierDAO.insertSupplier(newSupplier);

        // Redirect to a success page or display a success message
        response.sendRedirect("PharmacistSupplierList.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // You can implement the doGet method if needed for other functionality.
        // In this example, it's not used for adding suppliers.
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }
}
