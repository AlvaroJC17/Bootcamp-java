
import "../css/styles.css"
import "../css/button.css"

function Boton({ texto, esBotonDeClick, manejarClick }) { //sintaxis de destructuracion, no se coloca props sino la propiedad que queremos pasar dentro de una llaves, funciona como si pasaramos un argumento a la funcion
    return (
        <button
            className={esBotonDeClick ? "boton-click" : "boton-reiniciar"}
            onClick={manejarClick} >
            {texto}
        </button>
    )
}

export default Boton;








