/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex.java;

class Person {
    private String firstName;
    private String lastName;
    
    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
}
    String fullName(){
        return firstName+ " "+lastName;
    }
}

final class Actor {
    private Person person;
    private String nationality;
    
    Actor(Person person, String nationality){
        this.person = person;
        this.nationality = nationality;
    }
    
    String actorCountry(){
        return nationality;
    }
}

final class Production {
    int year;
    String country;
}

final class Title {
    String movieTitle;
    int partOfMovie;
    
    Title(String movieTitle, int partOfMovie){
        this.movieTitle = movieTitle;
        this.partOfMovie = partOfMovie;
    }
    
    Title(String movieTitle){
        this(movieTitle, 0);
    }
    String fullTitle(){
        if (partOfMovie == 0) return movieTitle;
        else return movieTitle+" "+partOfMovie;
}
}

final class Director {
    Person person;
    String nationality;
    
    String directorData(){
        return person.fullName();
    }
}

final class Movie {
    private Title title;
    private Actor actor;
    private Production production;
    private Director director;
    
    Movie(Title title, Actor actor, Production production, Director director){
        this.title = title;
        this.actor = actor;
        this.production = production;
        this.director = director;
    }
}

/**
 *
 * @author inf154054
 */
class Ex3Java {

    public static void main(String[] args) {
        Person fisrtPerson = new Person("Michael", "Fassbender");
        Actor actor = new Actor(fisrtPerson, "Ireland");
        Director director = new Director();
        director.person = new Person("Justin", "Kurzel");
        Production production = new Production();
        production.country = "Great Britain";
        production.year = 2015;
        Title title = new Title("Macbeth");
        
        Movie movie = new Movie(title, actor, production, director);
        
    }
}
