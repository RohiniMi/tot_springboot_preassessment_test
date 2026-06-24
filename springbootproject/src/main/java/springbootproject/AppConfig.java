package springbootproject;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
@Configuration
public class AppConfig {
	@Bean
	public Employee employee() {
		return new Employee();
	}

}
