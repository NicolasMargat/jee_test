<%@ page
	language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>
<%@ page import="fr.entities.User" %>
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
			<%@ include file="Views/header.html" %>
			<%@ include file="Views/menu.html" %>
			
			<div class="main_wrapper">
				<% User connectedUser = (User) session.getAttribute("user"); %>
				<%= "<h3>Bonjour, " + connectedUser.getLogin() + "</h3>"%>
				<div id="chat">
					<div id="conversation"></div>
					<form action="/jee_test/irc" method="post" class="formChat" id="sendMessage">
						<input type="text" id="message" name="message" class="txtDefaut" placeholder="Ecrire un message..." />

						<input type="submit" value="Envoyer" class="btnEnvoyer" />
					</form>
				</div>
			</div>
		</div>
		<%@ include file="Views/footer.html" %>


		<script type="text/javascript" src="vendors/jquery-3.1.1.js"></script>
		<!--<script type="text/javascript" src="assets/script/cnxJQuery.js"></script>
		<script type="text/javascript" src="assets/script/cookie.js"></script>
		<script type="text/javascript" src="assets/script/global.js"></script>
		<script type="text/javascript" src="assets/script/cnx.js"></script>-->
	</body>
</html>