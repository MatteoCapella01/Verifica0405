package es31pag136;

public class Giornale {
	

	private News Giornale[];
	private char[] toString;
	static private int Nmax=1000;
	
	public Giornale() {
		
		Giornale = new News[Nmax];
	}

	public News[] getGiornale() {
		return Giornale;
	}

	public void setGiornale(News[] gironale) {
		this.Giornale = Giornale;
	}
	
	public static int getNmax() {
		return Nmax;
	}

	public static void setNmax(int nmax) {
		Nmax = nmax;
	}

	public void aggiunta(News gt) throws GiornaleException 
	{
			int i;
			for(i=0;i<Nmax;i++) {
			
				if(Giornale[i]==null) {
				
					Giornale[i]=gt;
					break;}
				}				
				if(i==Nmax-1)
					throw new GiornaleException();
		}
		
	public void stampa_Giornale() 
	{		int i;
			for(i=0;i<Nmax;i++) {
	try {		 
				Giornale[i].toString();
		}				
	catch(NullPointerException) { 
		
		System.out.println("");
	}

	
	public void ricerca(String nm) throws NullPointerException {
		
		int i;
		for(i=0;i<Nmax;i++) {
	try {		
			if(Giornale[i].getTitolo().equals(nm)) {
				
				Giornale[i].toString();				
			} 		
		
	System.out.println("fine ricerca per titolo")
	}
		catch() { System.out.println("");
	
	}
	
	
	public void ric_articolo(String au) throws NullPointerException {
		
		int i;

		for(i=0;i<Nmax;i++) {
			
			if(Giornale[i].getArticolo().equals(au)) {
				
				Giornale[i].toString();		
				
			}
		}
	}
	
	public int num_news() {
		
		int f=0;
		for(News a:Giornale) {
			
			if(a==null) {
				
				f++;
			}
		}
		return f;
	}
}
