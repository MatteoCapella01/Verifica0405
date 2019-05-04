package es31pag136;

public class GiornaleException extends Exception
{
	private String messaggio = "Biblioteca piena";
	
	GiornaleException(){
		
	}
	
	public String getMessage()
	{
		return messaggio;
	}
}
