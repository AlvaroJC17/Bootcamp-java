
document.getElementById("miFormulario").addEventListener("submit", function (evento) {
    evento.preventDefault();
    evento.stopPropagation();

    //ingresos
    var inputsIngre = document.getElementsByClassName("valorIngre");
    var sumaIngresos = 0;
    var validacionIngresos = true;
    var validacionEgresos = true;

    for (let i = 0; i < inputsIngre.length; i++) {
        if (inputsIngre[i].value != "") {
            valorIngre = parseInt(inputsIngre[i].value);
            sumaIngresos += valorIngre;
        } else {
            validacionIngresos = false;
            alert("todos los ingresos son obligatorios")
            break;
        }
    }
    
    // egresos
    var inputsEgre = document.getElementsByClassName("valorEgre");
    var sumaEgresos = 0;
    
    for (let y = 0; y < inputsEgre.length; y++) {
        if (inputsEgre[y].value != "") {
            valorEgre = parseInt(inputsEgre[y].value);
            sumaEgresos += valorEgre;
        } else {
            validacionEgresos = false;
            alert("todos los egresos son obligatorios")
            break;
        }
    }

    // calculo flujo de caja   
    var total = 0;
    total = sumaIngresos - sumaEgresos;
    var totalRedondeo = total.toFixed(2);
    
    if (sumaIngresos > sumaEgresos && validacionIngresos != false && validacionEgresos != false) {
        alert("El flujo de caja no genera perdidas, con un saldo positivo de: " + totalRedondeo + "$");
        console.log("El flujo de caja no genera perdidas, con un saldo positivo de: " + totalRedondeo + "$");
    } else if (sumaIngresos < sumaEgresos && validacionIngresos != false && validacionEgresos != false) {
        alert("El flujo de caja genera perdidas, con un saldo en contra de: " + totalRedondeo + "$");
        console.log("El flujo de caja genera perdidas, con un saldo en contra de: " + totalRedondeo + "$");
    }else if(sumaIngresos == sumaEgresos) {
        alert("El flujo de caja es 0");

    }else {
        alert("Ingrese datos faltantes");
        console.log("Ingrese datos faltantes");
    }
});
    
    
// Nota: se imprime a drede por alert y consola para mostrar el resultado por dos vias diferentes







    




 

