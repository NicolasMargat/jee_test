<%@ page
	language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

		<link rel="stylesheet" type="text/css" href="assets/styles/style.css" />
		<link rel="stylesheet" type="text/css" href="assets/styles/styleMenu.css" />
		<link rel="stylesheet" type="text/css" href="assets/styles/styleIRC.css" />


		<title>Ma page de login.</title>
	</head>
	<body>
		<div class="main">
			<c:import url="/layouts/header.html" />
			<c:import url="/layouts/menu.html" />
			
			<div class="main_wrapper">
				<div id="connexion">
					<h2>Connexion</h2>
					<form action="/jee_test/login" method="post" class="formCnx">
						<label for="login">Login :</label>
						<input type="text" name="loginCnx" id="loginCnx" class="txtDefaut">
						<br/>
						<label for="mdp">Mot de passe :</label>
						<input type="password" name="mdpCnx" id="mdpCnx" class="txtDefaut">
						<br/>
						<input type="submit" value="Se connecter" id="btnConnexion" class="btnEnvoyer">
						<a href="register" id="sinscrire" >Je m'inscrit</a>
					</form>
				</div>
			</div>
		</div>
		<c:import url="/layouts/footer.html" />


		<script type="text/javascript" src="vendors/jquery-3.1.1.js"></script>
		<!-- <script type="text/javascript" src="assets/script/cnxJQuery.js"></script> -->
	</body>
</html>