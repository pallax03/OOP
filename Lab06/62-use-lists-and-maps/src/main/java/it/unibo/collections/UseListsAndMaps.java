package it.unibo.collections;

import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Example class using {@link List} and {@link Map}.
 *
 */
public final class UseListsAndMaps {

    private UseListsAndMaps() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        List<Integer> int_list = new ArrayList<>();
        for (int i = 1000; i < 2000; i++) {
            int_list.add(i);
        }
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        List<Integer> int_linkedlist = new LinkedList<>(int_list);
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        int tmp = int_list.get(int_list.size()-1);
        int_list.set(int_list.size()-1, int_list.get(0));
        int_list.set(0, tmp);
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        for (Integer integer : int_list) {
            System.out.println(integer);
        }
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
        long time = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            int_list.add(i, i);
        }

        time = System.nanoTime() - time;
        final var millis = TimeUnit.NANOSECONDS.toMillis(time);
        System.out.println(// NOPMD
            "Converting "
                + int_list.size()
                + " ints to String and inserting them in a ARRAYLIST took "
                + time
                + "ns ("
                + millis
                + "ms)"
        );

        time = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            int_linkedlist.add(i, i);
        }

        System.out.println(// NOPMD
            "Converting "
                + int_linkedlist.size()
                + " ints to String and inserting them in a LINKEDLIST took "
                + time
                + "ns ("
                + millis
                + "ms)"
        );
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
        time = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            int_list.get(int_list.size()/2);
        }

        System.out.println(// NOPMD
            "Converting "
                + int_list.size()
                + " ints to String and inserting them in a ARRAYLIST took "
                + time
                + "ns ("
                + millis
                + "ms)"
        );

        time = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            int_linkedlist.get(int_linkedlist.size()/2);
        }

        System.out.println(// NOPMD
            "Converting "
                + int_linkedlist.size()
                + " ints to String and inserting them in a LINKEDLIST took "
                + time
                + "ns ("
                + millis
                + "ms)"
        );

        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         *
         * Africa -> 1,110,635,000
         *
         * Americas -> 972,005,000
         *
         * Antarctica -> 0
         *
         * Asia -> 4,298,723,000
         *
         * Europe -> 742,452,000
         *
         * Oceania -> 38,304,000
         */
        Map<String, Long> statesMap = new HashMap<>();

        statesMap.put("Africa" , 1110635000L);
        statesMap.put("Americas", 972005000L);
        statesMap.put("Antarctica", 0L);
        statesMap.put("Europe", 4298723000L);
        statesMap.put("Oceania", 742452000L);

        /*
         * 8) Compute the population of the world
         */
        
        time = System.nanoTime();

        long sum=0L;
        for (Long population : statesMap.values()) {
            sum += population;     
        }
        System.out.println(sum);

        System.out.println(// NOPMD
            "Converting "   
                + statesMap.size()
                + " ints to String and inserting them in a statesMap took "
                + time
                + "ns ("
                + millis
                + "ms)"
        );
    }
}
