

document.getElementById("miFormulario").addEventListener("submit", function (calcular) {
    calcular.preventDefault();
    calcular.stopPropagation();

    //obtencion de datos
    var presupuesto = parseInt(document.getElementById("input1").value);
    var porcentaje = parseInt(document.getElementById("input2").value);
    var seleccion = document.getElementById("seleccion");
    var valorSeleccionado = seleccion.options[seleccion.selectedIndex].text;
    var valorPorcentaje = porcentaje / 100;

//calculo de porcentaje del presupuesto e impresion en html en las diferentes opciones

    switch (valorSeleccionado) {
        case "Gastos necesarios":
            var gastosNecesarios = presupuesto * valorPorcentaje;
            var div = document.getElementById("resultado");
            div.classList.add("mt-2", "text-center", "fw-bold", "fs-6", "text-primary", "text-uppercase",);
            document.getElementById("resultado").innerHTML = "El " + porcentaje + "% " + "del presupesto para " + valorSeleccionado + " corresponde a un monto de: " + gastosNecesarios + "$";
            break;

        case "Gastos opcionales":
            var ahorroInversion = presupuesto * valorPorcentaje;
            var div = document.getElementById("resultado");
            div.classList.add("mt-2", "text-center", "fw-bold", "fs-6", "text-primary", "text-uppercase",);
            document.getElementById("resultado").innerHTML = "El " + porcentaje + "% " + "del presupesto para " + valorSeleccionado + " corresponde a un monto de: " + ahorroInversion + "$";
            break;

         case "Ahorro o inversion":
            var ahorroInversion = presupuesto * valorPorcentaje;
            var div = document.getElementById("resultado");
            div.classList.add("mt-2", "text-center", "fw-bold", "fs-6", "text-primary", "text-uppercase",);
            document.getElementById("resultado").innerHTML = "El " + porcentaje + "% " + "del presupesto para " + valorSeleccionado + " corresponde a un monto de: " + ahorroInversion + "$";
         break;

    }

});







    
    

    
    


