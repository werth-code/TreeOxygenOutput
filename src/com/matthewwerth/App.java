package com.matthewwerth;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        Tree tree = new Tree(Tree.setSingleTreeID(), 2, TypeOfTree.EVERGREEN, true);
        tree.returnAllTreeInfo();
        //Create a new ArrayList and set each value to a new ID number.

        //Show All Of Our Trees In Rows & Columns
        String orchard = Orchard.visualRepresentationOfOrchard(56372, 3, 3);
        System.out.println(orchard);

        //Loop through ID numbers and create a unique tree object for each one.

    }
}
