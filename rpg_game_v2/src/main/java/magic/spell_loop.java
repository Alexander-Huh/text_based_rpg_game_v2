/*package magic;

import player_stats.*;
import enemy_stats.*;
import java.util.Scanner;

import java.util.Random;

public class spell_loop{

    // ----------------creates objects to use methods of other classes
    char_one char_1_stats = new char_one();
    monster_lvl_1 monster_obj = new monster_lvl_1();


    //----------------new scanner object
    Scanner scan = new Scanner(System.in);

    Random rand = new Random();

    public int attack_spells(int magic_lvl, int spell_damage, String spell_element, int monster_health,
                                int remaining_monster_health, int absolute_monster_health, int c1_max_mp, int c1_remaining_mp){

        int hit_limit =1;
        int mp_cost = 15;

            
            for (hit_limit = 1; hit_limit < 2; hit_limit++) {
                c1_remaining_mp = (c1_max_mp - mp_cost);
                if(c1_remaining_mp >=0){
                    System.out.println("\nSpell Cast:\t\tMonster HP:");
                    // --------------subtracts a random number, based on spell damage and magic level
                    // multiplied together, from monster's health value
                    remaining_monster_health = monster_health - rand.nextInt(magic_lvl * (spell_damage + 1));
                    System.out.print(spell_element + "\t\t\t");
                    System.out.println(remaining_monster_health + " / " + absolute_monster_health);
                    // -------------sets new monster health value to old monster health value
                    monster_health = remaining_monster_health;
                }else if(c1_remaining_mp <0 ){
                    c1_remaining_mp = 0;
                    System.out.println("INSUFFICIENT MP. Spell Failed!");
                }

                c1_max_mp = c1_remaining_mp;
                char_1_stats.set_c1_remaining_mp(c1_max_mp);
                                                  
            }
        //System.out.print("[1]: ATTACK\t[2]: SPELLS\t[3]: INVENTORY\t[4]: FLEE\t[5]: END TURN: ");
        monster_obj.set_remaining_monster_hp(remaining_monster_health);
        return monster_obj.get_remaining_monster_hp();
    }

    public int healing_spells(int hp_restored, String spell_element, int p1_remaining_health,
                                int p1_max_health, int c1_max_mp, int c1_remaining_mp){

        int mp_cost = 10;
        
        c1_remaining_mp = (c1_max_mp - mp_cost);
        if(c1_remaining_mp >=0){
            if((p1_remaining_health + hp_restored) <= p1_max_health){
                System.out.println("HP:" + p1_remaining_health + "\t---->\t" + (p1_remaining_health + hp_restored));
                c1_remaining_mp = (c1_max_mp - mp_cost);
            }else if((p1_remaining_health + hp_restored) > p1_max_health){
                //p1_remaining_health = p1_max_health;
                c1_remaining_mp = (c1_max_mp - mp_cost);
                System.out.println("HP:" + p1_remaining_health + "\t---->\t" + p1_max_health);
                p1_remaining_health = p1_max_health;
            }
        }else if(c1_remaining_mp <0){
            c1_remaining_mp = 0;
            System.out.println("INSUFFICIENT MP. Spell Failed!");
        }
            //------------------makes it so that HP cannot exceed the max hp for the player
            c1_max_mp = c1_remaining_mp;
            char_1_stats.set_c1_remaining_mp(c1_max_mp);

            char_1_stats.set_c1_remaining_hp(p1_remaining_health+hp_restored);
            return char_1_stats.get_c1_remaining_hp();
        }
    //---------------adds a second return value of MP after a spell is cast. allows MP  value to be passed on to next round
    public int c1_mp_after_spell_cast(){
        char_1_stats.set_c1_remaining_mp(char_1_stats.get_c1_remaining_mp());
        return char_1_stats.get_c1_remaining_mp();
    }
    
}
*/
