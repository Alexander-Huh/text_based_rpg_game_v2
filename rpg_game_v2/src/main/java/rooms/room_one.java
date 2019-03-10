package rooms;

import player_stats.*;
import enemy_stats.*;

import java.util.ArrayList;
import java.util.List;

import combat_system.*;
import weapons.*;
import inventory.*;

public class room_one{

    public void room_1(){

        combat_loop comabt_obj = new combat_loop();

        //-----------------------character's stats
        char_one char_1_stats = new char_one();
            char_1_stats.set_c1_exp(0);
            char_1_stats.set_c1_hit_limit(2);
            char_1_stats.set_c1_hp(100);
            char_1_stats.set_c1_remaining_hp(25);
            char_1_stats.set_c1_magic(2);
            char_1_stats.set_c1_strength(25);
            char_1_stats.set_c1_max_mp(50);
            char_1_stats.set_c1_remaining_mp(50);

            int c1_strength = char_1_stats.get_c1_strength();
            int c1_hit_limit = char_1_stats.get_c1_hit_limit();
            int c1_magic = char_1_stats.get_c1_hit_limit();
            int c1_max_hp = char_1_stats.get_c1_hp();
            int c1_remaining_hp = char_1_stats.get_c1_remaining_hp();
            int c1_exp = char_1_stats.get_c1_exp();
            int c1_max_mp = char_1_stats.get_c1_max_mp();
            int c1_remaining_mp = char_1_stats.get_c1_remaining_mp();

        //---------------------starting inventory
        inventory set_items = new inventory();
            set_items.set_potions_inventory(777);
            set_items.set_gold_inventory(888);
            set_items.set_keys_inventory(999);
            set_items.set_tents_inventory(444);

            int potions = set_items.get_potions_inventory();
            int gold = set_items.get_gold_inventory();
            int keys = set_items.get_keys_inventory();
            int tents = set_items.get_tents_inventory();

            ArrayList <Integer> ints = new ArrayList<Integer>();
            ints.add(potions);
            ints.add(gold);
            ints.add(keys);
            ints.add(tents);
            ints.add(99999999);
            


        //-------------------weapon stats
        weapons_lvl_1 weapon_obj = new weapons_lvl_1();
            weapon_obj.set_basic_sword(25);

            int weapon_damage = weapon_obj.get_basic_sword();

        //---------------------first monster's stats
        monster_lvl_1 monster_stats = new monster_lvl_1();
            monster_stats.set_monster_exp(666);
            monster_stats.set_monster_hit_limit(2);
            monster_stats.set_monster_hp(100);
            monster_stats.set_remaining_monster_hp(100);
            monster_stats.set_monster_strength(50);

            int monster_hp = monster_stats.get_monster_hp();
            int monster_remaining_hp = monster_stats.get_remaining_monster_hp();
            int absolute_monster_hp = monster_stats.get_monster_hp();
            int monster_hit_limit = monster_stats.get_monster_hit_limit();
            int monster_strength = monster_stats.get_monster_strength();
            int monster_exp_value = monster_stats.get_monster_exp();

        int spell_damage = 25;
        int hp_restored = 50;

        System.out.println("Monster has appeared!!!!");

        comabt_obj.attack_loop(c1_strength, c1_hit_limit, c1_magic, c1_max_mp, c1_remaining_mp, 
        hp_restored, spell_damage, c1_max_hp, c1_remaining_hp, c1_exp, weapon_damage, monster_hp, 
        monster_remaining_hp, absolute_monster_hp, monster_hit_limit, monster_strength, monster_exp_value, potions, gold, keys, tents);


    }

}
