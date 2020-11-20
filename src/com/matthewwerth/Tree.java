package com.matthewwerth;

import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class Tree {
    private UUID treeID;
    private Integer treeAge;
    private TypeOfTree treeType;
    private Boolean treeInGoodHealth;

    //Constructor Function To Create A Tree

    public Tree(UUID treeID, Integer treeAge, TypeOfTree treeType, Boolean treeInGoodHealth) {
        this.treeID = treeID;
        this.treeAge = treeAge;
        this.treeType = treeType;
        this.treeInGoodHealth = treeInGoodHealth;
    }

    public static UUID setSingleTreeID() {
         UUID newKey = UUID.randomUUID();
         return newKey;
    }

    //HERE I WANT TO CREATE numberOfTree ID #s.
    public static ArrayList setManyTreeIDs(Integer numberOfTrees) throws IOException {
        if (numberOfTrees <= 0) throw new IOException("You Must Include At Least One Tree!");

        ArrayList<UUID> listOfTreeID = new ArrayList<>();

        for(int i = 0; i < numberOfTrees; i++) {
            UUID uniqueKey = UUID.randomUUID();
            listOfTreeID.add(uniqueKey);
        }
        return listOfTreeID;
    }

    //HERE I WANT TO GET INFO ON AN INDIVIDUAL TREE.
//    public static Integer getTreeID(Integer treeID) {
//        listOfTreeID
//    }

    //METHOD THAT TAKES OUR ARRAYLIST OF IDS AND CREATES A TREE OBJECT FOR EACH ONE.
    public static String plantTrees(Integer gpsCoordinates, Integer rows, Integer columns) throws IOException {
        if (rows <= 0 || columns <= 0) throw new IOException("You Must Include At Least 1 Row & At Least 1 Column");

        Integer totalTrees = (rows * columns);
        ArrayList treesWithIDs = setManyTreeIDs(totalTrees);

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

//create method to calculate tree oxygen output at each year of life - assuming healthy tree at average growth.
//use the method we created to make math tables and have that create tree tables?
//visually show how much oxygen a tree produces at each year of its life.
//visually show how many people each tree provides oxygen for.

//do the same for fruit output. How many people can the tree/group of trees feed.