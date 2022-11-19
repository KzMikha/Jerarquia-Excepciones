package exception;
/**
 *
 * @author Erick
 */
public class ArenaAgotadaException extends  
    MaterialAgotadoException{
       public ArenaAgotadaException()
       {
        super("No hay arena en el almacen o ya se agotó");      
    }
          public ArenaAgotadaException(String mensaje)
       {
        super(mensaje);      
    }
  }
