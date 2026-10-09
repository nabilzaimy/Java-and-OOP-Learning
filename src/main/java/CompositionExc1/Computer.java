package CompositionExc1;

public class Computer {

    String brand;
    int ramGB;
    Processor processor;

    Computer(String brand ,  int ramGB , String processorModel){
        this.brand = brand;
        this.ramGB = ramGB;
        this.processor = new Processor(processorModel);
    }
}
