package com.samuel;

import java.util.Random;
import java.util.Random;
import java.util.stream.IntStream;

public class ConcurrentPanCakeShop {


    public static void simulateConcurrentPancakeShop() {
        System.out.println("");
        System.out.println("------ Parallel Stream Pancake Shop Output ------");

        // Starting time of the 30-second slot in seconds
        long startTime = System.currentTimeMillis() / 1000;
        System.out.println("");

        // Simulate the shopkeeper making pancakes concurrently
        int pancakesMade = makePancakes();

        // Simulate each user eating pancakes concurrently using parallel streams
        int[] pancakesEatenByUsers = IntStream.rangeClosed(1, 3)
                .parallel()
                .map(user -> eatPancakes(user))
                .toArray();

        // Ending time of the 30-second slot in seconds
        long endTime = System.currentTimeMillis() / 1000;

        // Print the start time
        System.out.println("Start Time: " + startTime);

        // Print individual consumption details without repetition
        IntStream.range(0, 3)
                .parallel()
                .forEach(i -> System.out.println("User " + (i + 1) + " ate " + pancakesEatenByUsers[i] + " pancakes."));

        // Print the end time
        System.out.println("End Time: " + endTime);

        // Print the overall results
        System.out.println("Pancakes Made by Shopkeeper: " + pancakesMade);

        // Check if the shopkeeper met the needs of the users
        boolean shopkeeperMetNeeds = IntStream.of(pancakesEatenByUsers).sum() <= pancakesMade;
        System.out.println("Shopkeeper Met Needs: " + shopkeeperMetNeeds);

        // Calculate wasted pancakes if any
        int wastedPancakes = Math.max(0, pancakesMade - IntStream.of(pancakesEatenByUsers).sum());
        System.out.println("Wasted Pancakes: " + wastedPancakes);



        // Calculate unmet orders if any
        int unmetOrders = shopkeeperMetNeeds ? 0 : Math.max(0, IntStream.of(pancakesEatenByUsers).sum() - pancakesMade);
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
        // System.out.println("User " + user + " ate " + pancakesToEat + " pancakes.");
        return pancakesToEat;
    }
}


