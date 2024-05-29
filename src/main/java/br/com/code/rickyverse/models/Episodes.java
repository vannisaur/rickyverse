package br.com.code.rickyverse.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Episodes {
    private Info info;
    private List<Episode> results;
}
