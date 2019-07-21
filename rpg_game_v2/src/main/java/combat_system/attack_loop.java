package combat_system;

import java.util.Random;
import java.util.ArrayList;

//-------------player attack loop. "monster attack loop" needed
public class attack_loop {

    // ----gets int variables from attack_loop method
    public int fight(ArrayList<Integer> char1_stats, ArrayList<Integer> monster1_stats) {

        Random rand = new Random();

        // sets initial hit limit to 0
        int hit_limit = 0;
        // counts number of hits/turns taken
        int counter = 1;


        if (monster1_stats.get(9) > 0) {
            //System.out.println("\nHit #:\t\tMonster HP:");
            System.out.format("%5s%15s%n\n", "Hit #","Monster HP:");
            for (hit_limit = 1; hit_limit <= char1_stats.get(6); hit_limit++) {
                /*--------------subtracts a random number, based on player strength and weapon
                                strength added together, from monster's health value*/
                monster1_stats.set(9,
                        monster1_stats.get(9) - rand.nextInt(char1_stats.get(13) + (char1_stats.get(2) + 1)));

                if (monster1_stats.get(9) > 0) {
                    //System.out.print(counter++ + "\t\t");
                    //System.out.println(monster1_stats.get(9) + " / " + monster1_stats.get(10));
                    System.out.format("%5d%15d/%d%n", counter++, monster1_stats.get(9), monster1_stats.get(10));
                    // -------------sets new monster health value to old monster health value
                    monster1_stats.set(9, monster1_stats.get(9));
                }
            }

        }
        if (monster1_stats.get(9) <= 0) {
            System.out.println("\n--------------------------------\n        Monster Defeated!!!\n");
        }

        monster1_stats.set(9, monster1_stats.get(9));// sets remaining health value outside of for loop, for return
        return monster1_stats.get(9);
    }
}
