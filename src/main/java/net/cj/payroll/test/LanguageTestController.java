package net.cj.payroll.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LanguageTestController {
	final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/test/language")
    public String test() {
		log.debug("############### test/language ##############");
        return "test/language";
    }
}
