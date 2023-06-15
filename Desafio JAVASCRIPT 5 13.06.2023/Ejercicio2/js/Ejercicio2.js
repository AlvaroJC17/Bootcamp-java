

const creacionDiv = document.getElementById("b1"); // se obtiene info del boton
const contenedorDiv = document.getElementById("b2"); // se obtiene info del contendor "b2"
const divBody = document.getElementById("divBody"); //contenedor donde se va imprimir los resultados
const botonReset = document.getElementById("botonReset"); // se obtiene datos del boton para reset


var contadorEliminador = 0;

// funcion para crear los div mediante el boton + y guardarlos todos dentro de otro div contenedor
creacionDiv.addEventListener("click", function (event) {
    event.preventDefault();
    event.stopPropagation();

    let divContenedor = document.createElement("div");
    divContenedor.classList.add("row", "container-fluid");
    divContenedor.id = "eliminador" + contadorEliminador;

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
    botonEliminador.onclick = function(){
        contenedorDiv.removeChild(divContenedor);
    }
    
    divContenedor.appendChild(inputTexto);
    divContenedor.appendChild(inputPorcentaje);
    divContenedor.appendChild(botonEliminador);
    contenedorDiv.appendChild(divContenedor);

    contadorEliminador++;
});

// Funcion para obtener los nombres de las categorias, el valor del presupuesto y los valores de porcentaje

const datosObtenidos = document.getElementById("miFormulario").addEventListener("submit", function (event2) {
    event2.preventDefault();

    let presupuesto = parseFloat(document.getElementById("input1").value);
    const valorCategoria = document.getElementsByClassName("valorOpciones");
    let valorPorcentaje = document.getElementsByClassName("valorPorcentaje");

    let porcentaje = 0;
    let validacionPorcentaje = 0;
    let contador = 0;
    let redondeoPorcentaje = 0;

    // Validacion para que el total de porcentajes no pase el 100%
    for (let y = 0; y < valorPorcentaje.length; y++) {
        validacionPorcentaje += parseFloat(valorPorcentaje[y].value);
    }

    // Bucle para recoorrer los arrays de datos1 y datos2
    for (let i = 0; i < valorCategoria.length; i++) {

        contador++;
        const identificadorDiv = "resultado" + contador; // se crea id del div dinamico

        if (!isNaN(presupuesto) && valorCategoria[i].value != "" && valorPorcentaje[i].value != "") {

            if (validacionPorcentaje > 0 && validacionPorcentaje <= 100) {
                porcentaje = presupuesto * (parseFloat(valorPorcentaje[i].value) / 100); // se convierte el porcentaje y se calcula el presupuesto.
                redondeoPorcentaje = porcentaje.toFixed(2);

                // se crea objeto con todas los valores
                const objetoOpciones = { Categoria: valorCategoria[i].value, Porcentaje: valorPorcentaje[i].value, Presupuesto: redondeoPorcentaje };

                // se imprime en pantalla con los valores de los objetos usando la funcion de impresion "impresionPantalla"
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

// funcion para crear div e imprimir en pantalla el resultado  
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
    
  



    













            
        
    
    



    















    
    

    
    

