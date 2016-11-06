(function($) {
  "use strict"

  /*
  * Récupération d'élément html
  */
  //Elément de connexion
  var divCnx = $('#connexion');
  var txtLoginCnx = $('#loginCnx');
  var txtPwdCnx = $('#mdpCnx');
  //Elément d'inscription
  var divIns = $('#inscription');
  //Elément du chat
  var divChat = $('#chat');
  var txtConversation = $('#conversation');
  var txtMessage = $('#message');

  /*
  * Récupération d'objet bouton et lien
  */
  var $btnCnx = $('.formCnx [type="button"]');
  var $lienIns = $('.formCnx a');
  var $btnIns = $('.formIns [type="button"]');
  var $btnEnvoiMess = $('.formChat [type="button"]');

  /*
  * Création d'objet
  */
  var cnx = {
    nom: '',
    prenom: ''
  };

  var ins = {
    login: '',
    email: '',
    pwd: ''
  };

  var chat = {
    token: '',
    message: ''
  };

  /*
  * Variables
  */


  /*
  * Fonctions
  */
  function readMessage(tabMessage) {
    var message = '';

    txtConversation.empty();

    for(var i = (tabMessage.length - 30); i < tabMessage.length; i++) {

      txtConversation.append("<br/>" + tabMessage[i].prenom + " : " + tabMessage[i].message.replace("style", " "));
    }

    /*for(var mess in tabMessage) {
      txtConversation.append(tabMessage[mess].prenom + " : " + tabMessage[mess].message + "\n");
    }*/

    //txtConversation.val(message);
  };

  function refresh() {
    setInterval(
      function() {receive(chat, 'http://localhost:8080/jee_test/irc', 'get')},
      5000);
  }


  /*
  * AJAX
  */
  function login(obj, url, type) {
    $.ajax({
      url: url, //URL où envoyer la requête (correspond à l'action d'un form)
      data: {'nom': 'nicolas', 'prenom': 'nicolas'},
      //data: obj, //données envoyées
      type: type, //Méthode HTTP de la reqête
      dataType: 'json', //type de données attendues en retour: json
      complete: function(xhr, status){
        console.log("Requête bien envoyée");
      },
      success: function(donnees, status) {
        console.log("Le serveur a bien reçu la reqête");
        chat.token = donnees.resultDetails.token;
        receive(chat, 'http://localhost:8080/jee_test/irc', 'get');
        refresh();
      }
    });
  };

  function send(obj, url, type) {
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
        receive(chat, 'http://localhost:8080/jee_test/irc', 'get');
      }
    });
  };

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
        readMessage(donnees.resultDetails);
      }
    });
  };


  /*
  * Evénement click des objets
  */
  $btnCnx.on('click', function() {
    cnx.nom = txtLoginCnx.val();
    cnx.prenom = txtPwdCnx.val();

    /*
    console.log(cnx.login.val());
    console.log(cnx.pwd.val());

    if(cnx.login.val() != "" && cnx.pwd.val() != "") {
      divCnx.addClass('masquer');
      divChat.removeClass('masquer');
    } else if (cnx.login.val() == "" && cnx.pwd.val() != "") {
      txtLoginCnx.addClass('textBox');
      console.log("login vide");
    } else if (cnx.login.val() != "" && cnx.pwd.val() == "") {
      console.log("mdp vide");
    };

    txtConversation.val("Bonjour " + cnx.login.val());*/

    divCnx.addClass('masquer');
    divChat.removeClass('masquer');

    login(cnx, 'http://localhost:8080/jee_test/irc','post');
  });

  $lienIns.on('click', function() {
      divCnx.addClass('masquer');
      divIns.removeClass('masquer');
      return false;
  });

  $btnIns.on('click', function() {
      divIns.addClass('masquer');
      divChat.removeClass('masquer');
      return false;
  });

  $btnEnvoiMess.on('click', function(event) {
      chat.message = txtMessage.val();
      send(chat, 'http://localhost:8080/jee_test/irc', 'post');
      txtMessage.val("");
  });

  $('#sendMessage').on('submit', function(event) {
    event.preventDefault();
  });






/*
* http://10.3.107.58/irc/getLoginToken.php
* http://10.3.107.58/irc/postMessage.php
* http://10.3.107.58/irc/getMessages.php
*/

/*
  $("a").each(function(indice, elem) {
  var $elem = $(elem);
  $elem.css("background", "red");
  $elem.css("color", "yellow");
})
*/


})(jQuery);
