package core.comparable;


import core.comparator.PlayerAgeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparison {

    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before Sorting : " + footballTeam);

        for ( Player player: footballTeam) {
            System.out.println(player.getName());
        }


        Collections.sort(footballTeam);
        System.out.println("After Sorting : " + footballTeam);

        for ( Player player: footballTeam) {
            System.out.println(player.getName());
        }


        Collections.sort(footballTeam , new PlayerAgeComparator());
        System.out.println("After Sorting : " + footballTeam);
    }


}
