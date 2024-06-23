package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity



public class Usuario{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

private long id;

private String nome;

private String email;

private String senha;

private String agenda;
public String getAgenda() {
	return agenda;
}

public void setAgenda(String agenda) {
	this.agenda = agenda;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}



	
	
	
	
}