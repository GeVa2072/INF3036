package fr.esiea.inf3036;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumPath {
    private final Pyramid triangle;

    public MaximumPath(Pyramid triangle) {
        this.triangle = triangle;
    }

    public String getPath() {
        // Maintenant que nous avons une représentation plus simple de notre pyramid essayons d'améliorer le parcours.
        triangle.reduce();

        // Ici la représentation du triangle ne nous aides pas vraiement à résoudre le problème.
        List<Integer> path = maxPath(triangle, 0, 0);
        return path.stream().map(String::valueOf).collect(Collectors.joining(" "));
    }

    private List<Integer> maxPath(Pyramid pyramid, int lineIndex, int position) {
        //System.out.println("Processing element "+triangle[lineIndex][position]);
        List<Integer> bestPossiblePath = new ArrayList();
        bestPossiblePath.addAll(pyramid.getLine(lineIndex).getElementAt(position).getBestPossiblePath());
        // Detect leaf, there are no more line. return no path
        if(lineIndex>pyramid.getNbLine()-2) {
            return bestPossiblePath;
        }

        //System.out.println("Possible path are "+triangle[lineIndex+1][position] + ", "+triangle[lineIndex+1][position+1]);
        List<Integer> path1 = maxPath(pyramid, lineIndex+1, position);
        List<Integer> path2 = maxPath(pyramid, lineIndex+1, position+1);
        if(path1.stream().mapToInt(Integer::intValue).sum() > path2.stream().mapToInt(Integer::intValue).sum()) {
            bestPossiblePath.addAll(path1);
        } else {
            bestPossiblePath.addAll(path2);
        }

        return bestPossiblePath;
    }
}
