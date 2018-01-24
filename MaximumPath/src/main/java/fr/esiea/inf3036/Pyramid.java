package fr.esiea.inf3036;

public class Pyramid {
    private final int[][] triangle;
    private final int nbLine;

    public Pyramid(String triangle) {
        String[] element = triangle.split(" ");
        // Cette représentation naive dans un double tableau ne permet pas d'avoir de bonne performence.
        // Il consomme enormement de mémoire de surcroit.
        nbLine = (int) Math.sqrt(element.length)+1;
        //System.out.println("triangle nbLine = " + nbLine);
        this.triangle = new int[nbLine][nbLine];

        int elementIndex = 0;
        // Move over array lines
        for(int lineIndex = 0; lineIndex<nbLine; lineIndex++) {
            //System.out.print(String.format("Line %d contains ", lineIndex));
            // move over array columns
            for(int columnIndex = 0 ; columnIndex<lineIndex+1; columnIndex++) {
                //System.out.print(element[elementIndex] + " ");
                this.triangle[lineIndex][columnIndex] = Integer.parseInt(element[elementIndex++]);
            }
            //System.out.println();
        }
    }

    public int[] getLine(int lineIndex) {
        return triangle[lineIndex];
    }

    public int getNbLine() {
        return nbLine;
    }

}
