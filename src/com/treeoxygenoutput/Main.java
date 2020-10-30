package com.treeoxygenoutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

//        UUID id = new UUID();
//        id = (Integer) id;

        // We can use this method stand alone - because it is STATIC ! ! !
        String orchard = TreeClass.plantTrees(56372, 5, 4);
        System.out.println(orchard);

        ArrayList orchardID = TreeClass.setID(6);

        System.out.println(orchardID.toString());
    }
}
