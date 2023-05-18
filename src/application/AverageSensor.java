package application;
import java.util.ArrayList;
import java.util.List;
public class AverageSensor implements Sensor {
    private List<Sensor> list;
    private List<Integer> reading;

    public AverageSensor(){ //constructor
        this.list = new ArrayList<>();     //initializes new empty lists
        this.reading = new ArrayList<>();  //initializes new empty lists
    }
    public boolean isOn(){ //to check if all sensors are "on"
        for(Sensor sensor: this.list){
            if(!sensor.isOn()){ //if sensor is not "on"
                return false;
            }
        }
        return true;
    }
    @Override
    public void setOn(){  //turns on all sensors in list
        for(Sensor sensor: this.list){
            sensor.setOn();
        }
    }
    @Override
    public void setOff(){ //turns off all sensors in list
        for(Sensor sensor: this.list){
            sensor.setOff();
        }
    }
    @Override
    public int read(){
        if(!(this.isOn() || this.list.isEmpty())){ //checks if sensor is on or off
            throw new IllegalStateException(); //exception to ensure only readings taken during sensor on
        }
        int sum = 0; //beginning value to get sum
        for(Sensor sensor: this.list){  //for loop iterates over Sensor objectin the list
            sum += sensor.read(); //adds values of all readings
        }
        int average = sum / this.list.size();
        this.reading.add(average); //to add the average readings over the time period
        return average;
    }
    public void addSensor(Sensor toAdd){ //the AverageSensor has the method public void addSensor(Sensor toAdd)
        this.list.add(toAdd); //used to add a new sensor for the average sensor to control
    }
    public List<Integer> readings(){//Part 4: Add to the class AverageSensor the method public List<Integer> readings(). //return type of integers
        return this.reading; // returns the reading list
    }
}