public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int mega = kiloBytes/1024;
            // double mega2 = (double)kiloBytes/1024;
            // // System.out.println(""+mega2);
            // mega2 = Math.round((mega2 - mega)*1000);
            int rnd = kiloBytes % 1024;
            System.out.println(""+kiloBytes +" KB = "+mega+" MB and "+rnd+" KB");
        }
    }
}