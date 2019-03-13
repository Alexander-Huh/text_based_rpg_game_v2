package rooms;

import player_stats.*;
import enemy_stats.*;

//import java.util.ArrayList;
import combat_system.*;
import weapons.*;
import inventory.*;

public class room_one{

    public void room_1(){

        combat_loop comabt_obj = new combat_loop();

        //-----------------------character's stats
        char_one char_1_stats = new char_one();
        
        //------------------------hp, remainging hp, absolute hp
           char_1_stats.get_char1_stats().add(75);
           char_1_stats.get_char1_stats().add(50);
        //----------------------str, agi, spirit
            char_1_stats.get_char1_stats().add(15);
            char_1_stats.get_char1_stats().add(10);
            char_1_stats.get_char1_stats().add(10);
        //------------------------hit limit
            char_1_stats.get_char1_stats().add(2);
        //--------------------------------EXP
            char_1_stats.get_char1_stats().add(100);
        //-------------------------------lvl
            char_1_stats.get_char1_stats().add(1);
        //-------------------------remaining hp, absolute hp
           char_1_stats.get_char1_stats().add(75);
           char_1_stats.get_char1_stats().add(100);
        //-----------------------reamaining mp, absolute mp
           char_1_stats.get_char1_stats().add(50);
           char_1_stats.get_char1_stats().add(75);
        //------------------wepaon damage
            char_1_stats.get_char1_stats().add(10);
        /////////////////////////////////////////////////////////////////////////stats names:
        char_1_stats.get_stat_names().add("HP");
        char_1_stats.get_stat_names().add("MP");
        char_1_stats.get_stat_names().add("Strength");
        char_1_stats.get_stat_names().add("Agility");
        char_1_stats.get_stat_names().add("Spirit");
        char_1_stats.get_stat_names().add("Hit Limit");
        char_1_stats.get_stat_names().add("EXP");
        char_1_stats.get_stat_names().add("Level");


        //---------------------starting inventory
        inventory set_items = new inventory();
            set_items.get_all_inventory().add(777);
            set_items.get_all_inventory().add(888);
            set_items.get_all_inventory().add(999);
            set_items.get_all_inventory().add(111);

            set_items.get_all_item_names().add("Potions");
            set_items.get_all_item_names().add("Keys");
            set_items.get_all_item_names().add("Tents");
            set_items.get_all_item_names().add("Gold");
            

        //---------------------first monster's stats
        monster_lvl_1 monster_stats = new monster_lvl_1();
            
            monster_stats.get_monster1_stats().add(100);
            monster_stats.get_monster1_stats().add(50);
            monster_stats.get_monster1_stats().add(50);
            monster_stats.get_monster1_stats().add(10);
            monster_stats.get_monster1_stats().add(3);
            monster_stats.get_monster1_stats().add(1);
            monster_stats.get_monster1_stats().add(1000);

            monster_stats.get_monster1_stats().add(1);

            monster_stats.get_monster1_stats().add(100);
            monster_stats.get_monster1_stats().add(101);

            monster_stats.get_monster1_stats().add(50);
            monster_stats.get_monster1_stats().add(50);

            monster_stats.get_monster1_stats().add(50);

        int spell_damage = 25;
        int hp_restored = 50;

        System.out.println("Monster has appeared!!!!");

        comabt_obj.attack_loop(char_1_stats.get_char1_stats(),monster_stats.get_monster1_stats(),set_items.get_all_inventory(), set_items.get_all_item_names());


    }

}
