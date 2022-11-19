package exception;
/**
 *
 * @author Erick
 */
public class MaterialAgotadoException extends  
    ElementosDeConstruccionAgotadosException{
       public MaterialAgotadoException()
       {
        super("El material no se encuentra o ya se agotó");      
    }
          public MaterialAgotadoException(String mensaje)
       {
        super(mensaje);      
    }
  }
