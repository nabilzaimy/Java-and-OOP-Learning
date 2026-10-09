package OOP.Interfaces;

public class Fish implements Prey,Predator{

    @Override
    public void hunt() {
        System.out.println("Fish is hunting smaller Fish");
    }

    @Override
    public void flee() {
        System.out.println("Fish is fleeing from bigger Fish");
    }
}
