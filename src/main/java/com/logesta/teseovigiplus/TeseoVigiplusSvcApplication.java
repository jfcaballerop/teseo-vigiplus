package com.logesta.teseovigiplus;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class TeseoVigiplusSvcApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(TeseoVigiplusSvcApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "9010"));
        app.run(args);
       }

}
