package es31pag136;

public class Commento {
	
	private String commento;
	private String idC;
	private String titoloC;
	
	public Commento(String commento, String idC, String titoloC) {
		super();
		this.commento = commento;
		this.idC = idC;
		this.titoloC = titoloC;
	}

	public String getCommento() {
		return commento;
	}

	public void setCommento(String commento) {
		this.commento = commento;
	}

	public String getIdC() {
		return idC;
	}

	public void setIdC(String idC) {
		this.idC = idC;
	}

	public String getTitoloC() {
		return titoloC;
	}

	public void setTitoloC(String titoloC) {
		this.titoloC = titoloC;
	}

	@Override
	public String toString() {
		return "Commento [commento=" + commento + ", idC=" + idC + ", titoloC=" + titoloC + "]";
	}
	
	

}
