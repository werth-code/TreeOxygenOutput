package com.treeoxygenoutput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class TreeClass {
    private Integer treeID;
    private Integer treeAge; //Perhaps year planted would be better? Who would use this? Orchards?
    private String treeType;
    private Boolean treeInGoodHealth;

    public TreeClass(Integer treeID, Integer treeAge, String treeType, Boolean treeInGoodHealth) {
        this.treeID = treeID;
        this.treeAge = treeAge;
        this.treeType = treeType;
        this.treeInGoodHealth = treeInGoodHealth;
    }

    public Integer getTreeID() {
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

    // Is there any way to not loop within a loop but assign each tree a unique id?
    public static String plantTrees(Integer gpsCoordinates, Integer rows, Integer columns) throws IOException {
        if (rows <= 0 || columns <= 0) throw new IOException("IOException Occurred");

        String visualTreeMap = "";
        int treeRows = 1;

        for(int i = 0; i < rows; i++) { // I need to pass in a unique ID for each tree - any way without nesting loops?
            visualTreeMap += "|" + String.format("  Tree Row %d |", treeRows).repeat(columns) + "\n";
            treeRows+=1;
        }
        return ("Tree Location " + gpsCoordinates + "\n") + visualTreeMap;
    }


}

//create method to calculate tree oxygen output at each year of life - assuming healthy tree at average growth.
//use the method we created to make math tables and have that create tree tables?
//visually show how much oxygen a tree produces at each year of its life.
//visually show how many people each tree provides oxygen for.

//do the same for fruit output. How many people can the tree/group of trees feed.