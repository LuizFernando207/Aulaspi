package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/evento/form")
public class Eventocontroller {
	public String form () {
		return "FormEvento";
	}

}
