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

    /**
     * On prend l'avant dernière ligne et on calcule les meilleurs chemin vers chaque élément
     *
     *
     * @return une nouvelle pyramid sans la dernière ligne.
     */
    public void reduce() {
        Line nextTo = getLine(getNbLine() - 2);
        Line lastLine = getLine(getNbLine()-1);

        Line newLine = new Line();

        for (int i = 0; i < nextTo.getSize(); i++) {
            Element currentElementFromNextTo = nextTo.getElementAt(i);
            Element newElement = null;
            if (lastLine.getElementAt(i).compareTo(lastLine.getElementAt(i + 1)) > 0) {
                newElement = new Element(currentElementFromNextTo, lastLine.getElementAt(i));
            } else {
                newElement = new Element(currentElementFromNextTo, lastLine.getElementAt(i + 1));
            }
            newLine.addElement(newElement);
        }

        lines.remove(lastLine);
        lines.remove(nextTo);
        lines.add(newLine);

    }
}
