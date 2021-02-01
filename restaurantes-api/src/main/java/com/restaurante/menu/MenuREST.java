package com.restaurante.menu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/")
public class MenuREST {
	ObjectMapper mapper = new ObjectMapper();
	
	//@GetMapping //localhost:8080/
	@RequestMapping(value="menu", method=RequestMethod.GET)
	public String GetMenu(int menuid) throws JsonProcessingException
	{
		Menu menu1 = new Menu(2,1,3);
		menu1.SetPrimero(0, "Tremenda ensalada", 4.5f);
		menu1.SetPrimero(1, "Tremenda sopa", 7f);
		menu1.SetSegundo(0, "Tremenda paella", 10f);
		menu1.SetPostre(0, "Tremendo arroz con leche", 3.22f);
		menu1.SetPostre(1, "Tremendo corneto", 1.5f);
		menu1.SetPostre(2, "Tremenda manzana", 0.5f);
		return mapper.writeValueAsString(menu1);
	}
}
