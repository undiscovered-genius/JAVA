public class SpeedConverter {
    // write your code here
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }else{
            double con = (kilometersPerHour / 1.60934) ;
            // System.out.println(""+con);
            return (Math.round(con));
        }
    }
    public static void printConversion(double kilometersPerHour){
        double con = (kilometersPerHour / 1.609) ;
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(""+kilometersPerHour+" km/h = "+Math.round(con)+" mi/h");
            
        }
    }
}