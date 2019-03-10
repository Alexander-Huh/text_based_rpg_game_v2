package inventory;

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

    //-----------------gets length of inventory/quantity arrayList for character 1
    public int get_char1_inv_size(){
        return this.char1_item_quant.size();
    }
}
