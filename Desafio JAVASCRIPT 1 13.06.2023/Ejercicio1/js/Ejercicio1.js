


var cv; 
var costoFijo = parseInt(prompt("Ingrese monto fijo"));
var precioDeVenta = parseInt(prompt("Ingrese precio de venta"));
var costosVAriables = parseInt(prompt("Ingrese los costos variables"));

// calculo de punto de equilibrio.

cv = costoFijo/(precioDeVenta-costosVAriables);
var costoVariable = cv.toFixed(2);
alert("El varlo de punto de equilibrio es: " + costoVariable + " ventas");
console.log("El varlo de punto de equilibrio es: " + costoVariable + " ventas");

// Nota: se imprime a drede por alert y consola para mostrar el resultado por dos vias diferentes