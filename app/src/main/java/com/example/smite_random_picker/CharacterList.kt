package com.example.smite_random_picker;
import java.util.ArrayList;
class CharacterList {
    private var characters = arrayListOf<Character>();
    fun addCharacter(character: Character) {
        characters.add(character);
    }
    fun getCharacter(index: Int): Character {
        return characters[index];
    }
    fun getCharacterCount(): Int {
        return characters.size;
    }

    operator fun iterator(): Iterator<Character> {
        return characters.iterator();
    }
}