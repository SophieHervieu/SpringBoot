package com.adrar.hello.service;

import com.adrar.hello.model.Livre;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class LivreService {
    private List<Livre> livres;

    public LivreService() {
        this.livres = new ArrayList<Livre>();
    }

    public List<Livre> getLivres() {
        return livres;
    }

    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }

    public void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le titre du livre");
        String titre = scanner.nextLine();
        System.out.println("Veuillez saisir la description du livre");
        String description = scanner.nextLine();
        System.out.println("Veuillez saisir la date de publication du livre");
        String date = scanner.nextLine();
        System.out.println("Veuillez saisir le genre du livre");
        String genre = scanner.nextLine();

        this.livres.add(new Livre(titre, description, date, genre));

        System.out.println(new Livre(titre, description, date, genre));
    }

    public void remove(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le titre du livre");
        String titre = scanner.nextLine();
        System.out.println("Veuillez saisir la description du livre");
        String description = scanner.nextLine();
        System.out.println("Veuillez saisir la date de publication du livre");
        String date = scanner.nextLine();
        System.out.println("Veuillez saisir le genre du livre");
        String genre = scanner.nextLine();

        this.livres.remove(new Livre(titre, description, date, genre));
    }

    public List<Livre> findAll(){
        for(Livre livre : this.livres){
            System.out.println(livre);
        }
        return this.getLivres();
    }

    public Livre getLivre(Livre livre){
        return new Livre();
    }
}
