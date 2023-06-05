document.getElementById("miFormulario").addEventListener("submit", function (calcular) {
    calcular.preventDefault();
    calcular.stopPropagation();

    //obtencion de datos
    var presupuesto = parseInt(document.getElementById("input1").value);
    var porcentaje = parseInt(document.getElementById("input2").value);

    var seleccion = document.getElementById("seleccion");
    var valorSeleccionado = seleccion.options[seleccion.selectedIndex].text;

    var valorPorcentaje = porcentaje / 100;
    
    //calculo de porcentaje del presupuesto e impresion en pantalla
    
        switch (valorSeleccionado) {
            case "Gastos necesarios":
                var gastosNecesarios = presupuesto * valorPorcentaje;
                impresionPantalla(porcentaje, valorSeleccionado, gastosNecesarios);
                break;
    
            case "Gastos opcionales":
                var gastosOpcionales = presupuesto * valorPorcentaje;
                impresionPantalla(porcentaje, valorSeleccionado, gastosOpcionales);
                break;
    
             case "Ahorro o inversion":
                var ahorroInversion = presupuesto * valorPorcentaje;
                impresionPantalla(porcentaje, valorSeleccionado, ahorroInversion);
                break;
            }
        });
            
        // funcion para impresion en pantalla

        function impresionPantalla (valorPorcentaje,  categoria, calculoPresupuesto){
            var parrafo = document.getElementById("resultado");
            parrafo.classList.add("mt-2", "text-center", "fw-bold", "fs-6", "text-primary", "text-uppercase",);
            document.getElementById("resultado").innerHTML = "El " + valorPorcentaje + "% " + "del presupesto para " + categoria + " corresponde a un monto de: " + calculoPresupuesto + "$";
        }







    
    

    
    


