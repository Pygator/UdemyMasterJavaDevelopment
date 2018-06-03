package udemy.masterjavadevelopment;

public class MyUtils {

    public static String printSomeJunk(String inJunk) {
        System.out.println("Some bla bla bla " + inJunk);
        return inJunk;
    }

    public static int printSomeJunk(int inJunk) {
        System.out.println("Hey we got an integer!");
        System.out.println("Some bla bla bla " + inJunk);
        return inJunk;
    }

    public static void sum2Numbers(int firstArg, int secondArg) {

        System.out.println(firstArg + secondArg);
    }

    public static int add10(int someArgument) {
        int result = someArgument +10;
        return result;
    }

}
