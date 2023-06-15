

const creacionDiv = document.getElementById("buttonAdd"); // se obtiene info del boton "+" para crear inputs
const contenedorDiv = document.getElementById("contenedorInputs"); // se obtiene info del contendor "b2"
const divBody = document.getElementById("divBody"); //contenedor donde se va imprimir los resultados
const botonReset = document.getElementById("botonReset"); // se obtiene datos del boton para reset

// funcion para crear los div mediante el boton + y guardarlos todos dentro de otro div contenedor
creacionDiv.addEventListener("click", function (event) {
    event.preventDefault();
    event.stopPropagation();

    let divContenedor = document.createElement("div");
    divContenedor.classList.add("row", "container-fluid");

    let inputTexto = document.createElement("input");
    inputTexto.type = "text";
    inputTexto.placeholder = "Ingrese Categoria";
    inputTexto.classList.add("form-control", "mt-3", "col", "valorOpciones");

    let inputPorcentaje = document.createElement("input");
    inputPorcentaje.type = "number";
    inputPorcentaje.placeholder = "%";
    inputPorcentaje.classList.add("form-control", "mt-3", "ms-2", "col", "text-center", "valorPorcentaje");

    let botonEliminador = document.createElement("button");
    botonEliminador.textContent = "-";
    botonEliminador.classList.add("col-1", "btn", "btn-danger", "ms-2", "mt-3", "botonEliminador");
    botonEliminador.onclick = function () {  // funcion para que el boton "-" elimine el div que lo contiene
        contenedorDiv.removeChild(divContenedor);
    }

    divContenedor.appendChild(inputTexto);
    divContenedor.appendChild(inputPorcentaje);
    divContenedor.appendChild(botonEliminador);
    contenedorDiv.appendChild(divContenedor);
});

// Funcion para obtener los nombres de las categorias, el valor del presupuesto y los valores de porcentaje
const datosObtenidos = document.getElementById("miFormulario").addEventListener("submit", function (event2) {
    event2.preventDefault();

    let presupuesto = parseFloat(document.getElementById("input1").value);
    const valorCategoria = document.getElementsByClassName("valorOpciones");
    const valorPorcentaje = document.getElementsByClassName("valorPorcentaje");

    let Totalpresupuesto = 0;
    let redondeoPorcentaje = 0;
    let validacionPorcentaje = 0;
    let contador = 0;

    // bucle para determinar el total de los porcentajes ingresados
    for (let y = 0; y < valorPorcentaje.length; y++) {
        validacionPorcentaje += parseFloat(valorPorcentaje[y].value);
    }

    // Bucle para recoorrer los arrays las categorias y los porcentajes
    for (let i = 0; i < valorCategoria.length; i++) {

        contador++;
        let identificadorDiv = "resultado" + contador; // se crea id del div dinamico

        if (!isNaN(Totalpresupuesto) && valorCategoria[i].value != "" && valorPorcentaje[i].value != "") { // validacion para que los campos no esten vacios

            if (validacionPorcentaje > 0 && validacionPorcentaje <= 100) { // validacion para que el porcentaje no sea negativo o mayor a 100%
                Totalpresupuesto = presupuesto * (parseFloat(valorPorcentaje[i].value) / 100);
                redondeoPorcentaje = Totalpresupuesto.toFixed(2);

                // se crea objetos con los valores de las categorias, los porcentajes individuales y el valor de calculo de prespuesto para cada categoria 
                const objetoOpciones = { Categoria: valorCategoria[i].value, Porcentaje: valorPorcentaje[i].value, Presupuesto: redondeoPorcentaje };

                // se imprime en pantalla los div con los valores de los objetos y agregandoles un id dinamico, usando la funcion "impresionPantalla" 
                impresionPantalla(objetoOpciones.Porcentaje, objetoOpciones.Categoria, objetoOpciones.Presupuesto, identificadorDiv);
            } else {
                alert("Los porcentajes repartidos exceden el 100%");
                break;
            }
        } else {
            alert("todos los campos son obligatorios");
            break;
        }
    }
})


// funcion para crear div con id dinamicos e imprimir en pantalla el resultado de cada de los inputs creados 
function impresionPantalla(valorPorcentaje, categoria, calculoPresupuesto, idDiv) {
    let imprimirDiv = document.createElement("div");
    imprimirDiv.id = idDiv;
    imprimirDiv.classList.add("text-uppercase", "border", "border-2", "border-danger", "mb-3",);
    imprimirDiv.textContent = "El " + valorPorcentaje + "% " + "del presupesto para " + '"' + categoria + '"' + " corresponde a un monto de: " + calculoPresupuesto + "$";
    divBody.appendChild(imprimirDiv);
}

// boton para reiniciar los valores y los div creados.
botonReset.addEventListener("click", function () {

    while (divBody.firstChild && contenedorDiv.firstChild) {
        divBody.firstChild.remove();
        contenedorDiv.firstChild.remove();
    }
})




  



    













            
        
    
    



    















    
    

    
    

