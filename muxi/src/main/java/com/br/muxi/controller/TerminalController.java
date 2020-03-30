package com.br.muxi.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.muxi.model.Terminal;

@RestController // Responsavel para determinar que meu controller trabalha com protocolo HTTP (RestFull)
@RequestMapping(value = "/api/v1") // Responsavel por mapear, rotas da aplica��o .
public class TerminalController {

	@PostMapping(path = "terminal", consumes = {"text/html; charset=utf-8"}, produces = {MediaType.APPLICATION_JSON_VALUE})     
	
	public String Conversor (String param){

		String [] dados = param.split(";");

		Terminal terminal = new Terminal();

		terminal.setLogic(Integer.parseInt(dados[0]));
		terminal.setSerial(dados[1]);
		terminal.setModel(dados[2]);
		terminal.setSam(Integer.parseInt(dados[3]));
		terminal.setPtid(dados[4]);
		terminal.setPlat(Integer.parseInt(dados[5]));
		terminal.setVersion(dados[6]);
		terminal.setMxr(Integer.parseInt(dados[7]));
		terminal.setMfx(Integer.parseInt(dados[8]));
		terminal.setVerfm(dados[9]);

		return terminal.toString();
	}
}
