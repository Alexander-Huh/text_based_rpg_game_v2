package combat_system;

import enemy_stats.*;
import player_stats.*;
import magic.*;
import inventory.*;

import java.util.ArrayList;
import java.util.Scanner;


public class combat_loop {

    public void attack_loop(int c1_strength, int c1_hit_limit, int c1_magic, int c1_max_mp, int c1_remaining_mp,
            int hp_restored, int spell_damage, int c1_max_hp, int c1_remaining_hp, int c1_exp, int weapon_damage,
            int monster_hp, int monster_remaining_hp,int absolute_monster_hp, int monster_hit_limit, int monster_strength,int monster_exp_value, 
            ArrayList<Integer> item_quant, ArrayList<String> item_names) {

        monster_lvl_1 monster_obj = new monster_lvl_1();
        char_one c1_obj = new char_one();
        spell_loop spell_loop = new spell_loop();
        attack_loop attack_loop = new attack_loop();
        inventory_display use_items = new inventory_display();

        Scanner scan = new Scanner(System.in);

        int end_of_turn = 1;
        //----------allows player to make 5 turns before starting the enemy attack phase
        int turn_limit = 6;

        while (end_of_turn != turn_limit) {
            System.out.println("\nTURN #:\t" + end_of_turn + "-------------------------------------------------------");
            System.out.print("[1]: ATTACK\t[2]: SPELLS\t[3]: INVENTORY\t[4]: FLEE\t[5]: END TURN: --->: ");
            String user_input = scan.nextLine();
            switch (user_input) {
            //----------------initiates players attack against enemy
            case "1":
                monster_obj.set_remaining_monster_hp(
                        attack_loop.fight(weapon_damage, c1_strength, c1_hit_limit, monster_hp, monster_remaining_hp, absolute_monster_hp));
                monster_hp = monster_obj.get_remaining_monster_hp();
                // user_input = scan.nextLine();
                if (monster_obj.get_remaining_monster_hp() <= 0) {
                    end_of_turn = 6;
                } else if (monster_obj.get_remaining_monster_hp() > 0) {
                    end_of_turn++;
                }
                break;
            case "2":
                System.out.print("Select Element:\n\t [1]: FIRE\t[2]: ICE\t[3]: STONE\t[4]: DARK\t[5]: LIGHT\t: ");
                user_input = scan.nextLine();
                switch (user_input) {
                //------------casts a fire spell
                case "1":
                    monster_obj.set_remaining_monster_hp(spell_loop.attack_spells(c1_magic, spell_damage, "FIRE",
                            monster_hp, monster_remaining_hp, absolute_monster_hp, c1_max_mp, c1_remaining_mp));
                    monster_hp = monster_obj.get_remaining_monster_hp();

                    System.out.println("MP left:\t" + spell_loop.c1_mp_after_spell_cast());
                    c1_max_mp = spell_loop.c1_mp_after_spell_cast();

                    if (monster_obj.get_remaining_monster_hp() <= 0) {
                        end_of_turn = 6;
                    } else if (monster_obj.get_remaining_monster_hp() > 0) {
                        end_of_turn++;
                    }
                    break;
                //------------casts an ice spell
                case "2":
                    monster_obj.set_remaining_monster_hp(spell_loop.attack_spells(c1_magic, spell_damage, "ICE",
                            monster_hp, monster_remaining_hp, absolute_monster_hp, c1_max_mp, c1_remaining_mp));
                    monster_hp = monster_obj.get_remaining_monster_hp();

                    System.out.println("MP left:\t" + spell_loop.c1_mp_after_spell_cast());
                    c1_max_mp = spell_loop.c1_mp_after_spell_cast();

                    if (monster_obj.get_remaining_monster_hp() <= 0) {
                        end_of_turn = 6;
                    } else if (monster_obj.get_remaining_monster_hp() > 0) {
                        end_of_turn++;
                    }
                    break;
                //-----------------casts a stone spell
                case "3":
                    monster_obj.set_remaining_monster_hp(spell_loop.attack_spells(c1_magic, spell_damage, "STONE",
                            monster_hp, monster_remaining_hp,absolute_monster_hp, c1_max_mp, c1_remaining_mp));
                    monster_hp = monster_obj.get_remaining_monster_hp();

                    System.out.println("MP left:\t" + spell_loop.c1_mp_after_spell_cast());
                    c1_max_mp = spell_loop.c1_mp_after_spell_cast();

                    if (monster_obj.get_remaining_monster_hp() <= 0) {
                        end_of_turn = 6;
                    } else if (monster_obj.get_remaining_monster_hp() > 0) {
                        end_of_turn++;
                    }
                    break;
                //--------------casts a dark magic spell
                case "4":
                    monster_obj.set_remaining_monster_hp(spell_loop.attack_spells(c1_magic, spell_damage, "DARK",
                            monster_hp, monster_remaining_hp,absolute_monster_hp, c1_max_mp, c1_remaining_mp));
                    monster_hp = monster_obj.get_remaining_monster_hp();

                    System.out.println("MP left:\t" + spell_loop.c1_mp_after_spell_cast());
                    c1_max_mp = spell_loop.c1_mp_after_spell_cast();

                    if (monster_obj.get_remaining_monster_hp() <= 0) {
                        end_of_turn = 6;
                    } else if (monster_obj.get_remaining_monster_hp() > 0) {
                        end_of_turn++;
                    }
                    break;
                //---------------casts a healing spell
                case "5": 
                    c1_obj.set_c1_remaining_hp(spell_loop.healing_spells(hp_restored, "LIGHT", c1_remaining_hp,
                            c1_max_hp, c1_max_mp, c1_remaining_mp));
                    c1_remaining_hp = c1_obj.get_c1_remaining_hp();

                    System.out.println("MP left:\t" + spell_loop.c1_mp_after_spell_cast());
                    c1_max_mp = spell_loop.c1_mp_after_spell_cast();

                    end_of_turn++;
                    break;
                }
                break;
            case "3":
                //--------------------opens interface for users to access inventory information
                use_items.use_items(item_quant, item_names);
                //----------------------------------------------------------------------------------------------------------------------Dont hardcode this!!!!
                break;
            //---------------ends players turns early
            case "5":
                end_of_turn = 6;
                break;
            default:
                System.out.println("error");
                break;
            }
        }
        System.out.print("test: attack_loop");
    }   
}


