package com.example.project;

public class IdGenerate{ //This class contains statics variable and methods, you do not initalize an object to use it.
    
    //private attribute String currentId that is initialized to 99
    private static String currentId = "99";

    //empty constructor
    private IdGenerate() {}

    //returns currentId
    public static String getCurrentId() {return currentId;}

    //resets the currentId back to 99
    public static void reset() {currentId="99";}


    // public generateID(){} //generates a new id, when called it will increment the currentId by 1.. Hint pay attention to data type of currentId
    public static void generateID() {
        int id = Integer.parseInt(currentId); // Convert to integer
        id++; //update Id
        currentId = "" + id; //set currentId to the new value        
    }
}