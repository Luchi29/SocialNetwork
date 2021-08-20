package com.example.redsocialfbtw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
public class RedSocialFbTwApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(RedSocialFbTwApplication.class, args);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Nombre de usuario: ");
        String userName = reader.readLine();
        System.out.print("Contraseña: ");
        String password = reader.readLine();

        System.out.print("Qué deseas publicar?: ");
        String message = reader.readLine();

        System.out.println("\nSelecciona una red social para postear tu mensaje.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
    }


