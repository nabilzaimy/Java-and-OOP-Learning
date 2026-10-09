package CompositionExc1;

public class Processor {

    String model;

    Processor(String model){
        this.model = model;
    }

    @Override
    public String toString(){
        return this.model;
    }
}
