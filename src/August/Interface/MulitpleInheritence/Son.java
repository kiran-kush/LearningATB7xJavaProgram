package August.Interface.MulitpleInheritence;

public class Son implements Father, Mother {

    @Override
    public void money() {
        System.out.println("this is only one func");
    }

    @Override
    public void home() {
        System.out.println("This is only one function");
    }
}
