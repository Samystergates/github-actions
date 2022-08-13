package shedular.example.springSch.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
//@EnableAsync
public class EmSch {

	
	@Autowired
	ThreadPoolTaskScheduler threadPoolTaskScheduler;
	
	//@Scheduled(fixedDelay = 1000)
	//@Scheduled(fixedRate = 1000)
	//@Scheduled(fixedRateString = "PT02S")
	@Scheduled(cron = "${cron.expression.value}")
	public void schedular() throws InterruptedException {
		
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
		String formattedDT = current.format(format);
		log.info("Schedular time "+ formattedDT);
		//Thread.sleep(1000);
		
	}
	
	public void noOfThreads() {
		
	 threadPoolTaskScheduler.setPoolSize(3);
	}
	
}
