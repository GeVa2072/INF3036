package fr.esiea.inf3036;

import java.util.ArrayList;
import java.util.List;

public class Element {
    Integer value;

    public Element(String s) {
        value = Integer.valueOf(s);
    }

    public Integer getBestPossiblePath() {
        return value;
    }
}
