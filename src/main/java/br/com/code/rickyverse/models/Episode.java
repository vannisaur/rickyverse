package br.com.code.rickyverse.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Episode {
    private Integer id;
    private String name;
    private String air_date;
    private String episode;
    private List<String> characters;
    private String url;
    private String created;
}
