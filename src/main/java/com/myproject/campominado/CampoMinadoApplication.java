package com.myproject.campominado;

import com.myproject.campominado.modelo.Tabuleiro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CampoMinadoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampoMinadoApplication.class, args);
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);

        tabuleiro.abrir(3, 3);
        tabuleiro.alternarMarcacao(4, 4);
        tabuleiro.alternarMarcacao(4, 5);
        System.out.println(tabuleiro);
    }
}

