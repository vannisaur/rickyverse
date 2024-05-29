package br.com.code.rickyverse.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Character {
    private Integer id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private Map<String, String> origin;
    private Map<String, String> location;
    private String image;
    private List<String> episode;
    private String url;
    private String created;
}
