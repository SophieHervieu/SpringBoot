package com.adrar.hello;

import com.adrar.hello.service.HelloWorldService;
import com.adrar.hello.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class HelloApplication implements CommandLineRunner {
    @Autowired
    private HelloWorldService helloWorldService;
    @Autowired
    private LivreService livreService;

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que souhaitez-vous faire ?");
        String input = scanner.next();
        input = input.toLowerCase();

        if(input.equals("ajouter")){
            livreService.add();
        }
        else if(input.equals("supprimer")){
            livreService.remove();
        }
        else if(input.equals("consulter")){
            livreService.findAll();
        }
    }
}
