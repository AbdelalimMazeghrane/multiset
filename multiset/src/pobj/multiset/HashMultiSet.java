package pobj.multiset;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMultiSet<T> implements MultiSet<T> {
    private Map<T, Integer> map;
    private int size;

    public HashMultiSet() {
        map = new HashMap<>();
        size = 0;
    }

    public HashMultiSet(Collection<T> collection) {
        this();
        for (T element : collection) {
            add(element);
        }
    }
}