package player_stats;

public class char_one{

    //-------------------STRENGTH
    private int c1_strength;

    public int get_c1_strength(){
        return this.c1_strength;
    }
    public void set_c1_strength (int strength){
        this.c1_strength = strength;
    }
    //----------------HIT LIMIT
    private int c1_hit_limit;

    public int get_c1_hit_limit(){
        return this.c1_hit_limit;
    }
    public void set_c1_hit_limit(int hit_limit){
        this.c1_hit_limit = hit_limit;
    }
    //-------------------- MAX HP
    private int c1_max_hp;

    public int get_c1_hp(){
        return this.c1_max_hp;
    }
    public void set_c1_hp(int max_hp){
        this.c1_max_hp = max_hp;
    }
    //--------------------REMAINING HP
    private int c1_remaining_hp;

    public int get_c1_remaining_hp(){
        return this.c1_remaining_hp;
    }
    public void set_c1_remaining_hp(int remaining_hp){
        this.c1_remaining_hp = remaining_hp;
    }
    //-------------------EXP
    private int c1_exp;

    public int get_c1_exp(){
        return this.c1_exp;
    }
    public void set_c1_exp(int c1_exp){
        this.c1_exp = c1_exp;
    }
    //-------------------MAGIC LEVEL
    private int c1_magic;

    public int get_c1_magic(){
        return this.c1_magic;
    }
    public void set_c1_magic(int magic){
        this.c1_magic = magic;
    }
    //-----------------max MP
    private int c1_max_mp;
    public int get_c1_max_mp(){
        return this.c1_max_mp;
    }
    public void set_c1_max_mp(int c1_max_mp){
        this.c1_max_mp = c1_max_mp;
    }
    //----------------remaining mp
    private int c1_remaining_mp;
    public int get_c1_remaining_mp(){
        return this.c1_remaining_mp;
    }
    public void set_c1_remaining_mp(int c1_remaining_mp){
        this.c1_remaining_mp = c1_remaining_mp;
    }
}
