package net.cj.payroll.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafLayoutTest {

	@GetMapping("/test/main")
	public String main() {
		return "test/main";
	}
}
