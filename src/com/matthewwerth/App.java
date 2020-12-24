package com.matthewwerth;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class App {

    public static void main(String[] args) {

        Forest werthForest = new Forest();
        ArrayList<Tree> trees = TreeActions.createSetOfTrees(25, 1, TypeOfTree.EVERGREEN, true);
        werthForest.addManyTress(trees);

        werthForest.getTrees().forEach(tree -> System.out.println(tree.returnAllTreeInfo()));

    }
}
