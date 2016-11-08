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
		<link rel="stylesheet" type="text/css" href="assets/styles/styleIns.css" />


		<title>Ma page de test. lol</title>
	</head>
	<body>
		<div class="main">
			<c:import url="/layouts/header.html" />
			<c:import url="/layouts/menu.html" />
			
			<div id="inscription">
				<h2>Inscription</h2>
				<form action="/jee_test/register" method="post" class="formIns">
					<label for="login">Login :</label>
					<input type="text" name="login" id="login" class="txtDefaut">
					<br/>
					<label for="email">Email :</label>
					<input type="email" name="mail" id="email" class="txtDefaut">
					<br/>
					<label for="mdp">Mot de passe :</label>
					<input type="password" name="pwd" id="mdp" class="txtDefaut">
					<br/>
					<input type="submit" value="Envoyer" id="btnInscription" class="btnEnvoyer">
				</form>
			</div>
		</div>
		<c:import url="/layouts/footer.html" />


		<script type="text/javascript" src="vendors/jquery-3.1.1.js"></script>
		<!--<script type="text/javascript" src="assets/script/cnxJQuery.js"></script>
		<script type="text/javascript" src="assets/script/cookie.js"></script>
		<script type="text/javascript" src="assets/script/global.js"></script>
		<script type="text/javascript" src="assets/script/cnx.js"></script>-->
	</body>
</html>