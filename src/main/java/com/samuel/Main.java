package com.samuel;

public class Main {
    public static void main(String[] args) {

        System.out.println("******************Welcome to Brilloconnetz Pancake Shop!*******************");
        System.out.println("");
        NonConcurrentPancakeShop.simulateNonConcurrentPancakeShop();
        System.out.println("");

        System.out.println("************Concurrent Pancake Shop Output************** ");
        System.out.println("");
        ConcurrentPanCakeShop.simulateConcurrentPancakeShop();
    }

    /**

     *
     Observations and Comparison:

     Non-Concurrent Version:

     Sequential Execution: In the non-concurrent version, the operations are performed sequentially.
     The shopkeeper makes pancakes, and each user eats pancakes one after the other.

     Predictable Output: The output is more predictable and sequential,
     as each user's actions are displayed one at a time.

     Simplicity: The code is straightforward and easy to understand, making it suitable for simple scenarios.


     Concurrent Version:

     Parallel Execution: In the concurrent version, the operations are performed concurrently using parallel streams.
     The shopkeeper makes pancakes, and each user eats pancakes simultaneously.
     Asynchronous Output: Due to the concurrent nature, the output may be interleaved,
     and the order of user actions may not follow a strict sequence.
     Increased Throughput: The concurrent version allows for potential performance
     improvements by leveraging parallelism,especially in scenarios with more extensive data or more users.


     Common Points:

     Randomness: Both versions use random values to simulate pancake-making and eating, providing variability in each simulation.

     Calculation Corrections: In both versions, the correction to the calculation of wasted pancakes has been applied, ensuring accuracy in determining wastage.
     Meeting Needs and Unmet Orders: Both versions calculate whether the shopkeeper met the needs of the users and determine any unmet orders accurately.

     My Conclusion:

     The non-concurrent version is simpler and more predictable, suitable for scenarios where sequential execution is sufficient.
     The concurrent version introduces parallelism, potentially improving throughput in scenarios with more extensive data or users.





     */


}
