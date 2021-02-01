package com.restaurante.menu;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ch.qos.logback.core.net.ObjectWriter;

public class Menu {
	private Plato[] Primeros;
	private Plato[] Segundos;
	private Plato[] Postres;
	
	public Menu(int SizePrimeros,int SizeSegundos,int SizePostres)
	{
		Primeros = new Plato[SizePrimeros];
		Segundos = new Plato[SizeSegundos];
		Postres = new Plato[SizePostres];
	}
	
	public void SetPrimero(int pos,String nombre, float precio)
	{
		Primeros[pos] = new Plato(nombre,precio);
	}
	
	public void SetSegundo(int pos,String nombre, float precio)
	{
		Segundos[pos] = new Plato(nombre,precio);
	}
	
	public void SetPostre(int pos,String nombre, float precio)
	{
		Postres[pos] = new Plato(nombre,precio);
	}
	
	public String toJson()
	{
		ObjectMapper mapper = new ObjectMapper();
		String json="Error";
		try {
			json = mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}

	public Plato[] getPrimeros() {
		return Primeros;
	}

	public Plato[] getSegundos() {
		return Segundos;
	}

	public Plato[] getPostres() {
		return Postres;
	}
	
	
}
