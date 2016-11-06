//Fonction anonyme
(function() {
  "use strict"

  //Fonction qui ne renvoi pas de valeur
  console.log("*************Fonction qui ne renvoi pas de valeur*************");
  function fct(variable) {
    console.log(variable);
  }

  fct("salut");

  //Fonction avec renvoi de valeur
  console.log("\n*************Fonction avec renvoi de valeur*************");
  var a = 12;

  function fct2(variable) {
    variable += 10;
    return variable;
  }

  var b = fct2(a);
  console.log(b);

  //Objet
  console.log("\n*************Objet*************");
  var obj = {
    age: 15,
    taille: 180.0,
    vieillir: function() {
      console.log("je vieillis");
      this.age++;
        console.log("j'ai " + this.age + " ans");
    }
  }

  obj.cheveux = "brun";

  obj.courir = function() {
    console.log('je cours');
  }

  console.log(obj);

  obj.courir();
  obj.vieillir();

  //closure
  console.log("\n*************closure*************");
  var e = 12;

  function closure() {
    console.log(e);
  }

  e = 123;
  closure();

  //callback
  console.log("\n*************callback*************");
  var f = 12;

  function fct3() {
    console.log(f);
  }

  function getFct(param) {
    param();
  }

  getFct(fct3);

  //
  console.log("\n*************Unknow*************");
  function fctA() {
    console.log("fctA");
    return false;
  }

  function fctB() {
    console.log("fctB");
    return 123;
  }

  var variable2 = fctA() || fctB();

  console.log(variable2);

  //DOM
  console.log("\n*************************************** DOM ***************************************");
  //console.log(window);
  //console.log(document);
  console.log("Cette page contient " + document.getElementsByTagName("input").length + " balise input");
  console.log(document.getElementById("nom"));

  document.getElementsByName("conversation")[0].value = "J'ai été rempli de texte par le Javascript. ^^";

  //****************
  console.log("\n\n\n*************************************** DOM2 ***************************************");
  //document.forms[0]; // collection de Base zéro
  //document.forms["contactForm"];
  var form = document.forms.contactForm;
  //document.contactForm;

  console.log(form.getElementsByTagName("input"));
  console.log(form.elements[0]);
  console.log(form.elements["nameBox"]);
  console.log(form.nameBox);
  console.log(document.contactForm.nameBox);
  console.log(document.getElementById("nameBoxId"));






})()
