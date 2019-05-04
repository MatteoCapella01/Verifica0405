package es31pag136;

public class Test {

	public static void main(String[] args) {
		
		Giornale al =new giornale();
		
		//String autore, String libro, int anno, String editore
		News  l1 = new News("","","");
		News  l2 = new News("","","");
		News  l3 = new News("","","");
		News  l4 = new News("","","");
		try {
		
			al.aggiunta(l1);
			al.aggiunta(l2);
			al.aggiunta(l3);
			al.aggiunta(l4);
		
		stampa_giornale();
		al.ric_autore("");
		System.out.println(al.num_libri());
		al.ricerca("");
		}
		
		catch(GiornaleException exc) {
			System.out.println(exc.getMessage());
		}
		
		catch(NullPointerException exc) {
			System.out.println("La ricerca e' conclusa");
		}
		catch(Exception exc) {
			System.out.println("Programma terminato improvvisamente");
		}
	}

}
