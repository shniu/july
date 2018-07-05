package info.chaintech.july;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class JulyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JulyApplication.class, args);
		log.info("July 服务启动成功 ...");
	}
}