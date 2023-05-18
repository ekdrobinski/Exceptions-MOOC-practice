package validatingParameters;
public class Calculator {
    public int factorial(int num) { //method factorial
        if(num < 0){ //throws IllegalArgumentException if num is less than 0
            throw new IllegalArgumentException();
        }
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }
        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        //throws IllegalArgumentException if subset size exceeds the set size
        if(setSize > subsetSize || setSize < 0 || subsetSize < 0 ){
            throw new IllegalArgumentException();
        }
        int numerator = factorial(setSize); //gets numerator
        //below line calculates denominator
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}