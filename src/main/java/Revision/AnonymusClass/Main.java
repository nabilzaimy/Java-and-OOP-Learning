package Revision.AnonymusClass;

public class Main {
    public static void main(String[] args){

        // CHAPTER 63: ANONYMOUS CLASSES

        // You are developing a quick prototype for a mobile app button click listener.
        // Instead of creating a separate, dedicated class file just to handle a single click event callback,
        // you want to instantiate an interface inline and override its onClick() method directly where it is needed.

        Click click = new Click(){
          @Override
          public void onClick(){
              System.out.println("YOU CLICK THIS");
          }
        };

        click.onClick();
    }
}
