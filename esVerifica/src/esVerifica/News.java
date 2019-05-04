package es31pag136;

public class News {
	
	private String articolo;
	private String id;
	private String titolo;
	
	public News(String articolo, String id, String titolo) {
		super();
		this.articolo = articolo;
		this.id = id;
		this.titolo = titolo;
	}

	public String getArticolo() {
		return articolo;
	}

	public void setArticolo(String articolo) {
		this.articolo = articolo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	@Override
	public String toString() {
		return "News [articolo=" + articolo + ", id=" + id + ", titolo=" + titolo + "]";
	}
	
	

	
}
	
	
