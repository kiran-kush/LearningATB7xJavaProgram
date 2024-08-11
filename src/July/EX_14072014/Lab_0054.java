package July.EX_14072014;

public class Lab_0054 {
    public static void main(String[] args) {
        int course= 100;
        float gst= 18.765f;
        //int total_price= (course+gst);//  not allowed in java
        int total_price= (int)(course+gst);// data loss coz of narrowing the casting;
    }                                      //to over come we have to either explicilty type cast it or
}
