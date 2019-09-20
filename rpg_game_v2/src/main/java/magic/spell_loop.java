package magic;

import player_stats.*;
import enemy_stats.*;

import java.util.Scanner;
import java.util.ArrayList;

import java.util.Random;

public class spell_loop{

    // ----------------creates objects to use methods of other classes

    //accesses stats for character 1 of game
    //char_one char_1_stats = new char_one();
    //accesses stats for generic monster 
    //monster_lvl_1 monster_obj = new monster_lvl_1();
    //accesses data for spells(healing/ combat)
    //spell_data spell_data = new spell_data();



    //----------------new scanner object
    Scanner scan = new Scanner(System.in);

    Random rand = new Random();

    public int attack_spells(ArrayList<Integer> char1_stats, ArrayList<Integer> monster1_stats, ArrayList<Integer> spell_dam, String spell_name){

        int hit_limit =0;
        int mp_cost = 15;

            //
           for(hit_limit = 1; hit_limit < char1_stats.get(6); hit_limit++){
               char1_stats.set(11, char1_stats.get(11) - mp_cost);
               if(char1_stats.get(11) > 0){
                   monster1_stats.set(9, (monster1_stats.get(9) - (rand.nextInt(char1_stats.get(4) + spell_dam.get(4)))));
                   System.out.format("\n%s%25s%n", "Spell Cast:", "Monster HP");

                    if(monster1_stats.get(9) > 0){
                    System.out.format("%18s%20d/%d\n%n", spell_name, monster1_stats.get(9), monster1_stats.get(10));
                    monster1_stats.set(9, monster1_stats.get(9));
                    }
               }else if(char1_stats.get(11) <= 0){
                   char1_stats.set(11, char1_stats.get(11) + mp_cost);
                   System.out.println("INSUFFICIENT MP. Spell Failed!");
               }
            if(monster1_stats.get(9) <= 0){
                hit_limit = char1_stats.get(6);
                System.out.format("%18s%20d/%d\n%n", spell_name, 0, monster1_stats.get(10));
                System.out.println("\n--------------------------------\n        Monster Defeated!!!\n");
            }
           }                  
            
        //System.out.print("[1]: ATTACK\t[2]: SPELLS\t[3]: INVENTORY\t[4]: FLEE\t[5]: END TURN: ");
        monster1_stats.set(9, monster1_stats.get(9));
        return monster1_stats.get(9);
    }

    public int healing_spells(String spell_name, ArrayList<Integer> char1_stats, ArrayList<Integer> spell_dam ){

        int mp_cost = 10;
        
        char1_stats.set(11, char1_stats.get(11) - mp_cost);
        if(char1_stats.get(11) > 0){
            if((char1_stats.get(9) + spell_dam.get(4) <= char1_stats.get(10))){
                System.out.println("HP:" + char1_stats.get(9) + "\t---->\t" + (char1_stats.get(9) +spell_dam.get(4)));
        
                char1_stats.set(11, char1_stats.get(11) - mp_cost);
                char1_stats.set(9,(char1_stats.get(0)+ spell_dam.get(4)));

            }else if((char1_stats.get(9) < char1_stats.get(10)) && char1_stats.get(9) + spell_dam.get(4) > char1_stats.get(10)){
                char1_stats.set(11, char1_stats.get(11) - mp_cost);
                System.out.println("HP:" + char1_stats.get(10) + "\t---->\t" +char1_stats.get(10));

                char1_stats.set(9, char1_stats.get(10));  

            }else if((char1_stats.get(9) == char1_stats.get(10))){
                char1_stats.set(11,char1_stats.get(11) + mp_cost);
                System.out.println("HP already FULL!! No MP used");
            }
        
        }else if(char1_stats.get(11) <=0){
            char1_stats.set(11,char1_stats.get(11) + mp_cost);
            System.out.println("INSUFFICIENT MP. Spell Failed!");
        }
    
            //------------------makes it so that HP cannot exceed the max hp for the player
            /*c1_max_mp = c1_remaining_mp;
            char_1_stats.set_c1_remaining_mp(c1_max_mp);*/

            /*char_1_stats.set_c1_remaining_hp(p1_remaining_health+hp_restored);k
            return char_1_stats.get_c1_remaining_hp();*/

            char1_stats.set(9, char1_stats.get(9));
            return char1_stats.get(9);
        }
    //---------------adds a second return value of MP after a spell is cast. allows MP  value to be passed on to next round
    public int c1_mp_after_spell_cast(ArrayList<Integer> char1_stats){
        char1_stats.set(11, char1_stats.get(11));
        return char1_stats.get(11);
    }

    public int c1_hp_after_spell_cast(ArrayList<Integer> char1_stats){
        char1_stats.set(9, char1_stats.get(9));
        return char1_stats.get(9);
    }
    
}

