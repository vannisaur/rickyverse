package br.com.code.rickyverse.controller;

import br.com.code.rickyverse.client.RickyverseClient;
import br.com.code.rickyverse.models.Characters;
import br.com.code.rickyverse.models.Episodes;
import br.com.code.rickyverse.models.Locations;
import br.com.code.rickyverse.models.Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class RickyverseController {

    private final RickyverseClient rickyverse;

    @Autowired
    public RickyverseController(RickyverseClient rickyverse) {
        this.rickyverse = rickyverse;
    }

    @GetMapping("/resources")
    public Mono<Resources> getResources() {
        return rickyverse.getResources();
    }

    @GetMapping("/characters")
    public Mono<Characters> getCharacters() {
        return rickyverse.getCharacters();
    }

    @GetMapping("/locations")
    public Mono<Locations> getLocations() {
        return rickyverse.getLocations();
    }

    @GetMapping("/episodes")
    public Mono<Episodes> getEpisodes() {
        return rickyverse.getEpisodes();
    }

//    @PostMapping("/data")
//    public Mono<String> postExternalData(@RequestBody Object data) {
//        return apiService.postData(data);
//    }
}