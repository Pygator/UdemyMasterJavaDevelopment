package udemy.masterjavadevelopment;


public class LearningMethods {

    public static void main(String[] args) {

        System.out.println("Oh what a day!");
        MyUtils.printSomeJunk("this is some junk");
        System.out.println("What was returned by the method? " + MyUtils.printSomeJunk("this is some junk"));

        MyUtils.printSomeJunk(55);
        System.out.println("What was returned by the method? " + MyUtils.printSomeJunk(55));
        MyUtils.sum2Numbers(10,23);

        System.out.println(MyUtils.add10(54));
    }


}
