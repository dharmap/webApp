package webApp.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
	
	private List<String> dataList = new ArrayList<String>(Arrays.asList("Sunny Leone", "Miya KAhlifa", "Rakhi Sawanth"));
	
	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
	
	@RequestMapping("/6")
    public String subindex() {
        return "Greetings 6 from Spring Boot!";
    }
	
	@RequestMapping("/getData")
	public Data getData(@RequestParam(value="id", defaultValue="0") Integer id){
		return new Data(id, dataList.get(id));
	}
	
}
