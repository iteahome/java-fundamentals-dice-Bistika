package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int x = -1;
        List<Integer> DiceResults = new ArrayList<Integer>();
        System.out.println("Please start entering the list of Dice results. Separate and submit using ENTER. To mark the end of the results, enter 0.");
        while(x != 0) {
            Scanner input = new Scanner (System.in);
            x = input.nextInt();
            DiceResults.add(x);
        }
        DiceResults.remove(DiceResults.size() -1);
    System.out.println(DiceResults);

        if (DiceResults.get(DiceResults.size() -1) != 6 && Collections.max(DiceResults) < 7 && Collections.min(DiceResults) > 0) {
            int j = 0;
            for (int i = 0; i<DiceResults.size();i++) {

                if (DiceResults.get(i) < 6) {
                    j++;
                }
            }
            System.out.println("1 - The number of people who threw the Dice is "+ j);
        }
        else{
            System.out.println("-1 \n The Sequence entered in invalid or does not comply to the rules of the game.");
        }
    }
}