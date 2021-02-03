package com.restaurante.menu;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.restaurante.menu.Menu;

@RestController
@RequestMapping("/")
@CrossOrigin(origins="http://localhost:8000")
public class MenuREST {
	ObjectMapper mapper = new ObjectMapper();
	MenuLista ML = new MenuLista();
	
	//@GetMapping //localhost:8080/
	@RequestMapping(value="menu", method=RequestMethod.GET)
	public String GetMenu(int menuid) throws JsonProcessingException
	{
		System.out.println(menuid);
		return mapper.writeValueAsString(ML.GetMenu(menuid));
	}
}
