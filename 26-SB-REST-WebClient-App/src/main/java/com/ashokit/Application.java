package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.ashokit.bindings.Flights;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		WebClient webClient = WebClient.create(); //Creating webclient instance
		
		System.out.println("****** Rest Call - Start ***********");
		
		/*String response = webClient.get() //Represents Http Get Request
				 				   .uri("http://mu.mulesoft-training.com/essentials/united/flights/") //endpoint url
				 				   .retrieve() //retrieve response data from response body
				 				   .bodyToMono(String.class) //bind response data to string
				 				   .block(); //making call as synchronus
		*/
		
		  webClient.get() //Represents Http Get Request
				   .uri("http://mu.mulesoft-training.com/essentials/united/flights/") //endpoint url
				   .retrieve() //retrieve response data from response body
				   .bodyToMono(Flights.class) //bind response data to string
				   .subscribe(Application::handleFlightsResponse); //making call as synchronus
		
		System.out.println("***** Rest Call End ********");
		int i = 10;
		int j = 20;
		System.out.println("Sum :: "+ (i+j));
	}
	
	public static void handleFlightsResponse(Flights response) {
		System.out.println("************* Response Recieved ******************");
		System.out.println(response);
	}
}
