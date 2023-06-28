"use client"

import Contador from "../app/componentes/Contador";
import Boton from "../app/componentes/Boton";
import { useState } from 'react';

export default function Home() {

  const [numClick, setNumClics] = useState(0);


  const click = () => {
    setNumClics(numClick + 1);
  }

  const reiniciar = () => {
    setNumClics(0);
  }

  return (<>
    <div className='app'>

      <div className='freecodecamp-logo-contenedor w-100 d-flex aling-items-center justify-content-center m-3  '>
        <img className='freecodecamp-logo w-50' src="/imagenes/free.png" alt="logo de freeCodeCamp" />
      </div>



      <div style={{}} className='contenedor-contador d-flex flex-column align-items-center flex-wrap justify-content-center'>

        <Contador
         numClick={numClick}>
        </Contador>


        <Boton
          texto="Click"
          esBotonDeClick={true}
          manejarClick={click}
        ></Boton>


        <Boton
          texto="Reiniciar"
          esBotonDeClick={false}
          manejarClick={reiniciar}
        ></Boton>

      </div>
    </div>

  </>)
}




