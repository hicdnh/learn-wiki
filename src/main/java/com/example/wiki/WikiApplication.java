package com.example.wiki;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import sun.rmi.runtime.Log;


@SpringBootApplication
public class WikiApplication {

	private static final Logger logger = LoggerFactory.getLogger(WikiApplication.class);

	public static void main(String[] args) {
//		SpringApplication.run(WikiApplication.class, args);
		SpringApplication app = new SpringApplication(WikiApplication.class);
		Environment env = app.run(args).getEnvironment();
		logger.info("启动成功");
		logger.info(String.format("启动端口:  %s", env.getProperty("server.port")));
	}

}
