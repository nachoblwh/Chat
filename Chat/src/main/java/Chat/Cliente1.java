package Chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente1 {

	protected static final int PORT = 2000;

	public static void main(String[] args) 
	{
		ServerSocket socketServidor = null;
		Socket socketCliente = null;
		DataOutputStream OUT = null;
		DataInputStream IN= null;
		
		try {
			socketServidor = new ServerSocket(PORT);
			//espera hasta que el cliente acceda al servidor
			socketCliente = socketServidor.accept();
			//Flujo de salida de datos
			IN = new DataInputStream(socketCliente.getInputStream());
			OUT = new DataOutputStream(socketCliente.getOutputStream());
			OUT.writeUTF("Hola cliente conexion establecida");

			
			OUT.close();
			socketCliente.close();
			socketServidor.close();
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		} finally
		{
			if (OUT != null)
			{
				try 
				{
					OUT.close();
				}
				catch(IOException e) 
				{
					e.printStackTrace();
				}
				
			}
			if (socketCliente != null)
			{
				try 
				{
					socketCliente.close();
				}
				catch(IOException e) 
				{
					e.printStackTrace();
				}
				
			}
			if (socketServidor != null)
			{
				try 
				{
					socketServidor.close();
				}
				catch(IOException e) 
				{
					e.printStackTrace();
				}
				
			}
			
			
		}
	}

}
