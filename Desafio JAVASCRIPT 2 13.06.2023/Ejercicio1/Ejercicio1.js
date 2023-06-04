



function validacionEdad(){
    var edad = parseInt(document.getElementById("input1").value);

   if (edad >= 18) {
    alert("Bienvenido!!!");
    console.log("Bienvenido!!!");
   } else {
    alert("Su edad es menor a 18 años");
    console.log("Su edad es menor a 18 años")
   }
    
}

// Nota: se imprime a drede por alert y consola para mostrar el resultado por dos vias diferentes




