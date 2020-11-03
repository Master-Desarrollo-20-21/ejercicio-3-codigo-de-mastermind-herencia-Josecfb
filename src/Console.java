import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Console {
	
	private static BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

	public String inString (String question)
	{
		String entrada = null;
		try 
		{
			this.out(question);
			entrada = b.readLine();
		}
		catch (Exception e) 
		{		
			this.salir();		
		}
		return entrada;
	}
	
	public void out (String salida)
	{
		System.out.print(salida);
	}
	
	
	private void salir ()
	{
		System.out.println("ERROR de entrada/salida");
		System.exit(0);
	}

}
