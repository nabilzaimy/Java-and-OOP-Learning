package JavaBasic.Strings;

public class SubtringMethod {

    public static void main(String[] args){

        String email = "nabil@gmail.com";
        String name;
        String index;
        String domain;

        index = email.substring(1,5);
        name = email.substring(0,email.lastIndexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);


        System.out.println(index);
        System.out.println(name);
        System.out.println(domain);


    }
}
