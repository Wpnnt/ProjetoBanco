package banco.com.br.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HellowController {
	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello World!!!";
	}

}
