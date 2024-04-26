package com.example.smite_random_picker;

public class Character {

    private final int id;
    private final String name;

    Character(int id, String name){
        this.id = id;
        this.name = name;
    }
    int get_id(){
        return id;
    }
    String get_name(){
        return name;
    }
}
