package curso.springboot.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // informa que é um controle MVC
public class IndexController {

	@RequestMapping("/") // Será mapeado para encontra a página index
	public String index() {
		return "index";
	}

}
