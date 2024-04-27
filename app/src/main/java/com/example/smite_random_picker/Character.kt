package com.example.smite_random_picker

enum class characterClass{
    ASSASSIN, GUARDIAN, HUNTER, MAGE, WARRIOR
}

class Character(private val name: String, val id: Int, val characterClass: characterClass ) {
    override fun toString(): String {
        return name
    }

}