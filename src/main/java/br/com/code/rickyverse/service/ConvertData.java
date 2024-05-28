package br.com.code.rickyverse.service;

import br.com.code.rickyverse.models.Resources;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class ConvertData {
    public Resources convertJsonToResources(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(json, Resources.class);
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert JSON to Resources", e);
        }
    }
}
