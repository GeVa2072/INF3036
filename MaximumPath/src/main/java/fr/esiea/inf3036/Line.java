package fr.esiea.inf3036;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Line {
    List<Integer> elements = new ArrayList<>();

    public Line(String[] lineContent) {
        elements.addAll(Arrays.stream(lineContent).map(Integer::valueOf).collect(Collectors.toList()));
    }

    public Integer getElementAt(int position) {
        return elements.get(position);
    }
}
