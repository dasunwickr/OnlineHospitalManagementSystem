package com.ohms.controller.pharmacy;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ohms.dao.pharmacy.SupplierDAO;
import com.ohms.model.pharmacy.Supplier;

import java.util.List;

@WebServlet("/SupplierListController")
public class SupplierListController extends HttpServlet {
    private SupplierDAO supplierDAO;

    public void init() throws ServletException {
        // Initialize the SupplierDAO here
        supplierDAO = new SupplierDAO(); // You should configure this properly
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the list of suppliers from the database
        List<Supplier> suppliers = supplierDAO.getAllSuppliers();
        
        System.out.println(suppliers);
        
        // Set the suppliers as an attribute in the request for JSP to access
        request.setAttribute("suppliers", suppliers);
        
        // Forward the request to the JSP view
        request.getRequestDispatcher("PharmacistSupplierList.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
