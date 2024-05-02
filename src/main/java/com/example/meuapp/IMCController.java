package com.example.meuapp;

import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;

@RestController
@RequestMapping("/imc")
public class IMCController {

    @GetMapping
    public String calcularIMC(@RequestParam("peso") double peso, @RequestParam("altura") double altura){
        double imc = peso / (altura * altura);

        DecimalFormat df = new DecimalFormat("#.##");
        String imcFormatado = df.format(imc);

        return imcFormatado;
    }

}
