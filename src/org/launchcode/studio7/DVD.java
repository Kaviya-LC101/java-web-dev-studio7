package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{

    private Integer currentDVDStorage;

    public DVD(boolean aLaser, String aName, Integer aCapacity, String aContent, String aDiscType,Integer aCurrentDVDStorage) {
        super(aLaser, aName, aCapacity, aContent, aDiscType);
        currentDVDStorage=aCurrentDVDStorage;
    }
    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void insertDisc() {
        System.out.println("**** Insert DVD ****");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    @Override
    void storeData(Integer addData) {
        if((currentDVDStorage+addData)<super.getCapacity()){
            currentDVDStorage +=addData;
            System.out.print("Used Storage"+currentDVDStorage+"Mb"+" Remaining Storage "+(super.getCapacity()-currentDVDStorage));
        }else{
            System.out.println("Cannot add "+addData+"Mb to the Disk.Exceed DVD storage Limit "+super.getCapacity()+"\n");

        }
    }
}
