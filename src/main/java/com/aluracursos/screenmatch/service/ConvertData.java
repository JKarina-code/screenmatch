package com.aluracursos.screenmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertData implements IConvertData {
    private ObjectMapper maper = new ObjectMapper();

    @Override
    public <T> T DataGet(String json, Class<T> classData) {
        try {
            return maper.readValue(json, classData);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
