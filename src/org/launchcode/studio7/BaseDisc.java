package org.launchcode.studio7;

public abstract class BaseDisc {
private boolean laser;
private String name;
private Integer capacity;
private String content;
private String discType;
private boolean isLoaded;
private boolean isRead;
public BaseDisc(boolean aLaser,String aName,Integer aCapacity,String aContent,String aDiscType){
        laser=aLaser;
        name=aName;
        capacity=aCapacity;
        content=aContent;
        discType=aDiscType;
}
    void storeData(Integer addData){

    }
    void dataWritten(){
if (laser==true){
this.isLoaded=true;
}else {this.isLoaded=false;}
    }

   public void dataRead(){
        if (laser==true){
            this.isRead=true;
        }else {this.isRead=false;}
    }
  public  String reportInformation(){
    if(isLoaded==true){
       return toString();
    }
    else{
        return "Disk Not Loaded";
    }
    }

    @Override
    public String toString() {
        return "BaseDisc{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", content='" + content + '\'' +
                ", discType='" + discType + '\'' +
                '}';
    }

    public Integer getCapacity() {
        return capacity;
    }
}
