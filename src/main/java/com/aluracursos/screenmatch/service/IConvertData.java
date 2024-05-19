package com.aluracursos.screenmatch.service;

public interface IConvertData {
    <T> T DataGet(String json, Class<T> classData);
}
