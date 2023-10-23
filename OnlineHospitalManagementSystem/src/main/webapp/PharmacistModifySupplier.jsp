<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="pharmacist-styles/header-footer.css">
<link rel="stylesheet" href="pharmacist-styles/modify-supplier.css">
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
			<h1>Modify Supplier</h1>
			<h2>Edit Supplier Details</h2>
		</div>
	</header>
	<div class="container">
		<div class="breadcrumb">
			<a href="#" class="breadcrumb-link">Dashboard</a> > Supplier List
		</div>
	</div>

	<div class="supplier-form">
		<form action="process_supplier.php" method="POST">
			<label for="supplierName">Supplier Name:</label> <input type="text"
				id="supplierName" name="supplierName" required> <label
				for="contactPerson">Contact Person:</label> <input type="text"
				id="contactPerson" name="contactPerson" required> <label
				for="email">Email:</label> <input type="email" id="email"
				name="email" required> <label for="phoneNumber">Phone
				Number:</label> <input type="tel" id="phoneNumber" name="phoneNumber"
				required> <label for="address">Address:</label>
			<textarea id="address" name="address" required></textarea>

			<input type="submit" value="Submit">
			<button type="button" class="delete-button">Delete</button>
		</form>
	</div>

	<footer class="footer-add">
		<p>&copy; 2023 Online Hospital Management System | Pharmacy
			Management Inc. All rights reserved.</p>
	</footer>
</body>
</html>