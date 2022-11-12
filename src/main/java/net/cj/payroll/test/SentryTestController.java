package net.cj.payroll.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.sentry.Sentry;

@Controller
public class SentryTestController {

	@GetMapping("/test/sentry")
	public String test() {
		try {
			  throw new Exception("This is a test.");
			} catch (Exception e) {
			  Sentry.captureException(e);
			}
		return "test";
	}
}
