package CompositionExc1;

public class Main {

    public static void main(String[] args) {


        Computer computer = new Computer("Dell", 16, "Intel i7");

        System.out.println(computer.brand);
        System.out.println(computer.ramGB);
        System.out.println(computer.processor);
        System.out.println(computer.processor.model);

    }
}
