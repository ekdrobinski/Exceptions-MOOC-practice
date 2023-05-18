package validatingParameters;
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) { //constructor
        if(name == null|| name.isEmpty()|| name.length() < 0|| name.length() > 40){ //not over 40 characters in length nor null
            throw new IllegalArgumentException(); //if not met IllegalArgumentException is thrown
        }
        if(age < 0 || age > 120){ //age between 0 and 120
            throw new IllegalArgumentException("Age must be between 0 and 120"); //if not met IllegalArgumentException is thrown
        }
        this.name = name;//assigns like normal in constructor
        this.age = age;  //assigns like normal in constructor
    }
    //base code below
    public String getName() {
        return name;
    }
    public int getAge() {

        return age;
    }
}