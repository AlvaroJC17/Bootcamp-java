"use client"


import ListaDeTareas from "./componentes/ListaDeTareas";





export default function Home() {
  return (<>
  <div className='app'>
    
    <div className="freecodecamp-logo-contenedor">
      <img className="freecodecamp-logo" src="/imagenes/free.png" alt="logo de freecodecamp" />
    </div>

    <div className="tareas-lista-principal">
    <h1>Mis tareas</h1>
    <ListaDeTareas></ListaDeTareas>
 
    
    </div>

  </div>
   
   </>)
}






