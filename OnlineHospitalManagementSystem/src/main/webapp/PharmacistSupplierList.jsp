<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="pharmacist-styles/supplier-list.css">
    <link rel="stylesheet" href="pharmacist-styles/header-footer.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Supplier List View</title>
</head>
<body>
    <div class="navbar">
        <div>
            <i class="fa fa-medkit" aria-hidden="true"></i>
        </div>
        <ul>
            <li><a href="#">Dashboard</a></li>
            <li><a href="#">Inventory</a></li>
            <li><a href="#">Issue Medicine</a></li>
        </ul>
    </div>
    <header>
        <div class="left-heading">
            <h1>Supplier</h1>
            <h2>View and Manage Suppliers</h2>
        </div>
    </header>
    <div class="container">
        <div class="breadcrumb">
            <a href="#" class="breadcrumb-link">Dashboard</a> > Supplier List
        </div>
        <a href="PharmacistAddSupplier.jsp"><button class="add-supplier-button">+ ADD SUPPLIER</button></a>
        <table class="supplier-table">
            <thead>
                <tr>
                    <th>Supplier Name</th>
                    <th>Contact Person</th>
                    <th>Email</th>
                    <th>Phone Number</th>
                    <th>Address</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${suppliers}" var="supplier">
                    <tr>
                        <td>${supplier.name}</td>
                        <td>${supplier.contactPerson}</td>
                        <td>${supplier.email}</td>
                        <td>${supplier.phoneNumber}</td>
                        <td>${supplier.address}</td>
                        <td><a href="PharmacistViewSupplierList" class="icon-link"><i class="fa fa-arrow-circle-o-right fa-2x"></i></a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <footer class="footer">
        <p>&copy; 2023 Online Hospital Management System | Pharmacy Management Inc. All rights reserved.</p>
    </footer>
</body>
</html>