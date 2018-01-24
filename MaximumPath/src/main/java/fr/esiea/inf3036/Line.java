package fr.esiea.inf3036;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Line {
    List<Element> elements = new ArrayList<>();

    public Line(String[] lineContent) {
        elements.addAll(Arrays.stream(lineContent).map(Element::new).collect(Collectors.toList()));
    }

    public Element getElementAt(int position) {
        return elements.get(position);
    }
}
