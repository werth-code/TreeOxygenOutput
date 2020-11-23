package com.matthewwerth;

import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class Orchard  {
    private UUID orchardID;
    private Integer treeAge;
    private TypeOfTree treeType;
    private Boolean treeInGoodHealth;

    public Orchard(Integer treeAge, TypeOfTree treeType) {
        this.orchardID = setOrchardID();
        this.treeAge = treeAge;
        this.treeType = treeType;
        this.treeInGoodHealth = true;
    }

//    public String returnAllTreeInfo(UUID treeID) { //Method should accept an ID number and return the resulting information.
//        System.out.println("Tree Age: " + getOrchardAge());
//        System.out.println("Type: " + getTreeType());
//        System.out.println("In Good Health? " + getTreeInGoodHealth() + "\n");
//        return null;
//    }

    public String returnAllTreeInfo(UUID treeID) {
        return String.format("Tree ID  " + treeID + "  Tree Age: " + treeAge + "  Type:  " + treeType + "  In Good Health?  " + treeInGoodHealth + "\n");
    }

    public static UUID setOrchardID() {
        UUID newKey = UUID.randomUUID();
        return newKey;
    }

    public UUID getOrchardID() {
        return orchardID;
    }

    public Integer getOrchardAge() {
        return treeAge;
    }

    public TypeOfTree getTreeType() {
        return treeType;
    }

    public Boolean getTreeInGoodHealth() {
        return treeInGoodHealth;
    }


    public ArrayList createOrchard(Integer numberOfTrees) throws IOException {
        if (numberOfTrees <= 0) throw new IOException("You Must Include At Least One Tree!");

        ArrayList<Tree> listOfTreeID = new ArrayList<>();

        for(int i = 0; i < numberOfTrees; i++) {
            Tree tree = new Tree(treeAge, treeType, true);
            listOfTreeID.add(tree);
        }
        return listOfTreeID;
    }

    public String visualRepresentationOfOrchard (Integer rows, Integer columns) throws IOException {
        if (rows <= 0 || columns <= 0) throw new IOException("You Must Include At Least 1 Row & An ArrayList Greater Than Number Of Rows.");
        Integer numberOfTrees = rows * columns;
        ArrayList<Tree> orchard = createOrchard(numberOfTrees);

        String visualTreeMap = "";
        int count = 0;

        for(int i = 0; i < rows; i++) {
            visualTreeMap += "\n";
            for(int j = 0; j < columns; j++) {
                UUID singleTreeID = orchard.get(count).getTreeID();
                String treeInfo = returnAllTreeInfo(singleTreeID);
                visualTreeMap += treeInfo;
                count++;
            }
        }
        return ("Tree GPS Location: " + "1100293933 (Add This Later)" + "\n") + visualTreeMap;
    }
}
