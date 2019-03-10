package inventory;

import java.util.Scanner;
import java.util.ArrayList;

public class inventory_usage{

    inventory inventory_obj = new inventory();
    Scanner scan = new Scanner(System.in);
    

    public void use_items(int potions, int gold, int keys, int tents){

           inventory_obj.set_potions_inventory(potions);
            inventory_obj.set_keys_inventory(keys);
            inventory_obj.set_gold_inventory(gold);
            inventory_obj.set_tents_inventory(tents);

            System.out.print("[1]: VIEW INVENTORY:\t");
            String user_input = scan.nextLine();
            switch(user_input){
                case "1":
                   int end_of_inventory_array = inventory_obj.get_item_inventory_length();
       

                    /*for(int i = 0; i < end_of_inventory_array; i++){
                        System.out.println(inventory_obj.get_all_inventory(i));
                    }*/
                    
                for(int i = 0; i < end_of_inventory_array; i++){
                    if(inventory_obj.get_all_inventory(i) > 0){
                        System.out.print(inventory_obj.get_all_item_names(i) + ":\t");
                        System.out.println(inventory_obj.get_all_inventory(i));
                    }
                }
                    ///System.out.println("\n" + inventory_obj.get_item_inventory_length());
                break;
            }
        }
    }



