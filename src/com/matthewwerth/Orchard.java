package com.matthewwerth;

import java.util.UUID;

public class Orchard extends Tree {
    public Orchard(UUID treeID, Integer treeAge, TypeOfTree treeType, Boolean treeInGoodHealth) {
        super(treeID, treeAge, treeType, treeInGoodHealth);
    }
}
