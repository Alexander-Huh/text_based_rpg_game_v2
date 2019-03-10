package rpg_game_v2; //  java rpg_game_v2.rpg_game_v2_main

import levels.*;
import combat_system.*;
import inventory.*;

import java.util.ArrayList;
import java.util.Scanner;

public class rpg_game_v2_main{ 

    public static void main( String[] args ){

        //--------------level one object
       level_one level_one_obj = new level_one();
            level_one_obj.lvl_1();


       inventory set_items = new inventory();
            set_items.set_potions_inventory(111);
            set_items.set_gold_inventory(222);
            set_items.set_keys_inventory(333);
            set_items.set_tents_inventory(444);


        //-----------gets entire inventory array
        inventory_usage item_usage = new inventory_usage();
            item_usage.use_items(set_items.get_potions_inventory(), set_items.get_gold_inventory(), set_items.get_keys_inventory(), set_items.get_tents_inventory());

        //-------------------combat loop object, responsible for entire flow of combat
        /*combat_loop combat_obj = new combat_loop();
            combat_obj.attack_loop(100, 2, 50, 100, 100, 7, 25, 300, 300, 2, 25, 700);*/

        //---------------------attack loop object, responsible for only the players attack phase
        /*attack_loop attack_obj = new attack_loop();
            attack_obj.fight(25, 25, 2, 300, 300);*/
        
    }
}

