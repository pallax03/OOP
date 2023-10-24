package it.unibo.collections.comparators;

import java.util.Comparator;

public class SortString<X> implements Comparator<X> {

    @Override
    public int compare(X o1, X o2) {
        return Double.parseDouble(o1.toString()) > Double.parseDouble(o2.toString()) ? 1 : -1;
    }
}
