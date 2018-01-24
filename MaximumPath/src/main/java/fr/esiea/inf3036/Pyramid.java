package fr.esiea.inf3036;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pyramid {
    private List<Line> lines = new ArrayList<>();

    public Pyramid(String triangle) {
        String[] element = triangle.split(" ");

        // On va pouvoir simplifier la construction de notre représentation.
        int nbElementToAddInCurrentLine = 1; // Sur la premiére ligne il y a un élément
        int nbElementRead = 0;

        while(nbElementRead<element.length) {
            Line current = new Line(Arrays.copyOfRange(element, nbElementRead, nbElementRead+nbElementToAddInCurrentLine));
            // Prepare next iteration move nbElementRead and move nbElementInCurrentLine
            nbElementRead+=nbElementToAddInCurrentLine++;

            lines.add(current);
        }
    }

    public Line getLine(int lineIndex) {
        return lines.get(lineIndex);
    }

    public int getNbLine() {
        return lines.size();
    }

}
