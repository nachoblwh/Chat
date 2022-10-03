package Chat;

public class Mensaje 
{
	private String idCliente;
	private String mensaje;
	
	
	public Mensaje(String idCliente, String mensaje) 
	{
		this.idCliente = idCliente;
		this.mensaje = mensaje;
	}


	@Override
	public String toString() 
	{
		return "Mensaje [idCliente=" + idCliente + ", mensaje=" + mensaje + "]";
	}
	
	
	
	
}
