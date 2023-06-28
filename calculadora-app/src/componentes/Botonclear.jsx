import React from "react";
import "../hojas-de-estilos/boton-clear.css"

function Botonclear(props){
return(
<div className="boton-clear" 
onClick={props.manejarClear}>
{props.children}
</div>  
)
}
    
export default Botonclear;
