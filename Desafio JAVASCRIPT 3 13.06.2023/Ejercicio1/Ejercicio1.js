
/*

Forma manual

Enero 1500 1500
Febrero 2500 2500
Marzo 84683 1155
Abril 135353 1533
Mayo 1535 5434
Junio 4343354 5434543
Julio 435453 4543
Agosto 78351 7816
Septiembre 1878 95634
Octubre 48483 9433
Noviembre 35483 53133
Diciembre 3843 348133

var flujoIngresos = [1500, 2500, 84683, 135353, 1535, 4343354, 435453, 78351, 1878, 48483, 35483, 3843];
var flujoEgresos = [1500, 2500, 1155, 1533, 5434, 5434543, 4543, 7816, 95634, 9433, 53133, 348133]; 
*/

/* forma dinamica */

var ingresos = prompt("Idique montos de ingresos mensuales separados por un espacio");
var flujoIngresos = ingresos.split(" ");

var egresos = prompt("Idique montos de egresos mensuales separados por un espacio");
var flujoEgresos = egresos.split(" ");

var sumaIngresos = 0;
var sumaEgresos = 0;
var total;

for (let i = 0; i < flujoIngresos.length; i++) {
    sumaIngresos += parseInt(flujoIngresos[i]);
}

for (let j = 0; j < flujoEgresos.length; j++) {
    sumaEgresos += parseInt(flujoEgresos[j]);
}

total = sumaIngresos - sumaEgresos;
var totalRedondeo = total.toFixed(2);
 
if (sumaIngresos > sumaEgresos) {
    alert("El flujo de caja no genera perdidas, con un saldo positivo de: " + totalRedondeo);
    console.log("El flujo de caja no genera perdidas, con un saldo positivo de: " + totalRedondeo);
}else {
    alert("El flujo de caja genera perdidad, con un saldo en contra de: " + totalRedondeo);
    console.log("El flujo de caja genera perdidad, con un saldo en contra de: " + totalRedondeo);
}

// Nota: se imprime a drede por alert y consola para mostrar el resultado por dos vias diferentes