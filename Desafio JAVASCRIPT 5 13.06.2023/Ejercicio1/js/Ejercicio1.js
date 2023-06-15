
document.getElementById("miFormulario").addEventListener("submit", function (calcular) {
    calcular.preventDefault();
    calcular.stopPropagation();

    var costoFijo = parseFloat(document.getElementById("input1").value);
    var precioDeVenta = parseFloat(document.getElementById("input2").value);
    var costosVAriables = parseFloat(document.getElementById("input3").value);

    if (!isNaN(costoFijo) && !isNaN(precioDeVenta) && !isNaN(costosVAriables)) {
        var cv = costoFijo / (precioDeVenta - costosVAriables);
        var cvRedondeo = cv.toFixed(2);
        var div = document.getElementById("resultado");
        div.classList.add("mt-2", "text-center", "fw-bold", "fs-6", "text-primary", "text-uppercase",);
        document.getElementById("resultado").innerHTML = "El punto de equilibrio es: " + cvRedondeo;
    }else{
        alert("todos los campos son obligaorios")
    }
        


});



        
        
        
        
    
 


