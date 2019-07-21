package rooms;

import player_stats.*;
import enemy_stats.*;

//import java.util.ArrayList;
import combat_system.*;
import inventory.*;
import magic.*;

public class room_one{

    public void room_1(){

        combat_loop comabt_obj = new combat_loop();

        //-----------------------character's stats
        char_one char_1_stats = new char_one();
        
        //------------------------hp,mp
           char_1_stats.get_char1_stats().add(75);//0
           char_1_stats.get_char1_stats().add(50);//1
        //----------------------str, agi, magic, def
            char_1_stats.get_char1_stats().add(25);//2
            char_1_stats.get_char1_stats().add(10);//3
            char_1_stats.get_char1_stats().add(10);//4
            char_1_stats.get_char1_stats().add(15);//5
        //------------------------hit limit
            char_1_stats.get_char1_stats().add(2);//6
        //--------------------------------EXP
            char_1_stats.get_char1_stats().add(100);//7
        //-------------------------------lvl
            char_1_stats.get_char1_stats().add(1);//8
        //-------------------------remaining hp, absolute hp
           char_1_stats.get_char1_stats().add(75);//9
           char_1_stats.get_char1_stats().add(100);//10
        //-----------------------reamaining mp, absolute mp
           char_1_stats.get_char1_stats().add(50);//11
           char_1_stats.get_char1_stats().add(75);//12
        //------------------wepaon damage
            char_1_stats.get_char1_stats().add(10);//13
        /////////////////////////////////////////////////////////////////////////stats names:
        char_1_stats.get_stat_names().add("HP");
        char_1_stats.get_stat_names().add("MP");
        char_1_stats.get_stat_names().add("Strength");
        char_1_stats.get_stat_names().add("Agility");
        char_1_stats.get_stat_names().add("Spirit");
        char_1_stats.get_stat_names().add("Defense");
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

        //--------------------------spell names
        spell_data spell_values = new spell_data();
            spell_values.get_spell_names().add("Fire"); //0
            spell_values.get_spell_names().add("Air"); //1
            spell_values.get_spell_names().add("Water"); //2
            spell_values.get_spell_names().add("Earth"); //3
            spell_values.get_spell_names().add("Heal"); //4

            spell_values.get_spell_dam().add(10); //0 
            spell_values.get_spell_dam().add(10); //1
            spell_values.get_spell_dam().add(10); //2
            spell_values.get_spell_dam().add(10); //3
            spell_values.get_spell_dam().add(25); //4

            

        //---------------------first monster's stats
        monster_lvl_1 monster_stats = new monster_lvl_1();
            
            monster_stats.get_monster1_stats().add(100);//0
            monster_stats.get_monster1_stats().add(50);//1
            monster_stats.get_monster1_stats().add(50);//2
            monster_stats.get_monster1_stats().add(10);//3
            monster_stats.get_monster1_stats().add(3);//4
            monster_stats.get_monster1_stats().add(15);//5
            monster_stats.get_monster1_stats().add(1);//6
            monster_stats.get_monster1_stats().add(1000);//7

            monster_stats.get_monster1_stats().add(1);//8

            monster_stats.get_monster1_stats().add(100);//9
            monster_stats.get_monster1_stats().add(101);//10

           monster_stats.get_monster1_stats().add(50);//11
            monster_stats.get_monster1_stats().add(50);//12

            monster_stats.get_monster1_stats().add(50);//13

        System.out.println("Monster has appeared!!!!");

        comabt_obj.attack_loop(char_1_stats.get_char1_stats(),spell_values.get_spell_dam(), spell_values.get_spell_names(),
                                     monster_stats.get_monster1_stats(),set_items.get_all_inventory(), set_items.get_all_item_names());


    }

}
