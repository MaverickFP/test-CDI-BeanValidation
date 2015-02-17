package test.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Item {
	@NotNull
	private int id;
	@NotNull
	private String nome;
	@NotNull @Size(min=10,message="Taglia minima 10")
	private String descrizione;
	@NotNull @Min(value=8, message="valore minimo 8")
	private int prezzo;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(String nome) {
		super();
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	
	

}
