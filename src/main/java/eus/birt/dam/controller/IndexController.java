package eus.birt.dam.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping ("/admin")
public class IndexController {
	
	@Value ("${texto.indexcontroller.titulo}")
	private String textoIndex;
	
	@GetMapping({"/", ""})
	public String holaMundo() {
		return "index2";
	}

	@GetMapping ("/welcome")
	public String miHelloWord(Model model) {
		model.addAttribute("nombre",textoIndex);
		return "index3";
	}
	
	@GetMapping ("/welcome/{texto}")
	public String miHelloWord2(@PathVariable String texto,Model model) {
		model.addAttribute("texto",texto);
		return "index4";
	}
	
}
