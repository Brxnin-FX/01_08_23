package com.example.model;

public class Tarefas {
	
	String name;
	String description;
	

	public Tarefas(String nomeTarefa, String descrição) {
		this.name = nomeTarefa;
		this.description = descrição;
	}
	
	
	public String getDescrição() {
		return description;
	}
	public void setDescrição(String descrição) {
		this.description = descrição;
	}
	
	
	@Override
	public String toString() {
		return "Tarefas [nomeTarefa=" + name + ", descrição=" + description + "]";
	}
	

}
