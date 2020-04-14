package small.code.pratice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import small.code.pratice.array.ProcessQueries;

@SpringBootApplication
public class PraticeJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PraticeJavaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Spring boot console app.");
			new ProcessQueries().processQueries(new int[] {3,1,2,1}, 5);
		};
	}

}
