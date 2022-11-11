package net.cj.payroll.config;

import static org.junit.jupiter.api.Assertions.*;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;
import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
class JasyptTest {

	@Test
	void test() {
		//given
		String planinText = "jdbc:log4jdbc:postgresql://localhost:5432/postgres";
		
		PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
		SimpleStringPBEConfig config = new SimpleStringPBEConfig();
		config.setPassword(System.getProperty("jasypt.encryptor.password"));
		config.setAlgorithm("PBEWithMD5AndDES");
		config.setKeyObtentionIterations("1000");
		config.setPoolSize("1");
		config.setProviderName("SunJCE");
		config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
		config.setStringOutputType("base64");
		encryptor.setConfig(config);
		
		//when
		String encyptText = encryptor.encrypt(planinText);
		log.debug("@@ encyptText: " + encyptText);
		String decryptText = encryptor.decrypt(encyptText);
		log.debug("@@ decryptText: " + decryptText);
		
		//then
		assertThat(planinText).isEqualTo(decryptText);
	}

}
