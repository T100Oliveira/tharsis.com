package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)	

private long id;

private double preço;

private String nome;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public double getPreço() {
	return preço;
}

public void setPreço(double preço) {
	this.preço = preço;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

}
