
import "../hojas-de-estilos/boton.css"

function Boton(props){

    const esOperdaor = valor => {
        return isNaN(valor) && (valor != '.') && (valor != '=');
    }

return(

    <div className={`boton-contenedor ${esOperdaor(props.children) ? "operador" : ""}`.trimEnd()}
    onClick={() => props.manejarClick(props.children)}> 
    {props.children}

    </div>
// la sintaxis () => crea una funcion anonima que llama a la funcion manejarclick, sino se hace esto no funcionaria

)

}

export default Boton;