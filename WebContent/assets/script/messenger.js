(function($) {
	"use strict"

	/*
	 * Récupération d'élément html
	 */
	//Elément du chat
	var divChat = $('#chat');
	var txtConversation = $('#conversation');


	/*
	 * Fonctions
	 */
	function readMessage(tabMessage) {
		var message = '';

		txtConversation.empty();
		//txtConversation.append(tabmessage);

		for(var i = (tabMessage.length - 10); i < tabMessage.length; i++) {
			var d = tabMessage[i].date_mess.split('-');

			message += "<p class=\"message_user\"><span>";
			message += tabMessage[i].login + "</span> a écrit le " + d[1] +"/"+ d[2] +"/"+ d[0] + " à " + tabMessage[i].heure_mess;
			message += "<br/>" + tabMessage[i].message;
			message += "</p>";
		}

		txtConversation.append(message);
	};

	function refresh() {
		setInterval(
			function() {receive("", 'http://localhost:8080/jee_test/irc', 'get')},
			5000);
	}


	/*
	 * AJAX
	 */
	function receive(obj, url, type) {
		$.ajax({
			url: url, //URL où envoyer la requête (correspond à l'action d'un form)
			data: obj, //données envoyées
			type: type, //Méthode HTTP de la reqête
			dataType: 'json', //type de données attendues en retour: json
			complete: function(xhr, status){
				//console.log("Requête bien envoyée");
			},
			success: function(donnees, status) {
				//console.log("Le serveur a bien reçu la reqête");
				readMessage(donnees.messages);
			},
			error: function(donnees, status) {
				console.log("erreur de réception");
			}
		});
	};

	setInterval(
		function() {receive("", 'http://10.3.104.51:8080/jee_test/irc', 'get')},
		3000);


})(jQuery);