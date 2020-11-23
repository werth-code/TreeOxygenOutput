package com.matthewwerth;

import java.util.UUID;

public class Tree {
    private UUID treeID;
    private Integer treeAge;
    private TypeOfTree treeType;
    private Boolean treeInGoodHealth;

    public Tree(Integer treeAge, TypeOfTree treeType, Boolean treeInGoodHealth) {
        this.treeID = setSingleTreeID();
        this.treeAge = treeAge;
        this.treeType = treeType;
        this.treeInGoodHealth = treeInGoodHealth;
    }

    public  String returnAllTreeInfo(UUID treeID) { //Method should accept an ID number and return the resulting information.
        return String.format("Tree Age: " + getTreeAge() + "Type: " + getTreeType() + "In Good Health? " + getTreeInGoodHealth() + "\n");
    }

    public static UUID setSingleTreeID() {
         UUID newKey = UUID.randomUUID();
         return newKey;
    }

    public UUID getTreeID() {
        return treeID;
    }

    public Integer getTreeAge() {
        return treeAge;
    }

    public TypeOfTree getTreeType() {
        return treeType;
    }

    public Boolean getTreeInGoodHealth() {
        return treeInGoodHealth;
    }

}

//create method to calculate tree oxygen output at each year of life - assuming healthy tree at average growth.
//use the method we created to make math tables and have that create tree tables?
//visually show how much oxygen a tree produces at each year of its life.
//visually show how many people each tree provides oxygen for.

//do the same for fruit output. How many people can the tree/group of trees feed.