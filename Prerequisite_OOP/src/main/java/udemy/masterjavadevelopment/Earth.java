package udemy.masterjavadevelopment;

public class Earth {

    public static void main(String[] args) {

        Human tom = new Human();
        tom.age = 5;
        tom.eyeColor = "brown";
        tom.heightInInches = 72;
        tom.name = "Tom Zsabo";
        tom.speak();

        Human joe = new Human();
        joe.age = 36;
        joe.eyeColor = "Green";
        joe.name = "Joe Greensilk";
        joe.heightInInches = 68;
        joe.speak();
    }
}
