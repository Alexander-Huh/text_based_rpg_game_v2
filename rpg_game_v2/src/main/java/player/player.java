package player;


import java.lang.reflect.Array;
import java.util.ArrayList;


        // this is a class for objects related to playable characters
        public class player {

            // -------------------ATTRIBUTE OF PLAYERS-------------------------
            // initializes a private Array of length 4 to hold player stat values
            private int[] player_stats = new int[3];
        
            // initializes and sets the values of an array to hold names of player stat values that cannot be changed
            final String[] stat_names = {"HP","MP","STR","DEF"};
        


            //-------------------GETTER AND SETTERS----------------------------
            // getter method to return player_stats
            public int[] get_player_stats(){
                return player_stats;
            }
            // setter method used to set values for player_stats
            public void set_player_stats(int index, int stat){
                this.player_stats[index] = stat;
            }

            // getter method for returning stat_names
            public String[] get_stat_names(){
                return stat_names;
            }


        }