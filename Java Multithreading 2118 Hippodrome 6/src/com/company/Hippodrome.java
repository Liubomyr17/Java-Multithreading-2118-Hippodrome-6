package com.company;

/*

2113 Hippodrome 6

Now let's move on to the Hippodrome class and the main method.
We need to create an object like Hippodrome and add some horses to it.
For starters, in the Hippodrome class:
Create a static game field like Hippodrome.
The main method requires:
a) Create an object of type Hippodrome and save it in the game field.
b) Create three horse objects. Name yourself. The initial speed for all horses is 3, the distance is 0.
c) Add the created horses to the list of horses of the hippodrome (horses). You can get a list of racetrack horses using the getHorses method.

Requirements:
1. In the Hippodrome class, a game field of type Hippodrome must be created.
2. The game field must be static.
3. The game field should NOT be private.
4. In the main method, the game field should be initialized.
5. In the main method, three horses must be added to the list of horses in the racetrack.
6. The speeds of all horses should be equal to 3, and the distance - 0.



 */
import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static Hippodrome game;
    private List<Horse> horses;

    public List<Horse> getHorses() {
        return this.horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) {
        Horse horse1 = new Horse("me", 3, 0);
        Horse horse2 = new Horse("myself", 3, 0);
        Horse horse3 = new Horse("i", 3, 0);
        List<Horse> horses = new ArrayList<Horse>();
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game = new Hippodrome(horses);


    }
}

