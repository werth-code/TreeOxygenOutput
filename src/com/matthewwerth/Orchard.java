package com.matthewwerth;

import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class Orchard extends Tree {
    public Orchard(UUID treeID, Integer treeAge, TypeOfTree treeType, Boolean treeInGoodHealth) {
        super(treeID, treeAge, treeType, treeInGoodHealth);
    }

    public static ArrayList createSetOfTrees(Integer numberOfTrees) throws IOException {
        if (numberOfTrees <= 0) throw new IOException("You Must Include At Least One Tree!");

        ArrayList<Tree> listOfTreeID = new ArrayList<>();

        for(int i = 0; i < numberOfTrees; i++) {
            Tree tree = new Tree(Tree.setSingleTreeID(), 2, TypeOfTree.EVERGREEN, true);
            listOfTreeID.add(tree);
        }
        return listOfTreeID;
    }

    public static String visualRepresentationOfOrchard (Integer gpsCoordinates, Integer rows, Integer columns) throws IOException {
        if (rows <= 0 || columns <= 0) throw new IOException("You Must Include At Least 1 Row & At Least 1 Column");

        Integer totalTrees = (rows * columns);
        ArrayList treesWithIDs = createSetOfTrees(totalTrees);

        String visualTreeMap = "";
        int count = 0;

        for(int i = 0; i < rows; i++) {
            visualTreeMap += "\n";
            for(int j = 0; j < columns; j++) {
                visualTreeMap += " |" + String.format(" Tree ID " + treesWithIDs.get(count))  + " |";
                count++;
            }
        }
        return ("Tree GPS Location " + gpsCoordinates + "\n") + visualTreeMap;
    }
}
