package Revision.SmartDeviceStatusLogger;

public class Main {
    public static void main(String[] args){


        // Chapters Covered: Chapter 39 (OOP), Chapter 40 (Constructors), and Chapter 47 (toString Method).

        // A smart home IoT platform needs a clean representation of its connected gadgets.
        // You will build a class that overrides the built-in Java toString method
        // to format device diagnostics nicely when printed to the console.

        SmartPlug smartPlug = new SmartPlug("Phone" , 3.62 , true);

        System.out.println(smartPlug);

    }
}
