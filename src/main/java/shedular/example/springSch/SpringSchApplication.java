package shedular.example.springSch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableScheduling
@RestController
public class SpringSchApplication {

	public static void main (String[] args) {
		
		SpringApplication.run(SpringSchApplication.class, args);
		System.out.println("running");
	}
	
	@Bean
	public TaskScheduler taskScheduler() {
		
		ThreadPoolTaskScheduler threadPoolTaskSch = new ThreadPoolTaskScheduler();
		threadPoolTaskSch.setThreadNamePrefix("TPTS");
		return threadPoolTaskSch;
		
		
	}
	
	@GetMapping("/")
	public String welcome() {
		
		return "welcome to cicd";
	}
	
	@Bean
	public ThreadPoolTaskScheduler tPoolSch() {
		return new ThreadPoolTaskScheduler();
	}
	
	/*
	 * echo "# github-actions" >> README.md git init git add README.md git commit -m
	 * "first commit" git branch -M main git remote add origin
	 * https://github.com/Samystergates/github-actions.git git push -u origin main
	 */
}
