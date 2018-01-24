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
        // Il ne reste plus qu'a savoir combient de fois on peut réduire.
        int maxReduceTime = triangle.getNbLine()-1;
        for(int i =0;i<maxReduceTime;i++) {
            triangle.reduce();
            // Ici nous détruisons l'objet triangle en le réduisant, on peut éviter cela.
        }

        // Si je réduis suffisamment, il devrait rester qu'un élément le premier et le meilleur chemin.
        return triangle.getLine(0).getElementAt(0).getBestPossiblePath().stream().map(String::valueOf).collect(Collectors.joining(" "));
    }
}
