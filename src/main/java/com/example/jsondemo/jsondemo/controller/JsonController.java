package com.example.jsondemo.jsondemo.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Paths;

@RestController
public class JsonController {
    private static String FILE_PATH = "src/main/resources/files";

    @GetMapping("/json_sample")
    private void getJsonSample() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree(Paths.get(FILE_PATH, "part_number.json").toFile());
        System.out.println(json);
    }
}
