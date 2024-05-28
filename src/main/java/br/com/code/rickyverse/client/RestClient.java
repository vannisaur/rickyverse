package br.com.code.rickyverse.client;

import br.com.code.rickyverse.models.Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class RestClient {

    private final WebClient webClient;

    public RestClient(WebClient webClient) {
        this.webClient = webClient;
    }


    public Mono<String> getData() {
        return webClient.get()
                .uri("https://rickandmortyapi.com/api")
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> postData(Object data) {
        return webClient.post()
                .uri("/data")
                .bodyValue(data)
                .retrieve()
                .bodyToMono(String.class);
    }
}
