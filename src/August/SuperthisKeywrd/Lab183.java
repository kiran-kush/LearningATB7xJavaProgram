package August.SuperthisKeywrd;

public class Lab183 {
    // super keyword
    // Used with variable
    // used with methods
    // Used with constructor
    // Super keyword in java is a refrence variable
    // that allows a sub class- child class
    // to refer its parents class
    public static void main(String[] args) {
        Car c = new Car();
       c.message();





    }
}
    class Car extends vehicle {
        private int maxspeed = 880;

        public Car() {
            super();
        }

        @Override
        void message() {
            System.out.println("this is my speed->:" + this.maxspeed);
            System.out.println("this is parent's speed->" + super.maxSpeed);
            this.message();
            super.message();
        }

    }

    class vehicle {
        public int maxSpeed = 110;

        void message() {
            System.out.println("This is my vehicle");
        }
         void message(int a) {
            System.out.println("This is my vehicle");
        }


    }





