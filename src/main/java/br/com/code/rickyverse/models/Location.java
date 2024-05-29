package br.com.code.rickyverse.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Location {
    private Integer id;
    private String name;
    private String type;
    private String dimension;
    private List<String> residents;
    private String url;
    private String created;
}
