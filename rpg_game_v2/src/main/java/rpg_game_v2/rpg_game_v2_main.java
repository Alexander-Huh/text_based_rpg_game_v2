package rpg_game_v2; //  java rpg_game_v2.rpg_game_v2_main

import levels.*;
import combat_system.*;
import inventory.*;
import player_stats.char_one;
import room.*;
import player.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.reflect.Array;

public class rpg_game_v2_main {

    public static void main(String[] args) {

        class monster extends player{

            //getter method to get monster stats
            public int[] get_monster_stats(){
                return stats;
            }

            //setter method for monster stats
            public void set_monster_stat(int index, int stat){
                this.stats[index]=stat;
            }
        }

        monster monster1 = new monster();
        monster1.set_monster_stat(0, 777);
        System.out.println(monster1.get_monster_stats()[0]);


// --------------------------TESTING------------------------
        // testing player getter mewthod and setter method
        player player1 = new player();
        player player2 = new player();
        player1.set_player_stats(0, 11);
        player1.set_player_stats(1, 22);
        System.out.println(player1.get_stat_names()[1]);
        System.out.println(player1.get_player_stats()[1]);


        player2.set_player_stats(0, 44);
        player2.set_player_stats(1, 55);

        System.out.println(player2.get_stat_names()[1]);
        System.out.println(player2.get_player_stats()[1]);
        System.out.println(player2.get_player_stats()[0]);

        System.out.println(player1.get_player_stats()[1]);

        //testing to see if setter is able to set item name and information
        inventory inv = new inventory();
        inventory inv2 = new inventory();
        inv.set_extra_item_name_effect(0, "super potion", "heals all HP");
        System.out.println(inv.get_extra_item_name_effect()[0][0]);
        System.out.println(inv.get_extra_item_name_effect()[1][0]);

        //testing to see if setter is able to set item name and information
        inv.set_extra_item_name_effect(1, "super duper potion", "heals all HP of team");
        System.out.println(inv.get_extra_item_name_effect()[0][1]);
        System.out.println(inv.get_extra_item_name_effect()[1][1]);

        inv2.set_extra_item_name_effect(0, "Cool Beans", "Makes you really cool");

        System.out.println(inv2.get_extra_item_name_effect()[0][0]);
        System.out.println(inv2.get_extra_item_name_effect()[1][0]);

    }
}
