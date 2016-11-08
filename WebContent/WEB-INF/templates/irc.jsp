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

		<title>Ma page de test. lol</title>
	</head>
	<body>
		<div class="main">
			<c:import url="layouts/header.html" />
			
			<c:import url="layouts/menu.html" />
			
			<div class="main_wrapper">
				<h3>Bonjour, ${user.login} </h3>
				<c:if test="${18 > 15}">
					<h4>valeur supérieur à 15</h4>
				</c:if>
				<div id="chat">
					<div id="conversation"></div>
					<form action="/jee_test/irc" method="post" class="formChat" id="sendMessage">
						<input type="text" id="message" name="message" class="txtDefaut" placeholder="Ecrire un message..." />

						<input type="submit" value="Envoyer" class="btnEnvoyer" />
					</form>
				</div>
			</div>
		</div>
		
		<c:import url="layouts/footer.html" />

		<script type="text/javascript" src="vendors/jquery-3.1.1.js"></script>
		<script type="text/javascript" src="assets/script/messenger.js"></script>
	</body>
</html>