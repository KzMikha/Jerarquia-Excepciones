package exception;
/**
 *
 * @author Erick
 */
public class CementoAgotadoException extends  
    MaterialAgotadoException{
       public CementoAgotadoException()
       {
        super("No hay cemento en el almacen o ya se agotó");      
    }
          public CementoAgotadoException(String mensaje)
       {
        super(mensaje);      
    }
  }