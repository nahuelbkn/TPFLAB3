package Excepciones;


/**
 * <p><b><i>ExcepcionDeCampoVacio</i></b></p>
 * <pre>public class ExcepcionDeCampoVacio extends Exception</pre>
 * <p>Excepci�n que se arroja -como su nombre lo indica- cuando una funci�n pide la carga de un dato pero el usuario lo deja vac�o.</P>
 * <p>Esta excepci�n se usa solo a modo de prueba y demostraci�n, ya que el mismo caso se puede resolver de una manera mucho m�s simple.</p>
 * @author Yarossi, Candela & Trucco, Nahuel
 */
public class ExcepcionDeCampoVacio extends RuntimeException
{
	public ExcepcionDeCampoVacio()
	{
		// TODO (?
	}
	
	public ExcepcionDeCampoVacio(String mensaje)
	{
		super(mensaje);
	}
	
}
