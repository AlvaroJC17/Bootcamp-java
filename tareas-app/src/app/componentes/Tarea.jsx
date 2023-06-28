import React from "react";
import "../../css-componentes/Tarea.css";
import {AiOutlineCloseCircle} from "react-icons/ai";

function Tarea({texto, completada, id, completarTarea, eliminarTarea}){
return(

<div className={completada ? "tarea-contenedor" : "tarea-contenedor completada"}>

<div className="tarea-texto" onClick={()=> completarTarea(id)}>
{texto}
</div>

<div className="tarea-contenedor-iconos" onClick={()=> eliminarTarea(id)}>
    <AiOutlineCloseCircle className="tarea-icono"/> 
</div>

</div>
);
}
export default Tarea;


