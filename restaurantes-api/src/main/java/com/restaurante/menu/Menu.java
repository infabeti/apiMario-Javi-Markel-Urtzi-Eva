package com.restaurante.menu;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ch.qos.logback.core.net.ObjectWriter;
import com.restaurante.menu.Plato;

public class Menu {
	private Plato[] Primeros;
	private Plato[] Segundos;
	private Plato[] Postres;
	
	public Menu(Plato[] primeros, Plato[] segundos, Plato[] postres) {
		Postres = postres;
		Primeros = primeros;
		Segundos = segundos;
	}

	public Plato[] getPrimeros() {
		return Primeros;
	}

	public void setPrimeros(Plato[] primeros) {
		Primeros = primeros;
	}

	public Plato[] getSegundos() {
		return Segundos;
	}

	public void setSegundos(Plato[] segundos) {
		Segundos = segundos;
	}

	public Plato[] getPostres() {
		return Postres;
	}

	public void setPostres(Plato[] postres) {
		Postres = postres;
	}

	@Override
	public String toString() {
		return "Menu [Primeros=" + Arrays.toString(Primeros) + ", Segundos=" + Arrays.toString(Segundos) + ", Postres="
				+ Arrays.toString(Postres) + "]";
	}
	
	


}
