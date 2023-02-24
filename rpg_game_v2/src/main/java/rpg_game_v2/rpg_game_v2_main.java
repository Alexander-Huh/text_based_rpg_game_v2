package rpg_game_v2; //  java rpg_game_v2.rpg_game_v2_main

import rooms.*;
import levels.*;
import combat_system.*;
import inventory.*;
import player_stats.char_one;

import java.util.ArrayList;
import java.util.Scanner;

public class rpg_game_v2_main {

    public static void main(String[] args) {

        // --------------level one object
        level_one level_one_obj = new level_one();
        level_one_obj.lvl_1();

        // room_two room2 = new room_two();
        // room2.room_2();


        // inventory set_items = new inventory();
        // // adds new entries into an array that hold the quanties for different items
        //     set_items.get_all_inventory().add(777);
        //     set_items.get_all_inventory().add(888);
        //     set_items.get_all_inventory().add(999);
        // // addd new antries to an array that stores the names of different items
        //     set_items.get_all_item_names().add("Potions");
        //     set_items.get_all_item_names().add("Keys");
        //     set_items.get_all_item_names().add("Tents");

        // //  -----------gets entire inventory array
        // inventory_display item_usage = new inventory_display();
        // item_usage.use_items(set_items.get_all_inventory(), set_items.get_all_item_names());

         

    }
}
