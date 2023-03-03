package player;


import java.lang.reflect.Array;
import java.util.ArrayList;


        // this is a class for objects related to playable characters, monsters and other enemies will also be considered playable characters.
        public class player {

            // -------------------ATTRIBUTE OF PLAYERS-------------------------
            // initializes a private Array of length 4 to hold player stat values
            protected int[] stats = new int[3];
        
            // initializes and sets the values of an array to hold names of player stat values that cannot be changed
            final String[] stat_names = {"HP","MP","STR","DEF"};
        
            //-------------------GETTER AND SETTERS----------------------------
            // getter method to return player_stats
            public int[] get_player_stats(){
                return stats;
            }

            // setter method used to set values for player_stats
            public void set_player_stats(int index, int stat){
                this.stats[index] = stat;
            }

            // getter method for returning stat_names
            public String[] get_stat_names(){
                return stat_names;
            }
       


        }

                // subclass of superclass player, monster subclass is used to get and set monster values
                class monster extends player{

                    //getter method to get monster stats
                    public int[] get_monster_stats(){
                        return stats;
                    }
        
                    //setter method for monster stats
                    public void set_monster_stat(int index, int stat){
                        this.stats[index]=stat;
                    }
                }
    
