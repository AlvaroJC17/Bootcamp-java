
var totalIngresos = 250000000000;
var totalEgresos =  250457545


function flujoDeCaja(ingresos, egresos){
    if (ingresos > egresos) {
        console.log("1");
        alert("1");
    }else if(ingresos == egresos){
        console.log("0");
        alert("0");
    }else {
        console.log("-1")
        alert("-1");
    }
    }

    //llamado a la funcion

    flujoDeCaja(totalIngresos, totalEgresos);

// Nota: se imprime a drede por alert y consola para mostrar el resultado por dos vias diferentes



 
