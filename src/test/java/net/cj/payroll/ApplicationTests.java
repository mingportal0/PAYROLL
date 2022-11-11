package net.cj.payroll;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApplicationTests {

	@Value("${test.env}")
    private String env;

	@Test
	void contextLoads() {
		System.out.println("@@ Test Environment : " + env);
		assertThat(env).isEqualTo("local");
	}

}
