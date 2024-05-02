package com.example.meuapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")

public class CalculadoraController {

    @GetMapping("/somar/{a}/{b}")
    public int somar (@PathVariable int a, @PathVariable int b ){
        return a + b;
    }
    @GetMapping("/subtrair/{a}/{b}")
    public int subtrair(@PathVariable int a, @PathVariable int b ){
        return a - b;
    }
    @GetMapping("/mutiplicar/{a}/{b}")
    public int mutiplicar(@PathVariable int a, @PathVariable int b ){
        return a * b;
    }
    @GetMapping("/dividir/{a}/{b}")
    public double dividir(@PathVariable int a, @PathVariable int b ){
        return (double) a / b;
    }
    @GetMapping("/potencializacao/{a}/{b}")
    public double potencializacao(@PathVariable int a, @PathVariable int b ){
        return (double) Math.pow(a,b);
    }
    @GetMapping("/radiciacao/{a}")
    public double radiciacao(@PathVariable int a){
        return (double) Math.sqrt(a);
    }

}
