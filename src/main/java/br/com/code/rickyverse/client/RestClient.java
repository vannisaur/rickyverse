package br.com.code.rickyverse.client;

import br.com.code.rickyverse.models.Resources;
import br.com.code.rickyverse.service.ConvertData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class RestClient {

    private final WebClient webClient;
    @Autowired
    private ConvertData convertData;

    public RestClient(WebClient webClient) {
        this.webClient = webClient;
    }


    public Mono<Resources> getData() {
        return webClient.get()
                .uri("https://rickandmortyapi.com/api")
                .retrieve()
                .bodyToMono(String.class)
                .map(convertData::convertJsonToResources);
    }

    public Mono<String> postData(Object data) {
        return webClient.post()
                .uri("/data")
                .bodyValue(data)
                .retrieve()
                .bodyToMono(String.class);
    }

}
