package August.EX_17082024;

public enum Colors {
          RED("#FF00012"),
         Green("#FF00123");


        private String hexValue;
        Colors(String hexValue){
            this.hexValue= hexValue;

        }

    public String getHexValue() {
        return hexValue;
    }
}
