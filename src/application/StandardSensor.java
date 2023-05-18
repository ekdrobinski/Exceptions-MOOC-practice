package application;

public class StandardSensor implements Sensor {

    private int number;

    public StandardSensor(int number){//The StandardSensor must have a constructor that takes one integer parameter.
        this.number = number;
    }

    public boolean isOn(){
        return true;
    }

    public void setOn(){ //Calling the methods setOn and setOff have no effect.

    }

    public void setOff(){//Calling the methods setOn and setOff have no effect.
    }

    public int read(){ //The method call read returns the number that was given to the constructor.
        return this.number;
    }


}