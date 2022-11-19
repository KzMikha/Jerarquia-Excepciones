package exception;
/**
 *
 * @author Erick
 */
public class JuntasAgotadasException extends  
    PiezaDePlomeriaAgotadaException{
       public JuntasAgotadasException()
       {
        super("La pieza no se encuentra o ya se agotó");      
    }
          public JuntasAgotadasException(String mensaje)
       {
        super(mensaje);      
    }
  }
