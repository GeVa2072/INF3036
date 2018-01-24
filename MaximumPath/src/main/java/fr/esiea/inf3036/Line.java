package fr.esiea.inf3036;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Line {
    private List<Element> elements = new ArrayList<>();

    public Line(String[] lineContent) {
        elements.addAll(Arrays.stream(lineContent).map(Element::new).collect(Collectors.toList()));
    }

    public Line() {

    }

    public Element getElementAt(int position) {
        return elements.get(position);
    }

    public int getSize() {
        return elements.size();
    }

    public void addElement(Element newElement) {
        elements.add(newElement);
    }
}
