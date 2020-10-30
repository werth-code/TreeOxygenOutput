package com.treeoxygenoutput;

import com.sun.source.tree.Tree;

public class TreeClass {
    private Integer treeAge; //Perhaps year planted would be better? Who would use this? Orchards?
    private String treeType;
    private Boolean treeInGoodHealth;

    public TreeClass(Integer treeAge, String treeType, Boolean treeInGoodHealth) {
        this.treeAge = treeAge;
        this.treeType = treeType;
        this.treeInGoodHealth = treeInGoodHealth;
    }
}
