package fr.esiea;

import java.util.*;
import java.util.stream.Collectors;

public class MaximumPath {

    Pyramid pyramid;

    public MaximumPath(String s) {
        pyramid = new Pyramid(s);

    }

    public int maximum() {
        List<Element> path = maxPath(0,0);
        return path.get(0).maximum;
    }

    private List<Element> maxPath(int lineIndex, int position) {
        Element current = pyramid.getElement(lineIndex, position);

        if(current.compute) {
            return current.maxPath;
        }

        if(lineIndex >= pyramid.getHeight()-1) {
            current.maximum = current.value;
            current.maxPath = Collections.singletonList(current);
            return current.maxPath;
        }

        List<Element> bestPossiblePath = new ArrayList<>();
        bestPossiblePath.add(pyramid.getElement(lineIndex, position));

        List<Element> maxPath1 = maxPath(lineIndex+1, position);
        List<Element> maxPath2 = maxPath(lineIndex+1, position+1);

        List<Element> bestPath = bestBetween(maxPath1, maxPath2);
        bestPossiblePath.addAll(bestPath);
        current.maxPath = bestPossiblePath;
        current.maximum = current.value + bestPath.get(0).maximum;
        current.compute = true;

        return bestPossiblePath;
    }

    private List<Element> bestBetween(List<Element> maxPath1, List<Element> maxPath2) {
        int sum1 = maxPath1.get(0).maximum;
        int sum2 = maxPath2.get(0).maximum;

        if(sum1 > sum2) {
            return maxPath1;
        } else {
            return maxPath2;
        }
    }


    public String maximumPath() {
        return maxPath(0, 0).stream().map(element -> element.value).map(String::valueOf).collect(Collectors.joining(" "));
    }
}
