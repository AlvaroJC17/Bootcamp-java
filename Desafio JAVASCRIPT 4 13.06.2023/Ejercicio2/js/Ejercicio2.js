

var opciones =
  [
    { nombre: "Plan001", capital: "150000", plazo: "30", tasa: "0.15" },
    { nombre: "Plan002", capital: "300000", plazo: "180", tasa: "0.10" },
    { nombre: "Plan003", capital: "485000", plazo: "60", tasa: "0.23" },
    { nombre: "Plan004", capital: "500000", plazo: "70", tasa: "0.5" }
    
  ];

  calculoInteres(opciones);




  
  function calculoInteres(arrayOpciones){
    var arrayInteres = [];
    var interes = 0;
    
    for (let i = 0; i < arrayOpciones.length; i++) {
      interes = parseFloat((arrayOpciones[i].capital * arrayOpciones[i].plazo * arrayOpciones[i].tasa) / 100);
      var nuevoArray = { nombre: arrayOpciones[i].nombre, capital: arrayOpciones[i].capital, plazo: arrayOpciones[i].plazo, tasa: arrayOpciones[i].tasa, intereses: interes };
      arrayInteres.push(nuevoArray);
    }
    console.log(arrayInteres);
  }
      












  