package enemy_stats;

public class monster_lvl_1{

    //-------------------max hp
    private int monster_hp;
    public int get_monster_hp(){
        return this.monster_hp;
    }
    public void set_monster_hp(int max_hp){
        this.monster_hp = max_hp;
    }

    //--------------remaining hp
    private int monster_remaining_hp;
    public int get_remaining_monster_hp(){
        return this.monster_remaining_hp;
    }
    public void set_remaining_monster_hp(int remaining_hp){
        this.monster_remaining_hp = remaining_hp;
    }

    //---------------hit limit
    private int monster_hit_limit;
    public int get_monster_hit_limit(){
        return this.monster_hit_limit;
    }
    public void set_monster_hit_limit(int hit_limit){
    this.monster_hit_limit = hit_limit;
    }

    //-------------strength
    private int monster_strength;
    public int get_monster_strength(){
        return this.monster_strength;
    }
    public void set_monster_strength(int strength){
        this.monster_strength = strength;
    }

    //-------------monster exp value
    private int monster_exp;
    public int get_monster_exp(){
        return this.monster_exp;
    }
    public void set_monster_exp(int monster_exp){
        this.monster_exp = monster_exp;
    }
}
