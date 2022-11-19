package exception;
/**
 *
 * @author Erick
 */
public class TubosAgotadosException extends  
    PiezaDePlomeriaAgotadaException{
       public TubosAgotadosException()
       {
        super("La pieza no se encuentra o ya se agotó");      
    }
          public TubosAgotadosException(String mensaje)
       {
        super(mensaje);      
    }
  }