package EX_04082024.singelInheritence.real;

public class Testcase2 extends Base{

    void testcase2() {
        super.Browseropen();
        close();
        getdatafromsql();
        // we are usig all the methods of parent class using extends keyword

    }

    void close() {
        super.close();
        System.out.println(gold);
    }


}
