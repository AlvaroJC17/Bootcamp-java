

var opciones =
  [
    { nombre: "Plan001", capital: "150000", plazo: "30", tasa: "0.15" },
    { nombre: "Plan002", capital: "300000", plazo: "180", tasa: "0.10" },
    { nombre: "Plan003", capital: "485000", plazo: "60", tasa: "0.23" }
  ];
  
var interes = 0;
var arrayInteres = [];


for (let i = 0; i < opciones.length; i++) {

  interes = parseFloat((opciones[i].capital * opciones[i].plazo * opciones[i].tasa) / 100);

  var nuevoArray = { name: opciones[i].nombre, capital: opciones[i].capital, plazo: opciones[i].plazo, tasa: opciones[i].tasa, intereses: interes };

  arrayInteres.push(nuevoArray);


}

console.log(arrayInteres);


    
   
