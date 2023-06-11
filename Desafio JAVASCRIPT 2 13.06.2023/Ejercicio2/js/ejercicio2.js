
document.getElementById("miFormulario").addEventListener("submit", function(event) {
    event.preventDefault();
    event.stopPropagation

    var usser = document.getElementById("input1").value;
    var pass = document.getElementById("input2").value;

    if (usser == "admin" && pass == "1234" && usser != "" && pass != "") {
        alert("Bienvenido!!!")
        console.log("Bienvenido!!!")
    } else {
        alert("Credenciales incorrectas o faltantes...")
        console.log("Credenciales incorrectas o faltantes...")
    }
});

// Nota: se imprime a drede por alert y consola para mostrar el resultado por dos vias diferentes





