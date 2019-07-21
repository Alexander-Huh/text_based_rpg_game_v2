package magic;

import java.util.ArrayList;

public class spell_data{

    //-----------------private string array, hold names of spells
    private ArrayList<String> spell_names = new ArrayList<String>();

    //----------------private int array thsat hold spell damage values
    private ArrayList<Integer> spell_dam = new ArrayList<>();

    //-----------------------















    public ArrayList<String> get_spell_names(){
        return this.spell_names;
    }

    public ArrayList<Integer> get_spell_dam(){
        return this.spell_dam;
    }

}