package br.com.code.rickyverse.controller;

import br.com.code.rickyverse.client.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class RickverseController {

    private final RestClient apiService;

    @Autowired
    public RickverseController(RestClient apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/resources")
    public Mono<String> getExternalData() {
        return apiService.getData();
    }

/*    @PostMapping("/data")
    public Mono<String> postExternalData(@RequestBody Object data) {
        return apiService.postData(data);
    }*/
}