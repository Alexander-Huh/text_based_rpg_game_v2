package inventory;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class inventory{

    //-------------------private variable for an array list that holds quantity of items
    private ArrayList<Integer> char1_item_quant = new ArrayList<Integer>();

    //-------------------private variable for arrayList that holds names of items character has
    private ArrayList<String> item_names = new ArrayList<String>();

    //------------------gets item quantiity arrayList
    public ArrayList<Integer> get_all_inventory(){
        return this.char1_item_quant;
    }

    //----------------------gets item name arrayList
    public ArrayList<String> get_all_item_names(){
        return this.item_names;
    }

    //-----------------gets length of inventory/quantity arrayList
    public int get_char1_inv_size(){
        return this.char1_item_quant.size();
    }
// }

// --------------------------------------------------V2
// public class inventory{
    //----------------------ATTRIBUTES OF INVENTORY ------------------

    //----------------------NON-CORE/EXTRA items----------------------
    //a private array to hold non-core/extra inventory names and effect/info
    private String[][] extra_item_name_effect = new String[2][50];

    //private array to hold quanties of non-core items in inventory
    private int[] extra_item_qnt = new int[50];


    //-------------------------CORE ITEMS----------------------
    //private  2D array of core items, containing item name and item info
    final String[][] core_item_name_effect = {{"Potions","Keys","Tent"},{"Heals player HP","Opens locked doors","Provides a safe place to rest"}};

    //private array to hold quantity of core items
    private int[] core_item_qnt = new int[2];



    //--------------------GETTERS AND SETTER-------------
    //---------------CORE ---------------
    //getter method for returning value of core_item_qnt
    public int[] get_core_item_qny(){
        return core_item_qnt;
    }

    //setter method for setting core inventory quantities
    public void set_core_item_qnt(int index, int qnt){
        this.core_item_qnt[index]=qnt;
    }

    //getter method used to return core inventory names and effects
    public String[][] get_core_item_name_effect(){
        return core_item_name_effect;
    }



    //---------NON-CORE/EXTRA
    // getter method used to return non-core/extra inventory names and effects
    public String[][] get_extra_item_name_effect(){
        return extra_item_name_effect;
    }

    //setter method for setting the value of non-core/extra item names and effects
    public void set_extra_item_name_effect(int index1, String item_name, String item_effect){
        this.extra_item_name_effect[0][index1]=item_name;
        this.extra_item_name_effect[1][index1]=item_effect;
    }
    // getter method used to return non-core/extra inventory quantity
    public int[] get_extra_item_qnt(){
        return extra_item_qnt;
    }

    //setter method used to set values of non-core/extra inventory quantity
    public void set_extra_item_qnt(int index, int new_qnt){
        this.extra_item_qnt[index] = new_qnt;
    }




}