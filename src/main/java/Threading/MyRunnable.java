package Threading;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 1 ; i <=10 ; i++){
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }

            if(i == 10){
                System.out.println("Times Up !");
                System.exit(0);

            }
        }
    }
}
