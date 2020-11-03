package com.treeoxygenoutput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class TreeClass {
    private Integer treeID;
    private Integer treeAge; //Perhaps year planted would be better? Who would use this? Orchards?
    private String treeType;
    private Boolean treeInGoodHealth;

    //Constructor Function To Create A Single Tree

    public TreeClass(Integer treeID, Integer treeAge, String treeType, Boolean treeInGoodHealth) {
        this.treeID = treeID;
        this.treeAge = treeAge;
        this.treeType = treeType;
        this.treeInGoodHealth = treeInGoodHealth;
    }

    //******* Attempt At A Getter Function To Return A Tree By It's Unique ID
    public static Integer getTreeID(Integer treeID) {
        return treeID;
    }

    public static ArrayList setID(Integer numberOfTrees) throws IOException {
        if (numberOfTrees <= 0) throw new IOException("IOException Occurred");

        ArrayList<UUID> listOfTreeID = new ArrayList<>();

        for(int i = 0; i < numberOfTrees; i++) {
            UUID uniqueKey = UUID.randomUUID();
            listOfTreeID.add(uniqueKey);
        }
        return listOfTreeID;
    }

    //METHOD THAT TAKES OUR ARRAYLIST OF IDS AND CREATES A TREE OBJECT FOR EACH ONE.

    public static String plantTrees(Integer gpsCoordinates, Integer rows, Integer columns) throws IOException {
        if (rows <= 0 || columns <= 0) throw new IOException("IOException Occurred");

        Integer totalTrees = (rows * columns);
        ArrayList treesWithIDs = setID(totalTrees);

        String visualTreeMap = "";

//        if (myDigit >= 1) {
//            concatLine = String.format(concatLine + "%3d |", myDigit);
//            if (j == width) {
//                concatLine = concatLine + "\n"; 

        int count = 0;
        for(int i = 0; i < rows; i++) {
            visualTreeMap += "\n";
            for(int j = 0; j < columns; j++) {
                visualTreeMap += " |" + String.format(" Tree ID " + treesWithIDs.get(count));
                count++;
            }
        }
        return ("Tree Location " + gpsCoordinates + "\n") + visualTreeMap;
    }

}

//create method to calculate tree oxygen output at each year of life - assuming healthy tree at average growth.
//use the method we created to make math tables and have that create tree tables?
//visually show how much oxygen a tree produces at each year of its life.
//visually show how many people each tree provides oxygen for.

//do the same for fruit output. How many people can the tree/group of trees feed.