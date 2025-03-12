package com.adrar.hello.service;

import com.adrar.hello.model.Livre;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class LivreService {
    public void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le titre du livre");
        String titre = scanner.nextLine();
        System.out.println("Veuillez saisir la description du livre");
        String description = scanner.nextLine();
        System.out.println("Veuillez saisir la date de publication du livre");
        String date = scanner.nextLine();

        System.out.println(new Livre(titre, description, date).toString());
    }

    public Livre getLivre(Livre livre){
        return new Livre();
    }
}
