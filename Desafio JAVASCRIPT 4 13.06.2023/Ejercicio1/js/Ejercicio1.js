
document.getElementById("miFormulario").addEventListener("submit", function (evento) {
    evento.preventDefault();
    evento.stopPropagation();

    var valorInputs = document.getElementsByClassName("valorIput");
    calculoFlujoDeCaja(valorInputs);
});

function calculoFlujoDeCaja(flujoDeCaja) {

    var sumaIngresos = 0;
    var sumaEgresos = 0;

    for (let i = 0; i < flujoDeCaja.length; i++) {
        if (flujoDeCaja[i].value != "" && i % 2 == 0) {
            valorIngre = parseFloat(flujoDeCaja[i].value);
            sumaIngresos += valorIngre;

        } else if (flujoDeCaja[i].value != "" && i % 2 != 0) {
            valorEgre = parseFloat(flujoDeCaja[i].value);
            sumaEgresos += valorEgre;
        }
    }

    if (sumaIngresos > sumaEgresos) {
        console.log("1");
        alert("1");
    } else if (sumaIngresos == sumaEgresos) {
        console.log("0");
        alert("0");
    } else {
        console.log("-1")
        alert("-1");
    };
}

    

   
   
     

   


