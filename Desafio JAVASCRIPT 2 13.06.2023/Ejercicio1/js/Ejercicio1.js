



function validacionEdad(){
    var edad = parseInt(document.getElementById("input1").value);

   if (edad > 18) {
    alert("Bienvenido!!!");
    console.log("Bienvenido!!!");
   } else if(edad > 0 && edad <= 18){
    alert("No cumple la edad requerida");
    console.error("No cumple la edad requerida");
   }
    
}

// Nota: se imprime a drede por alert y consola para mostrar el resultado por dos vias diferentes




