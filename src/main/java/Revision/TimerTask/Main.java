package Revision.TimerTask;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){

        // Chapter 64: TimerTasks

        // You are writing a background maintenance utility for a server application.
        // The application needs to execute a database backup routine every 24 hours automatically
        // without blocking the main application thread.

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int i = 3;

            @Override
            public void run() {
                System.out.println("[ALERT] Time to clean and lube your motorcycle chain!");
                i--;
                if(i <= 0){
                    System.out.println("TASK COMPLETED!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task , 0 , 10000);
    }
}
