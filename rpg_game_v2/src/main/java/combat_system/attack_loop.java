package combat_system;

import java.util.Random;
import enemy_stats.*;

//-------------"player attack loop. "monster attack loop" needed
public class attack_loop {

    // ----gets int variables from fight_v21  method
    public int fight(int weapon_damage, int player_strength, int player_hit_limit, int monster_health,
            int remaining_monster_health, int absolute_monster_hp){

        Random rand = new Random();

        monster_lvl_1 monster_obj = new monster_lvl_1();

        // sets initial hit limit to 0
        int hit_limit = 0;
        int counter = 1;

       // while (counter <= player_hit_limit) {
            System.out.println("\nHit #:\t\tMonster HP:");
            for (hit_limit = 1; hit_limit <= player_hit_limit; hit_limit++) {
                // --------------subtracts a random number, based on player strength and weapon
                // strength added together, from monster's health value
                remaining_monster_health = monster_health - rand.nextInt(weapon_damage + (player_strength + 1));
                System.out.print(counter++ + "\t\t");
                System.out.println(remaining_monster_health + " / " + absolute_monster_hp);
                // -------------sets new monster health value to old monster health value
                monster_health = remaining_monster_health;
            }
       // }
        //System.out.print("[1]: ATTACK\t[2]: SPELLS\t[3]: INVENTORY\t[4]: FLEE\t[5]: END TURN: ");
        monster_obj.set_remaining_monster_hp(remaining_monster_health);
        return monster_obj.get_remaining_monster_hp();
    }
}
