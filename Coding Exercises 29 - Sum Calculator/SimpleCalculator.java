public class SimpleCalculator {
    // write your code here
    private double firstNumber, secondNumber;
    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public void setFirstNumber(double n){
        firstNumber = n;
    }
    public void setSecondNumber(double m){
        secondNumber = m;
    }
    public double getAdditionResult(){
        return (firstNumber+secondNumber);
    }
    public double getSubtractionResult(){
        return (firstNumber-secondNumber);
    }
    public double getMultiplicationResult(){
        return (firstNumber*secondNumber);
    }
    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }
        return (firstNumber/secondNumber);
    }
}