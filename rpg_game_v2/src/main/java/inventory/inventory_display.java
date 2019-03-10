package inventory;

import java.util.Scanner;
import java.util.ArrayList;

public class inventory_display{

    inventory inventory_obj = new inventory();
    Scanner scan = new Scanner(System.in);
    

    public void use_items(ArrayList<Integer> item_quant, ArrayList<String> item_names){

            System.out.print("[1]: VIEW INVENTORY:\t");
            String user_input = scan.nextLine();
            switch(user_input){
                case "1":
                   System.out.format("%12s%17s\n--------------------------------\n", "Item:", "Quantity:");
                    for(int i = 0; i < item_quant.size(); i++){
                        if(item_quant.get(i) > 0){
                            System.out.format("%13s:%17d%n", item_names.get(i), item_quant.get(i));
                        }
                    }
                break;
            }
        }
    }



