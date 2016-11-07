(function($) {
  "use strict"

  /*
  * Récupération d'élément html
  */
  //Elément du chat
  var divChat = $('#chat');
  var txtConversation = $('#conversation');

  /*
  * Création d'objet
  */
  var chat = {
    token: '',
    message: ''
  };

  /*
  * Fonctions
  */
  function readMessage(tabMessage) {
    var message = '';

    txtConversation.empty();
    txtConversation.append(tabmessage);

//    for(var i = (tabMessage.length - 30); i < tabMessage.length; i++) {
//
//      txtConversation.append("<br/>" + tabMessage[i].login_id + " : " + tabMessage[i].message);
//    }
  };

  function refresh() {
    setInterval(
      function() {receive(chat, 'http://localhost:8080/jee_test/irc', 'get')},
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
        console.log("Requête bien envoyée");
      },
      success: function(donnees, status) {
        console.log("Le serveur a bien reçu la reqête");
        console.log(donnees.resultDetails);
        readMessage(donnees.resultDetails);
      }
    });
  };
  
  
  

})(jQuery);