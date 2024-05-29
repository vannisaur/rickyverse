package br.com.code.rickyverse.client;

import br.com.code.rickyverse.models.Characters;
import br.com.code.rickyverse.models.Episodes;
import br.com.code.rickyverse.models.Locations;
import br.com.code.rickyverse.models.Resources;
import br.com.code.rickyverse.service.ConvertData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class RickyverseClient {

    @Autowired
    private WebClient webClient;

    @Autowired
    private ConvertData convertData;

    public RickyverseClient(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<Resources> getResources() {
        return webClient.get()
                .uri("https://rickandmortyapi.com/api")
                .retrieve()
                .bodyToMono(String.class)
                .map(convertData::convertJsonToResources);
    }

    public Mono<Characters> getCharacters() {
        return webClient.get()
                .uri("https://rickandmortyapi.com/api/character")
                .retrieve()
                .bodyToMono(String.class)
                .map(convertData::convertJsonToCharacters);
    }

    public Mono<Locations> getLocations() {
        return webClient.get()
                .uri("https://rickandmortyapi.com/api/location")
                .retrieve()
                .bodyToMono(String.class)
                .map(convertData::convertJsonToLocations);
    }

    public Mono<Episodes> getEpisodes() {
        return webClient.get()
                .uri("https://rickandmortyapi.com/api/episode")
                .retrieve()
                .bodyToMono(String.class)
                .map(convertData::convertJsonToEpisodes);
    }

//    public Mono<String> postData(Object data) {
//        return webClient.post()
//                .uri("/data")
//                .bodyValue(data)
//                .retrieve()
//                .bodyToMono(String.class);
//    }
}
