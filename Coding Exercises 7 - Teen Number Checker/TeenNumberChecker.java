public class TeenNumberChecker {
    public static boolean hasTeen(int i1,int i2,int i3){
        if((i1<=19 && i1>=13) || (i2<=19 && i2>=13) || (i3<=19 && i3>=13)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isTeen(int i4){
        if(i4<=19 && i4>=13){
            return true;
        }else{
            return false;
        }
    }
}