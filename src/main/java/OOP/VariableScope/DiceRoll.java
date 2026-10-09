package OOP.VariableScope;

import java.util.Random;

public class DiceRoll {

    int number = 3;
    DiceRoll(){
        int number = 1;
        System.out.println(number);
        roll();
    }

    void roll(){
        int number = 6;
        System.out.println(number);
    }
}
