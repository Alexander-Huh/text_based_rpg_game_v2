package rpg_game_v2; //  java rpg_game_v2.rpg_game_v2_main

import levels.*;
import combat_system.*;
import inventory.*;
import player_stats.char_one;
import room.*;
import player.*;

import java.util.ArrayList;
import java.util.Scanner;

import javax.management.ObjectName;
import javax.naming.spi.StateFactory;

import java.lang.reflect.Array;

public class rpg_game_v2_main {

    public static void main(String[] args) {













        
// --------------------------TESTING------------------------
        player player_obj = new player();
        player_obj.set_player_stats(0, 11);
        player_obj.set_player_stats(1, 22);
        System.out.println(player_obj.get_stat_names()[1]);
        System.out.println(player_obj.get_player_stats()[1]);

        inventory inv = new inventory();
        inv.set_extra_item_name_effect(0, "super potion", "heals all HP");
        System.out.println(inv.get_extra_item_name_effect()[0][0]);
        System.out.println(inv.get_extra_item_name_effect()[1][0]);

        inv.set_extra_item_name_effect(1, "super duper potion", "heals all HP of team");
        System.out.println(inv.get_extra_item_name_effect()[0][1]);
        System.out.println(inv.get_extra_item_name_effect()[1][1]);

    }
}
