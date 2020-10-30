package com.treeoxygenoutput;

public class TreeClass {
    private static Integer treeID;
    private static Integer treeAge; //Perhaps year planted would be better? Who would use this? Orchards?
    private String treeType;
    private Boolean treeInGoodHealth;

    public TreeClass(Integer treeID, Integer treeAge, String treeType, Boolean treeInGoodHealth) {
        this.treeID = treeID;
        this.treeAge = treeAge;
        this.treeType = treeType;
        this.treeInGoodHealth = treeInGoodHealth;
    }

    public String getTree() {
        return String.valueOf("Tree ID: " + TreeClass.treeID + " Tree Age: " + TreeClass.treeAge);
    }

}

//create new trees and pass in data.
//build a database of trees and their growth rate