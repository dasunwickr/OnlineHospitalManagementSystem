<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="pharmacist-styles/supplier-list.css">
<link rel="stylesheet" href="pharmacist-styles/header-footer.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
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
		<button class="add-supplier-button">+ ADD SUPPLIER</button>
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
				<tr>
					<td>Supplier 1</td>
					<td>John Doe</td>
					<td>john.doe@email.com</td>
					<td>(123) 456-7890</td>
					<td>123 Main St, City, Country</td>
					<td><a href="PharmacistViewSupplierList" class="icon-link"><i
							class="fa fa-arrow-circle-o-right fa-2x"></i></a></td>
				</tr>
				<tr>
					<td>Supplier 2</td>
					<td>Jane Smith</td>
					<td>jane.smith@email.com</td>
					<td>(456) 789-1230</td>
					<td>456 Elm St, City, Country</td>
					<td><a href="PharmacistViewSupplierList" class="icon-link"><i
							class="fa fa-arrow-circle-o-right fa-2x"></i></a></td>
				</tr>
				<!-- Add more supplier rows as needed -->
			</tbody>
		</table>
	</div>
	<footer class="footer">
		<p>&copy; 2023 Online Hospital Management System | Pharmacy
			Management Inc. All rights reserved.</p>
	</footer>

</body>
</html>
