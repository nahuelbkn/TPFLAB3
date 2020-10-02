package Json;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONArray;


/**
 * <p><b><i>JsonUtiles</i></b></p>
 * <pre>public class JsonUtiles</pre>
 * @author Los profes de Programaci�n y Laboratorio de Computaci�n III - UTN FRMDP
 */

public class JsonUtiles 
{		
		/**
		 * <p><b><i>grabar</i></b></p>
		 * <pre>public static void grabar (JSONArray array)</pre>
		 * <p>Este m�todo graba un <code>JSONArray</code> en un archivo "<code>.json</code>". </p>
		 * @param array Recibe el JSONArray a guardar. 
		 * @author Los profes de Programaci�n y Laboratorio de Computaci�n III - UTN FRMDP
		 */
		public static void grabar(JSONArray array)
		{
			try {
				FileWriter file = new FileWriter("ListadoDeEmpleadores.json");
				
				file.write(array.toString());
				file.flush();
				file.close();

			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

		
		/**
		 * <p><b><i>leer</i></b></p>
		 * <pre>public static String leer ()</pre>
		 * <p>Este m�todo lee un archivo "<code>.json</code>" y lo retorna en formato <code>String</code>. </p>
		 * @return Retorna un <code>String</code> con la informaci�n del archivo.
		 * @author Los profes de Programaci�n y Laboratorio de Computaci�n III - UTN FRMDP
		 */
		public static String leer() 
		{
			String contenido = "";
			try 
			{
				contenido = new String(Files.readAllBytes(Paths.get("ListadoDeEmpleadores.json")));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			return contenido;
		}
}
