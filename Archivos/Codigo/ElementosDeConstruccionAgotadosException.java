package exception;
/**
 *
 * @author Erick
 */
public class ElementosDeConstruccionAgotadosException extends  
    Exception{
       public ElementosDeConstruccionAgotadosException()
       {
        super("Hay un elemento que que no se encuentra o ya se agotó");      
    }
          public ElementosDeConstruccionAgotadosException(String mensaje)
       {
        super(mensaje);      
    }
  }
