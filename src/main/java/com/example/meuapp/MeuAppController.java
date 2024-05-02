package com.example.meuapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class MeuAppController {

    @GetMapping("/")
    public String home() throws IOException {
        Resource resource = new ClassPathResource("static/index.html");
        byte[] bytes = Files.readAllBytes(Paths.get(resource.getURI()));
        return new String(bytes);
    }
}
