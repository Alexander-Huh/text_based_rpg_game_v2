package combat_system;

import java.util.Random;
import java.util.ArrayList;
import enemy_stats.*;
import player_stats.*;

//-------------player attack loop. "monster attack loop" needed
public class attack_loop {

    // ----gets int variables from fight_v21  method
    public int fight(ArrayList<Integer> char1_stats, ArrayList<Integer> monster1_stats){

        Random rand = new Random();

        monster_lvl_1 monster_obj = new monster_lvl_1();

        // sets initial hit limit to 0
        int hit_limit = 0;
        int counter = 1;

        //int remaining_monster_health = monster1_stats.get(8);
       // int monster_health = monster1_stats.get(0);
        //int absolute_monster_hp = monster1_stats.get(9);

        //int weapon_damage = char1_stats.get(12);
        //int player_strength = char1_stats.get(2);

       // while (counter <= player_hit_limit) {
            System.out.println("\nHit #:\t\tMonster HP:");
            for (hit_limit = 1; hit_limit <= char1_stats.get(5); hit_limit++) {
                // --------------subtracts a random number, based on player strength and weapon
                // strength added together, from monster's health value
                monster1_stats.set(8,monster1_stats.get(8) - rand.nextInt(char1_stats.get(12) + (char1_stats.get(2) + 1)));
                System.out.print(counter++ + "\t\t");
                System.out.println(monster1_stats.get(8) + " / " + monster1_stats.get(9));
                // -------------sets new monster health value to old monster health value
                monster1_stats.set(8,monster1_stats.get(8));
            }
       // }
        //System.out.print("[1]: ATTACK\t[2]: SPELLS\t[3]: INVENTORY\t[4]: FLEE\t[5]: END TURN: ");
        monster1_stats.set(8,monster1_stats.get(8));
        return monster1_stats.get(8);
    }
}
