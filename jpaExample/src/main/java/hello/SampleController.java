package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@ComponentScan("controller")
public class SampleController {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello world!";
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleController.class, args);
	}
}
