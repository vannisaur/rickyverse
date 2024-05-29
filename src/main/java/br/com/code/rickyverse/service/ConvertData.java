package br.com.code.rickyverse.service;

import br.com.code.rickyverse.models.Characters;
import br.com.code.rickyverse.models.Episodes;
import br.com.code.rickyverse.models.Locations;
import br.com.code.rickyverse.models.Resources;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConvertData {

    @Autowired
    private ObjectMapper objectMapper = new ObjectMapper();

    public Characters convertJsonToCharacters(String json) {
        try {
            return objectMapper.readValue(json, Characters.class);
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert JSON to Characters", e);
        }
    }

    public Resources convertJsonToResources(String json) {
        try {
            return objectMapper.readValue(json, Resources.class);
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert JSON to Resources", e);
        }
    }

    public Locations convertJsonToLocations(String json) {
        try {
            return objectMapper.readValue(json, Locations.class);
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert JSON to Resources", e);
        }
    }

    public Episodes convertJsonToEpisodes(String json) {
        try {
            return objectMapper.readValue(json, Episodes.class);
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert JSON to Resources", e);
        }
    }
}
