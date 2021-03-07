public class FlourPacker {
    // write your code here
    public static boolean canPack(int bigCount,int smallCount,int goal){
        if(bigCount>=0 && smallCount>=0 && goal>=0){
            if(goal==((bigCount*5)+(smallCount*1))){
                if(goal >=(bigCount+smallCount)){
                    return true;
                }
            }
        if(goal<=((bigCount*5)+(smallCount*1))){
            if(bigCount==0){
                return true;
            }else{
                for(int i=1;i<=bigCount;i++){
                    if(goal<(i*5)){
                        return false;
                    }
                    if(goal == (i*5)){
                        return true;
                    }
                    for(int j=1;j<=smallCount;j++){
                        if(goal==((i*5)+(j*1))){
                            return true;
                        }
                    }
                }
            }
        }
        }
        return false;
    }
}