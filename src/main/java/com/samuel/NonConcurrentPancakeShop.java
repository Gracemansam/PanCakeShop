package com.samuel;

import java.util.Random;

public class NonConcurrentPancakeShop {


    public static void simulateNonConcurrentPancakeShop() {
        System.out.println("------ Pancake Shop Output ------");

        long startTime = System.currentTimeMillis() / 1000;
        int pancakesMade = makePancakes();

        int[] pancakesEatenByUsers = new int[3];
        for (int i = 0; i < 3; i++) {
            pancakesEatenByUsers[i] = eatPancakes(i + 1);
        }

        long endTime = System.currentTimeMillis() / 1000;
        System.out.println("Start Time: " + startTime);

        for (int i = 0; i < 3; i++) {
            System.out.println("User " + (i + 1) + " ate " + pancakesEatenByUsers[i] + " pancakes.");
        }
        System.out.println("End Time: " + endTime);

        System.out.println("Pancakes Made by Shopkeeper: " + pancakesMade);

        int panCakesEaten = pancakesEatenByUsers[0] + pancakesEatenByUsers[1] + pancakesEatenByUsers[2];
        boolean shopkeeperMetNeeds = panCakesEaten <= pancakesMade;
        System.out.println("Shopkeeper Met Needs: " + shopkeeperMetNeeds);

        int wastedPancakes = Math.max(0, pancakesMade - panCakesEaten);
        System.out.println("Wasted Pancakes: " + wastedPancakes);

        int unmetOrders = shopkeeperMetNeeds ? 0 : Math.max(0, panCakesEaten - pancakesMade);
        System.out.println("Unmet Pancake Orders: " + unmetOrders);

        System.out.println("------ End of Output ------\n");
    }

    private static int makePancakes() {
        Random random = new Random();
        int pancakesMade = random.nextInt(13); // Maximum of 12 pancakes
        System.out.println("Shopkeeper made " + pancakesMade + " pancakes.");
        return pancakesMade;
    }

    private static int eatPancakes(int user) {
        Random random = new Random();
        int pancakesToEat = random.nextInt(6); // Maximum of 5 pancakes per user
      //  System.out.println("User " + user + " ate " + pancakesToEat + " pancakes.");
        return pancakesToEat;
    }
}
