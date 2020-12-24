package com.matthewwerth;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {
    private static Tree tree;

    @BeforeAll
    static void setUp(){
        tree = new Tree(1, TypeOfTree.EVERGREEN, true);
    }

    @Test
    void returnAllTreeInfo() {
        // Given
        // When
        String actual = tree.returnAllTreeInfo();
        System.out.println(actual);
        // Then
        Assert.assertNotNull(actual);

    }

    @Test
    void setSingleTreeID() {
        // Given
        // public Tree tree = new Tree(Tree.setSingleTreeID(), 1, TypeOfTree.EVERGREEN, true);
        UUID treeID = tree.getTreeID();
        // When
        String treeIDString = treeID.toString();
        // Then
        Assert.assertNotNull(treeIDString);
    }

    @Test
    void getTreeID() {
        // Given
        // public Tree tree = new Tree(Tree.setSingleTreeID(), 1, TypeOfTree.EVERGREEN, true);
        // When
        UUID treeID = tree.getTreeID();
        // Then
        Assert.assertNotNull(treeID);
    }

    @Test
    void getTreeAge() {
        // Given
        // When
        Integer expected = 1;
        Integer actual = tree.getTreeAge();
        // Then
        Assert.assertEquals(expected, actual); /////
    }

    @Test
    void getTreeType() {
        // Given
        // public Tree tree = new Tree(Tree.setSingleTreeID(), 1, TypeOfTree.EVERGREEN, true);
        // When
        TypeOfTree treeType = tree.getTreeType();
        // Then
        Assert.assertEquals(TypeOfTree.EVERGREEN, treeType);
    }

    @Test
    void getTreeInGoodHealth() {
        // Given
        // public Tree tree = new Tree(Tree.setSingleTreeID(), 1, TypeOfTree.EVERGREEN, true);
        // When
        Boolean isGood = tree.getTreeInGoodHealth();
        // Then
        Assert.assertEquals(true, isGood);
    }
}