package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "     ◼ Mentalidade de Crescimento <br />"
				+ "  ◼ Persistência <br /> "
				+ "  ◼ Responsabilidade Pessoal<br />\r\n"
				+ "	 ◼ Orientação ao Futuro<br />\r\n"
				+ "  ◼ Comunicação<br />\r\n"
				+ "  ◼ Orientação ao Detalhe<br />\r\n"
				+ "	 ◼ Proatividade<br />\r\n";

		}
		
		@GetMapping("/objetivo")
		public String objetivo() {
			return " Os objetivos de aprendizagem dessa semana são:<br />"
					+ "Aprender mais a utilizar o SPRING <br />"
					+ "Utiliza-lo com o banco de dados <br />"
					+ "Aprender mais a utilizar o Mysql <br /> " ;
	}
}