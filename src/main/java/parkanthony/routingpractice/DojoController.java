package parkanthony.routingpractice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{language}")
	public String showLang(@PathVariable("language") String language) {
		String result = "";
		if(language.equals("dojo")) {
			result = "The dojo is awesome!";
		} else if (language.equals("burbank-dojo")) {
			result = "Burbank Dojo is located in Southern California";
		} else if (language.equals("san-jose")) {
			result = "SJ dojo is the headquarters";
		}
		return result;
	}
}
