import Image from 'next/image'
import styles from './page.module.css'
import Testimonios from '../app/componentes/testimonios'
import Testimoniosjs from "../objetosjs/testimoniosjs"

export default function Home() {
  return (

    <div className='app'>

      <div className='contenedor-principal'>

        <h1>Here is what our alumni say about freeCodeCamp:</h1>

        <Testimonios
          imagenSrc = {Testimoniosjs.imagenSrc} /* PRUEBA DE IMPORTACION DE UN OBJETO DE JS COMO PROPS DE UN COMPONENTE*/
          nombre = {Testimoniosjs.nombre}
          pais = {Testimoniosjs.pais}
          cargo = {Testimoniosjs.cargo}
          empresa = {Testimoniosjs.empresa}
          texto = "It's scary to change careers. I only gained confidence that I could code by working through the hundreds of hours of free lessons on freeCodeCamp. Within a year I had a six-figure job as a Software Engineer. freeCodeCamp changed my life."
        ></Testimonios>

         <Testimonios
          imagenSrc="/imagenes/Sarah.png"
          nombre="Sarah Chima"
          pais="Nigeria"
          cargo="Software Engineer"
          empresa="ChatDesk"
          texto="freeCodeCamp was the gateway to my career as a software developer. The well-structured curriculum took my coding knowledge from a total beginner level to a very confident level. It was everything I needed to land my first dev job at an amazing company."
        ></Testimonios>

         <Testimonios
          imagenSrc="/imagenes/Emma.png"
          nombre="Emma Bostian"
          pais="Sweden"
          cargo="Software Engineer"
          empresa="Spotify"
          texto="I've always struggled with learning JavaScript. I've taken many courses but freeCodeCamp's course was the one which stuck. Studying JavaScript as well as data structures and algorithms on freeCodeCamp gave me the skills and confidence I needed to land my dream job as a software engineer at Spotify."
        ></Testimonios>

      </div>
    </div>



  )
}
