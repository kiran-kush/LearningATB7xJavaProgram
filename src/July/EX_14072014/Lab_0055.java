package July.EX_14072014;

public class Lab_0055 {
    public static void main(String[] args) {
        int course= 100;
        float gst= 18.765f;
        //int total_price= (course+gst);//  not allowed in java
        int total_price= (course+(int)gst);// results in data loss
        // to prevent data loss
        
    }
}
