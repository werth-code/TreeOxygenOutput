package com.matthewwerth;

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

    public void returnAllTreeInfo() {
        System.out.println(getTreeID() + " " + getTreeAge() + " " + getTreeType() + " " + getTreeInGoodHealth());
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