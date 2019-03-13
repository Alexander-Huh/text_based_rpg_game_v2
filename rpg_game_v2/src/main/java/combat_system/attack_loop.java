package combat_system;

import java.util.Random;
import java.util.ArrayList;

//-------------player attack loop. "monster attack loop" needed
public class attack_loop {

    // ----gets int variables from fight_v21  method
    public int fight(ArrayList<Integer> char1_stats, ArrayList<Integer> monster1_stats){

        Random rand = new Random();

        // sets initial hit limit to 0
        int hit_limit = 0;
        int counter = 1;

            System.out.println("\nHit #:\t\tMonster HP:");
            for (hit_limit = 1; hit_limit <= char1_stats.get(5); hit_limit++) {
                /*--------------subtracts a random number, based on player strength and weapon
                                strength added together, from monster's health value*/
                monster1_stats.set(8,monster1_stats.get(8) - rand.nextInt(char1_stats.get(12) + (char1_stats.get(2) + 1)));
                System.out.print(counter++ + "\t\t");
                System.out.println(monster1_stats.get(8) + " / " + monster1_stats.get(9));
                // -------------sets new monster health value to old monster health value
                monster1_stats.set(8,monster1_stats.get(8));
            }
        monster1_stats.set(8,monster1_stats.get(8));
        return monster1_stats.get(8);
    }
}
