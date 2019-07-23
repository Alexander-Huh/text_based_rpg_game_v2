package combat_system;

import magic.*;
import inventory.*;

import java.util.ArrayList;
import java.util.Scanner;


public class combat_loop {

    public void attack_loop(ArrayList<Integer> char1_stats, ArrayList<Integer> spell_dam, ArrayList<String> spell_name, ArrayList<Integer> monster1_stats,
                                        ArrayList<Integer> inventory_quant, ArrayList<String> inventory_names) {


        //spell_loop spell_loop = new spell_loop();
        attack_loop attack_loop = new attack_loop();
        inventory_display use_items = new inventory_display();
        spell_loop spell_loop = new spell_loop();

        Scanner scan = new Scanner(System.in);

        int end_of_turn = 1;
        //----------allows player to make 5 turns before starting the enemy attack phase
        int turn_limit = 6;

        while (end_of_turn != turn_limit) {
            System.out.println("\nTURN #:\t" + end_of_turn + "-------------------------------------------------------");
            System.out.println("[1]: ATTACK\t[2]: SPELLS\t[3]: INVENTORY\t[4]: FLEE\t[5]: END TURN:");
            System.out.print("-------------------------------------------------------\n--->:");
            String user_input = scan.nextLine();
            switch (user_input) {
            //----------------initiates players attack against enemy
            case "1":
                monster1_stats.set(9,(
                        attack_loop.fight(char1_stats, monster1_stats)));
                if (monster1_stats.get(9) <= 0) {
                    end_of_turn = 6;
                } else if (monster1_stats.get(9) > 0) {
                    end_of_turn++;
                }
                break;
            case "2":
                System.out.print("Select Element:\n\t [1]: FIRE\t[2]: ICE\t[3]: STONE\t[4]: DARK\t[5]: LIGHT\t: ");
                user_input = scan.nextLine();
                switch (user_input) {
                //------------casts a fire spell
                case "1":
                    monster1_stats.set(9, (spell_loop.attack_spells(char1_stats, monster1_stats, spell_dam, "BOOM BOOM")));
                    monster1_stats.set(9, monster1_stats.get(9));

                    System.out.println("MP left:\t" + spell_loop.c1_mp_after_spell_cast(char1_stats));
                    char1_stats.set(11, spell_loop.c1_mp_after_spell_cast(char1_stats));

                    if (monster1_stats.get(9) <= 0) {  
                        end_of_turn = 6;
                    } else if (monster1_stats.get(9) > 0) {
                        end_of_turn++;
                    }
                    break;
                //------------casts an ice spell
                case "2":
                    monster1_stats.set(9, (spell_loop.attack_spells(char1_stats, monster1_stats, spell_dam, "FRO-YO")));
                    monster1_stats.set(9, monster1_stats.get(9));

                    System.out.println("MP left:\t" + spell_loop.c1_mp_after_spell_cast(char1_stats));
                    char1_stats.set(11, spell_loop.c1_mp_after_spell_cast(char1_stats));

                    if (monster1_stats.get(9) <= 0) {
                        end_of_turn = 6;
                    } else if (monster1_stats.get(9) > 0) {
                        end_of_turn++;
                    }
                    break;
                //-----------------casts a stone spell
                case "3":
                    monster1_stats.set(9, (spell_loop.attack_spells(char1_stats, monster1_stats, spell_dam, "Rock-Road")));
                    monster1_stats.set(9, monster1_stats.get(9));

                    System.out.println("MP left:\t" + spell_loop.c1_mp_after_spell_cast(char1_stats));
                    char1_stats.set(11, spell_loop.c1_mp_after_spell_cast(char1_stats));

                    if (monster1_stats.get(9) <= 0) {  
                        end_of_turn = 6;
                    } else if (monster1_stats.get(9) > 0) {
                        end_of_turn++;
                    }
                    break;
                //--------------casts a dark magic spell
                case "4":
                    monster1_stats.set(9, (spell_loop.attack_spells(char1_stats, monster1_stats, spell_dam, "Night Light Please")));
                    monster1_stats.set(9, monster1_stats.get(9));

                    System.out.println("MP left:\t" + spell_loop.c1_mp_after_spell_cast(char1_stats));
                    char1_stats.set(11, spell_loop.c1_mp_after_spell_cast(char1_stats));

                    if (monster1_stats.get(9) <= 0) {  
                        end_of_turn = 6;
                    } else if (monster1_stats.get(9) > 0) {
                        end_of_turn++;
                    }
                    break;
                //---------------casts a healing spell
                case "5": 
                    char1_stats.set(9, (spell_loop.healing_spells("Band-Aid", char1_stats, spell_dam)));
                    char1_stats.set(9, char1_stats.get(9));

                    System.out.println("MP left:\t" + spell_loop.c1_mp_after_spell_cast(char1_stats));
                    char1_stats.set(11, spell_loop.c1_mp_after_spell_cast(char1_stats));

                    end_of_turn++;
                    break;
                }
                break;
            case "3":
                //--------------------opens interface for users to access inventory information
                use_items.use_items(inventory_quant, inventory_names);
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
    



