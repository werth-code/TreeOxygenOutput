package com.matthewwerth;

import java.util.ArrayList;
import java.util.List;

public abstract class TreeGroup {

        private List<Tree> trees;

        public TreeGroup() {
            this.trees = new ArrayList<>();
        }
        public void addManyTress(List<Tree> trees) {
            trees.forEach(tree -> this.trees.add(tree));
        }

        public void addSingleTree(Tree tree) {
            trees.add(tree);
        }

        public void removeTree(Tree tree) {
            trees.remove(tree);
        }

        public void removeAllTrees() {
            trees.clear();
        }

        public List<Tree> getTrees() {
            return trees;
        }
}
