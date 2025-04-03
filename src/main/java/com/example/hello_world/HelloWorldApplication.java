package com.example.hello_world;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {

		WebClient client = WebClient.builder()
				.exchangeStrategies(ExchangeStrategies.builder().codecs(c ->
						c.defaultCodecs().enableLoggingRequestDetails(true)).build()
				)
				.baseUrl("https://httpbin.org")
				.build();

		client.get()
					.uri("/get")
				    .accept(APPLICATION_JSON)
					.header("my-header","value")
					.retrieve()
				    .bodyToMono(String.class)
				    .subscribe(System.out::println);

	}

}
