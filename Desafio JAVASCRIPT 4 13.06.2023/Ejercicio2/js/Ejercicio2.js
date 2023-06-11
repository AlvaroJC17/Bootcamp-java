


var alternativas = [[150000, 30, 0.15], [300000, 180, 0.10], [485000, 60, 0.23], [188000, 40, 0.30], [999000, 80, 0.35]];


function arrayInteres(parametros){
var intereseGenerado = [[]];
intereseGenerado = parametros;
for (let i = 0; i < parametros.length; i++) {
  intereseGenerado[i].push("[" + (parametros[i][0]*parametros[i][1]*parametros[i][2])/100 + "]" + " ");
}
console.log(intereseGenerado);

}

/*Llamado a la funcion*/ 
arrayInteres(alternativas);


