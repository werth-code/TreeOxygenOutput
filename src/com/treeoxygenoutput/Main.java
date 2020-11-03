package com.treeoxygenoutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

//       UUID id = new UUID();
//        id = (Integer) id;


        //Create a new ArrayList and set each value to a new ID number.

        // We can use this method stand alone - because it is STATIC ! ! !
        String orchard = TreeClass.plantTrees(56372, 5, 5);
        System.out.println(orchard);

        //Loop through ID numbers and create a unique tree object for each one.
        //orchardID.forEach((ele) -> new TreeClass(orchardID.indexOf(ele), 0, "Apple", true));

        //Show a visual grid with each trees unique ID number...
        //System.out.println(TreeClass.getTreeID(orchardID.get(0)));
    }
}
