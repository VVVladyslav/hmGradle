package org.example;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello from Gradle!");

        String jsonString = "{\"name\": \"Vladyslav\", \"lastName\": \"Zharkov\"}";

        Gson g = new Gson();
        String person = g.toJson(jsonString);

        System.out.println(person);

    }
}