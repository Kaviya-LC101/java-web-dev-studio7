package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    private Integer currentCDStorage;
    @Override
    public void spinDisc() {
   System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void insertDisc() {
        System.out.println("**** Insert CD *****");
    }

    @Override
    public void storeData(Integer addData) {
        if((currentCDStorage+addData)<super.getCapacity()){
            currentCDStorage +=addData;
            System.out.print("Used Storage"+currentCDStorage+"Mb"+" Remaining Storage "+(super.getCapacity()-currentCDStorage));
        }else{
            System.out.println("Cannot add "+addData+"Mb to the Disk.Exceed CD storage Limit "+super.getCapacity()+"\n");
        }

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

  public CD(boolean aLaser,String aName,Integer aCapacity,String aContent,String aDiscType,Integer aCurrentStorage){
        super(aLaser,aName,aCapacity,aContent,aDiscType);
        currentCDStorage=aCurrentStorage;
  }

}
