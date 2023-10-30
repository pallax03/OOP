package it.unibo.collections.sets;

import java.util.Collection;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
        TreeSet<String> string_treeSet = new TreeSet<>();
        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */
        for(int i=1; i<21; i++) {
            string_treeSet.add(String.valueOf(i));
        }
        /*
         * 3) Prints its content
         */
        System.out.println(string_treeSet);
        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */
        java.util.Iterator<String> iterator = string_treeSet.iterator();
        while(iterator.hasNext()) {
            String i  = iterator.next();
            if((Integer.parseInt(i) % 3)==0) {
                iterator.remove();
            }
            
        }
        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        for (String string : string_treeSet) {
            System.out.println(string);
        }
        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
    }
}
