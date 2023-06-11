
var alternativas = [[150000, 30, 0.15], [300000, 180, 0.10], [485000, 60, 0.23]];
var intereseGenerado =  [[150000, 30, 0.15], [300000, 180, 0.10], [485000, 60, 0.23]];


for (let i = 0; i < alternativas.length; i++) {
  intereseGenerado[i].push((alternativas[i][0]*alternativas[i][1]*alternativas[i][2])/100);
}


console.log(intereseGenerado);

    
   
