package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        String name = "Vladyslav";
        String lastName = "Zharkov";

        Gson g = new Gson();
        String person = g.toJson("{\"name\": \"" + name + "\", \"lastName\": \"" + lastName + "\"}");

        System.out.println(person);
    }
}