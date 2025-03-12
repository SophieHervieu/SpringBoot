package com.adrar.hello.controller;

import com.adrar.hello.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class LivreController {
    @Autowired
    LivreService livreService;

    public void router(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que souhaitez-vous faire ?");
        String response = scanner.next();
        response = response.toLowerCase();

        switch (response) {
            case "ajouter" -> livreService.add();
            case "supprimer" -> livreService.remove();
            case "consulter" -> livreService.findAll();
        }
    }
}
