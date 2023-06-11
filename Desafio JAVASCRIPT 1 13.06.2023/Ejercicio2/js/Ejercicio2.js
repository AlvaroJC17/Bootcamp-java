

var presupuesto = parseInt(prompt("Ingrese valor del presupuesto"));

// 50% del presupuesto


var gastosNecesarios = presupuesto * 0.5;
var redondeoNecesarios = gastosNecesarios.toFixed(2);
console.log("EL presupuesto para gastos necesarios es: " + redondeoNecesarios + "$");
alert("EL presupuesto para gastos necesarios es: " + redondeoNecesarios + "$");

// 30% del presupuesto

var gastosOpcionales = presupuesto * 0.3;
var redondeoOpcionales = gastosOpcionales.toFixed(2);
console.log("El presupuesto para gastos opcionales es: " + redondeoOpcionales + "$");
alert("El presupuesto para gastos opcionales es: " + redondeoOpcionales + "$");

// 20% del presupuesto

var ahorroInversion = presupuesto * 0.2;
var redondeoInversion = ahorroInversion.toFixed(2);
console.log("El total para ahorro e inversion es: " + redondeoInversion + "$");
alert("El total para ahorro e inversion es: " + redondeoInversion + "$");

// Nota: se imprime a drede por alert y consola para mostrar el resultado por dos vias diferentes






    
















