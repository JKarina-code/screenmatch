package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.model.SerieData;
import com.aluracursos.screenmatch.service.ApiSeries;
import com.aluracursos.screenmatch.service.ConvertData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var ApiUse = new ApiSeries();
        var json = ApiUse.DataGet("https://www.omdbapi.com/?t=game+of+thrones&apikey=4fc7c187");
        ConvertData converter = new ConvertData();
        SerieData  data = converter.DataGet(json, SerieData.class);
        System.out.println(data);

    }
}
