//Fonction anonyme
(function() {
  "use strict"

  //Fonction de contrôle des chaines de caractère
  function fctRegex(val, valid) {
    //regex /^\w+\.{0,1}\w+\@\w+\.[A-Za-z]{2,6}/g

    var correct = false;
    while ((m = valid.exec(val)) !== null) {
      // This is necessary to avoid infinite loops with zero-width matches
      if (m.index === valid.lastIndex) {
          valid.lastIndex++;
      }

      // The result can be accessed through the `m`-variable.
      m.forEach((match, groupIndex) => {
          console.log(`Found match, group ${groupIndex}: ${match}`);
      });
    }
  }

  //Déclaration des éléments div dans des variables
 var divCnx = document.getElementById("connexion");
 var divIns = document.getElementById("inscription");
 var divChat = document.getElementById("chat");

  //Déclaration des éléments du formulaire connexion dans des variables
  var btnSinscrire = document.getElementById("sinscrire");
  var btnConnexion = document.getElementById("btnConnexion");
  var txtMailCnx = document.getElementById("emailCnx");
  var txtPwdCnx = document.getElementById("mdpCnx");

  //Déclaration des éléments du formulaire inscription dans des variables
  var txtNom = document.getElementById("nom");
  var txtPrenom = document.getElementById("prenom");
  var txtMail = document.getElementById("email");
  var txtPwd = document.getElementById("mdp");
  var btnInscription = document.getElementById("btnInscription");


    //Evénement lors de la perte du focus
  txtNom.onblur = function() {
    if (txtNom.value == "") {
      txtNom.className += " textBox";
    }
  };

  txtPrenom.onblur = function() {
    if (txtPrenom.value == "") {
      txtPrenom.className += " textBox";
    }
  };

  txtMail.onblur = function() {
    if (txtMail.value == "") {
      txtMail.className += " textBox";
    }
  };

  txtPwd.onblur = function() {
    if (txtPwd.value == "") {
      txtPwd.className += " textBox";
    }
  };

  //Evénement lors de la prise de focus
  txtNom.onfocus = function() {
    txtNom.classList.remove("textBox");
  };

  txtPrenom.onfocus = function() {
    txtPrenom.classList.remove("textBox");
  };

  txtMail.onfocus = function() {
    txtMail.classList.remove("textBox");
  };

  txtPwd.onfocus = function() {
    txtPwd.classList.remove("textBox");
  };

  //Evénement click
  btnSinscrire.onclick = function() {
    divCnx.style = "display: none;";
    divIns.style = "display: block;";
    return false;
  };

  btnConnexion.onclick = function() {
    if (txtMailCnx.value == "") {
      txtMailCnx.className += " textBox";
    }

    if (txtPwdCnx.value == "") {
      txtPwdCnx.className += " textBox";
    }

    if (txtMailCnx.value != "" && txtPwdCnx.value != "" ) {
      divCnx.style = "display: none;";
      divChat.style = "display: block;";
    } else {
      return false;
    }
  };

  btnInscription.onclick = function() {
    if (txtNom.value == "") {
      txtNom.style = "borderColor: red;";
    }
    return false;
  };

  //setInterval(maFonction, 1000);



})()
