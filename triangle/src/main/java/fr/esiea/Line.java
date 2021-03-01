package fr.esiea;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Line {
    List<Integer> elements;

    public Line(String[] elements) {
        this.elements = Arrays.stream(elements).map(Integer::valueOf).collect(Collectors.toList());
    }

    public Integer getElement(int position) {
        return elements.get(position);
    }
}
