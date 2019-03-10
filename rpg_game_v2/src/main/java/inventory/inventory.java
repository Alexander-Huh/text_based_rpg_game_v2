package inventory;

import java.util.Scanner;
public class inventory{

    private int[][] char_1_item_inventory = {
        {5,0,0,0,0,0,0,0,0,0,0,0,0,0}, //{potions, gold, keys, tents}-----boolean, item present(1) or not present(0)
        {7,0,0,0,0,0,0,0,0,0,0,0,0,0}  //{"tools": Hammer, pickax, rope, }---int, quantity of items
    };

    private String[] item_names = 
        {"Potions", "Gold", "Keys", "Tents","Stuff"};
  

    //------------------gets entire array @ index [0][n]
    public int get_all_inventory(int w){
        return this.char_1_item_inventory[0][w];
    }

    public String get_all_item_names(int m){
        return this.item_names[m];
    }
    //------------------sets the values of the array indexes [0][0-3] with ints taken when method is called
    public void set_all_inventeory(int potions, int gold, int keys, int tents){
        this.char_1_item_inventory[0][0] = potions;
        this.char_1_item_inventory[0][1] = gold;
        this.char_1_item_inventory[0][2] = keys;
        this.char_1_item_inventory[0][3] = tents;
    }
    //-----------------gets length of inventory array
    public int get_item_inventory_length(){
        return this.char_1_item_inventory[0].length;

    }
    //-----------------------------potions
    public int get_potions_inventory(){
        return this.char_1_item_inventory[0][0];

    }
    public void set_potions_inventory(int potions){
        //sets number of potions present
        this.char_1_item_inventory[0][0] = potions;
    }
    //--------------------------------GOLD
    public int get_gold_inventory(){
        return this.char_1_item_inventory[0][1];

    }
    public void set_gold_inventory(int gold){
        this.char_1_item_inventory[0][1] = gold;
    }

    //-----------------------------------keys
    public int get_keys_inventory(){
        return this.char_1_item_inventory[0][2];
    }
    public void set_keys_inventory(int keys){
        this.char_1_item_inventory[0][2] = keys;
    }

    //-----------------tents
    public int get_tents_inventory(){
        return this.char_1_item_inventory[0][3];
    }
    public void set_tents_inventory(int tents){
        this.char_1_item_inventory[0][3] = tents;
    }

}
