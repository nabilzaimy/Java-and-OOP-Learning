package package1;

import package2.*;

public class A {

//    Modifier     |  Class  | Package |  Subclass  |  World
//    public       |    Y    |   Y     |     Y      |    Y
//    protected    |    Y    |   Y     |     Y      |    N
//    no modifier  |    Y    |   Y     |     N      |    N
//    private      |    Y    |   N     |     N      |    N

    public static void main(String[] args){

        C c = new C();
        System.out.println(c.publicMessage);


    }
}
