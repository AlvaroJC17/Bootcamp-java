
document.getElementById("miFormulario").addEventListener("submit", function (calcular) {
    calcular.preventDefault();
    calcular.stopPropagation();

    var costoFijo = parseInt(document.getElementById("input1").value);
    var precioDeVenta = parseInt(document.getElementById("input2").value);
    var costosVAriables = parseInt(document.getElementById("input3").value);
    var cv = costoFijo / (precioDeVenta - costosVAriables);
    var cvRedondeo = cv.toFixed(2);

    var div = document.getElementById("resultado");
    div.classList.add("mt-2", "text-center", "fw-bold", "fs-6", "text-primary", "text-uppercase",);
    document.getElementById("resultado").innerHTML = "El total de punto de equilibrio es: " + cvRedondeo;

});



        
        
        
        
    
 


