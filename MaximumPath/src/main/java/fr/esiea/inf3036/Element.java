package fr.esiea.inf3036;

import java.util.ArrayList;
import java.util.List;

public class Element implements Comparable<Element> {
    Integer value;
    List<Integer> bestPath = new ArrayList<>();

    public Element(String s) {
        value = Integer.valueOf(s);
        bestPath.add(value); // by default best path is itself
    }

    public Element(Element element, Element bestPathToRetch) {
        value = element.value;
        bestPath.add(value);
        bestPath.addAll(bestPathToRetch.getBestPossiblePath());
    }

    public List<Integer> getBestPossiblePath() {
        return bestPath;
    }

    @Override
    public int compareTo(Element o) {
        if(o == null) {
            return 1;
        }
        return value - o.value;
    }
}
