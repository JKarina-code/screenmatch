package com.aluracursos.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SerieData(String Title, Integer totalSeasons, String imdbRating) {
}
