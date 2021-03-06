public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double d1,double d2){
        d1 = d1*1000;
        d2 = d2*1000;
        int i1 = (int)d1;
        int i2 = (int)d2;
        if(i1 == i2){
            return true;
        }else{
            return false;
        }
    }
}