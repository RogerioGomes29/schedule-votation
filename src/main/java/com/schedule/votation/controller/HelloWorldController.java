package com.schedule.votation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//ESSA ANOTAÇÃO ABAIXO SERVE PARA DIZER QUE NOSSA CLASSE É UM CONTROLADOR DE REQUISIÇÃO.
@RestController
//ESSA ANOTAÇÃO ABAIXO SERVE PARA MAPEARMOS O CAMINHO DA NOSSA CONTROLLER
@RequestMapping("/hello")
public class HelloWorldController {

  //ESSA ANOTAÇÃO ABAIXO SERVE PARA ESPECIFICARMOS UMA REQUISIÇÃO DE BUSCA.
  @GetMapping
  public String helloWorld(){
    return "Hello World";
  }
}
