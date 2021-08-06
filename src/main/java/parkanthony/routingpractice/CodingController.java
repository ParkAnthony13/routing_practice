package parkanthony.routingpractice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
	public String greeting() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping(value="/python", method=RequestMethod.GET)
	public String py() {
		return "Python/Django was awesome!";
	}
	@RequestMapping("/java")
	public String jav() {
		return "Java/Spring is better!";
	}
}
