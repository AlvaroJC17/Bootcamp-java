
import '../estilos-css/testimonios.css';

function Testimonios(props) {
    return (<>
        <div className="testimonios-general">

            <img className="testimonios-img" src={props.imagenSrc} alt="foto de persona" />

            <div className="testimonios-card">
                <p className="testimonio-nombre"><strong>{props.nombre}</strong> in {props.pais}</p>
                <p className="testimonio-cargo">{props.cargo} at <strong>{props.empresa}</strong></p>
                <p className="testimonio-texto">{'"' + props.texto + '"'}</p>
            </div>
        </div>
    </>)
}
export default Testimonios;




