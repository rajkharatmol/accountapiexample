package code.codility.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!"; 
	}

}
