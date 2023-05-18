package application;
import java.util.Random;
public class TemperatureSensor implements Sensor{
    private boolean status;

    public TemperatureSensor(){ //At first a temperature sensor is off.
        this.status = false;
    }
    public boolean isOn(){
        return this.status;
    }
    public void setOn(){
        this.status = true;
    }
    public void setOff(){
        this.status = false;
    }


    /*When the method read is called and the sensor is on,
    sensor randomly chooses an int in the range -30...30 and returns it.*/
    public int read(){
        if(!this.isOn()){ //If the sensor is off, the method read throws an IllegalStateException.
            throw new IllegalStateException();
        }
        int rnd = new Random().nextInt(61);
        return (rnd -30);
        /*Use the ready-made Java class Random to choose the random number.
        You'll get an integer in the range 0...60 by calling
        new Random().nextInt(61); — to get a random integer in the range -30...30
        you'll have to subtract a suitable number from the random number in the range 0...60.*/

    }


}