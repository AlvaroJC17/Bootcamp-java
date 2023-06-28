"use client";


import Image from 'next/image';
import Boton from "../componentes/Boton";
import Pantalla from "../componentes/Pantalla";
import Botonclear from "../componentes/Botonclear";
import { useState } from 'react';
import { evaluate } from "mathjs"; // paquete que evalua cadenas de texto y resuelve operaciones matematicas si es posible


export default function Home() {

  const [input, setInput] = useState("");

  const agregarInput = (val) => { //funcion para agregar los caracteres a la pantalla
    setInput(input + val);
  };

  const borrar = () =>{ // funcion para borrar la pantalla
    setInput("");
  }

  const calcularResultado = () =>{ // funcion para calcular la suma
    if (input) { //si la cadena de texto es vacia entonces es igual a false y no se ejecuta de lo contrario es true y si se ejecuta
      setInput( evaluate(input));
    }else{
      alert("Ingrese valores para poder calcular")
    }
  };
      
  

  return (<>
  
<div className='app'>
  <div className='freecodecamp-logo-contenedor'>
    <img
     className='freecodecamp-logo'
     src="/imagenes/free.png"
     alt="logo de freeCodeCamp" />

  </div>

      <div className='contenedor-calculadora'>

        <Pantalla ingreso={input}></Pantalla>

        <div className='fila'>
          <Boton manejarClick ={agregarInput}>1</Boton>
          <Boton manejarClick ={agregarInput}>2</Boton>
          <Boton manejarClick ={agregarInput}>3</Boton>
          <Boton manejarClick ={agregarInput}>+</Boton>
        </div>
        <div className='fila'>
          <Boton manejarClick ={agregarInput}>4</Boton>
          <Boton manejarClick ={agregarInput}>5</Boton>
          <Boton manejarClick ={agregarInput}>6</Boton>
          <Boton manejarClick ={agregarInput}>-</Boton>
        </div>
        <div className='fila'>
          <Boton manejarClick ={agregarInput}>7</Boton>
          <Boton manejarClick ={agregarInput}>8</Boton>
          <Boton manejarClick ={agregarInput}>9</Boton>
          <Boton manejarClick ={agregarInput}>*</Boton>
        </div>
        <div className='fila'>
          <Boton manejarClick ={calcularResultado}>=</Boton>
          <Boton manejarClick ={agregarInput}>0</Boton>
          <Boton manejarClick ={agregarInput}>.</Boton>
          <Boton manejarClick ={agregarInput}>/</Boton>
        </div>
        <div className='fila'>
        <Botonclear manejarClear={borrar}>
         Clear
        </Botonclear>
        </div>

  </div>



</div>

  </>)
}
