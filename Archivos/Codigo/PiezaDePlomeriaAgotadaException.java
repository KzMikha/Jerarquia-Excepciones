package exception;
/**
 *
 * @author Erick
 */
public class PiezaDePlomeriaAgotadaException extends  
    ElementosDeConstruccionAgotadosException{
       public PiezaDePlomeriaAgotadaException()
       {
        super("El material no se encuentra o ya se agotó");      
    }
          public PiezaDePlomeriaAgotadaException(String mensaje)
       {
        super(mensaje);      
    }
  }