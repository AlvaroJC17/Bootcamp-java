


document.getElementById("miFormulario").addEventListener("submit", function (calcular) {
    calcular.preventDefault();
    calcular.stopPropagation();

    //obtencion de datos
    var presupuesto = parseInt(document.getElementById("input1").value);
    var porcentaje1 = parseInt(document.getElementById("input2").value);
    var porcentaje2 = parseInt(document.getElementById("input3").value);
    var porcentaje3 = parseInt(document.getElementById("input4").value);
    var valorPorcentaje1 = porcentaje1 / 100;
    var valorPorcentaje2 = porcentaje2 / 100;
    var valorPorcentaje3 = porcentaje3 / 100;
    var checkbox = document.getElementsByClassName("form-check-input");


    for (let i = 0; i < checkbox.length; i++) {

        if (checkbox[i].checked && !isNaN(presupuesto)) {
            var valor = checkbox[i].value;
            
            if (valor == "Gastos necesarios") {
                var gastosNecesarios = presupuesto * valorPorcentaje1;
                impresionPantalla(porcentaje1, valor, gastosNecesarios, "resultado1");
            }
            if (valor == "Gastos opcionales") {
                var gastosOpcionales = presupuesto * valorPorcentaje2;
                impresionPantalla(porcentaje2, valor, gastosOpcionales, "resultado2")
            }
            if (valor == "Ahorro e inversion") {
                var ahorroInversion = presupuesto * valorPorcentaje3;
                impresionPantalla(porcentaje3, valor, ahorroInversion, "resultado3")
            }
        }
         
    }
});

function impresionPantalla (valorPorcentaje,  categoria, calculoPresupuesto, idDiv){
    var idDiv;
    var parrafo = document.getElementById(idDiv);
    parrafo.classList.add("mt-2", "text-center", "fw-bold", "fs-6", "text-primary", "text-uppercase",);
    document.getElementById(idDiv).innerHTML = "El " + valorPorcentaje + "% " + "del presupesto para " + categoria + " corresponde a un monto de: " + calculoPresupuesto + "$";
}





    
    

    
    

