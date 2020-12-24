package com.matthewwerth;

import java.util.ArrayList;

public interface TreeActions {

    static ArrayList<Tree> createSetOfTrees(Integer numberOfTrees, Integer treeAge, TypeOfTree treeType, Boolean inGoodHealth)  {
        if (numberOfTrees <= 0) return null;
        ArrayList<Tree> trees = new ArrayList<>();
        for(int i = 0; i < numberOfTrees; i++) {
            Tree tree = new Tree(treeAge, treeType, inGoodHealth);
            trees.add(tree);
        }
        return trees;
    }

//    static void visualRepresentationOfForest(Forest forest, Integer columns)  {
//        Integer totalRows = forest.getTrees().size() / columns;
//        if (columns <= 0 || totalRows < 1) return;
//
//        String visualTreeMap = "";
//        int count = 0;
//
//        for(int i = 0; i < totalRows; i++) {
//            visualTreeMap += "\n";
//            for(int j = 0; j < columns; j++) {
//                String treeInfo = forest.getTrees().get(count).returnAllTreeInfo();
//                visualTreeMap += treeInfo;
//                count++;
//            }
//        }
//        System.out.println(("Tree GPS Location: " + "1100293933 (Add This Later)" + "\n") + visualTreeMap);
//    }
}
