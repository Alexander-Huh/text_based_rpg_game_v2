package rpg_game_v2; //  java rpg_game_v2.rpg_game_v2_main

import levels.*;
import combat_system.*;
import inventory.*;

import java.util.ArrayList;
import java.util.Scanner;

public class rpg_game_v2_main {

    public static void main(String[] args) {

        // --------------level one object
        level_one level_one_obj = new level_one();
        level_one_obj.lvl_1();

        inventory set_items = new inventory();

            set_items.get_all_inventory().add(777);
            set_items.get_all_inventory().add(888);
            set_items.get_all_inventory().add(999);

            set_items.get_all_item_names().add("Potions");
            set_items.get_all_item_names().add("Keys");
            set_items.get_all_item_names().add("Tents");

        // -----------gets entire inventory array
        inventory_usage item_usage = new inventory_usage();
        item_usage.use_items(set_items.get_all_inventory(), set_items.get_all_item_names());

        // -------------------combat loop object, responsible for entire flow of combat
        /*
         * combat_loop combat_obj = new combat_loop(); combat_obj.attack_loop(100, 2,
         * 50, 100, 100, 7, 25, 300, 300, 2, 25, 700);
         */

        // ---------------------attack loop object, responsible for only the players
        // attack phase
        /*
         * attack_loop attack_obj = new attack_loop(); attack_obj.fight(25, 25, 2, 300,
         * 300);
         */

    }
}
