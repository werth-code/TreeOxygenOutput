package com.matthewwerth;
import java.io.IOException;
import java.util.UUID;

public class App {

    public static void main(String[] args) throws IOException {

        // Create a single tree with some properties.
        Tree tree = new Tree(2, TypeOfTree.EVERGREEN, true);
        UUID treeID = tree.getTreeID();
        tree.returnAllTreeInfo(treeID);

        // Create a new ArrayList to represent an orchard or set of trees.
        // Loop through given number of trees and set up new tree object with a unique ID for each one.
        // Add created trees to our ArrayList.
        // Show All Of Our Trees In Rows & Columns

        Orchard appleOrchard = new Orchard(0, TypeOfTree.FRUIT_BEARING);
        System.out.println(appleOrchard.visualRepresentationOfOrchard(2, 3));

    }
}
