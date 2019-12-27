package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // JSON/XML 타입의 HTTP 응답을 직접 리턴
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
}
