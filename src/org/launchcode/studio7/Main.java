package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
            CD aNewStory= new CD(true,"A Tale",50,"Story between two friends",
                    "CD",10);
            DVD aNewMoive=new DVD(true,"Titanic",100,"Story about Lovers in the sinking Ship",
                    "DVD",40);

        // TODO: Call each CD and DVD method to verify that they work as expected.
    aNewStory.insertDisc();
    aNewStory.spinDisc();
    aNewStory.storeData(20);
    System.out.println("\nLoading more data to the CD");
    aNewStory.storeData(30);
    aNewMoive.insertDisc();
    aNewMoive.spinDisc();
    aNewMoive.storeData(30);
    System.out.println("\nLoading more data to the DVD");
    aNewMoive.storeData(50);
    }
}
