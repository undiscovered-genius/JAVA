public class PaintJob {
    // write your code here
    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBucket){
        double area;
        double count;
        if(width>0.0 && height>0.0 && areaPerBucket>0.0 && extraBucket>=0){
           area = height*width; 
           count = area/areaPerBucket;
           count = count-extraBucket;
           count = count+1;
           return (int)count;
        }
        return -1;
    }
    public static int getBucketCount(double width,double height,double areaPerBucket){
        double area;
        double count;
        if(width>0 && height>0 && areaPerBucket>0){
           area = height*width; 
           count = area/areaPerBucket;
        //   count = count-extraBucket;
           count = count+1;
           return (int)count;
        }
        return -1;
    }
    public static int getBucketCount(double area,double areaPerBucket){
        double count;
        if(area>0 && areaPerBucket>0){
            count = area/areaPerBucket;
            count = count+1;
            return (int)count;
        }
        return -1;
    }
}