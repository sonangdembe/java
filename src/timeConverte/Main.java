package timeConverte;

class converter{
    void intoMin(){
        int minTime = 24*60;
        System.out.println("minTime:"+minTime);
    }
    void intoSec(){
        int secTime = 24*60*60;
        System.out.println("secTime:"+secTime);
    }
}
public class Main {
    public static void main(String[] args){
     converter convertTime = new converter();
     convertTime.intoMin();
        convertTime.intoSec();
    }
}
