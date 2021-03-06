public class MinutesToYearsDaysCalculator {
    // write your code here
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }else{
            long YY = minutes/(60*24*365);
            long DD = minutes%(60*24*365);
            long ZZ = DD/(60*24);
            System.out.println(""+minutes+" min = "+YY+" y and "+ZZ+" d");
        }
    }
}