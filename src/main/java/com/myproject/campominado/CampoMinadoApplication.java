package com.myproject.campominado;

import com.myproject.campominado.modelo.Tabuleiro;
import com.myproject.campominado.visao.TabuleiroConsole;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CampoMinadoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampoMinadoApplication.class, args);

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
        new TabuleiroConsole(tabuleiro);
    }
}

