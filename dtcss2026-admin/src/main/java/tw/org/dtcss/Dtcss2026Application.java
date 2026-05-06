package tw.org.dtcss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan("tw.org.dtcss")
@EnableCaching
@EnableScheduling
@SpringBootApplication
public class Dtcss2026Application {
	public static void main(String[] args) {
		SpringApplication.run(Dtcss2026Application.class, args);
	}
}
