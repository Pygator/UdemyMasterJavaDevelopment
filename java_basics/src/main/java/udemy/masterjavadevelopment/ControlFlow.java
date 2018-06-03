package udemy.masterjavadevelopment;

public class ControlFlow {

    public static void main(String[] args) {

        boolean hungry = true;

        if (hungry) {
            System.out.println("Im starving ...");
        } else {
            System.out.println("I'm not hungry");
        }

        int hungerRating = 4;
        if (!(hungerRating == 6)) {
            System.out.println("Not Hungry");
        } else {
            System.out.println("I'm starving...");
        }

        int favoriteTemp = 75;
        int currentTemp = 100;
        String opinion = null;

        if (currentTemp < (favoriteTemp - 30)) {
            opinion = "It's Pretty Darn Cold ... ";
        } else if (currentTemp < (favoriteTemp - 20)) {
            opinion = "It's kinda cold out...";
        } else if (currentTemp > (favoriteTemp + 10)) {
            opinion = "It's hot out";
        } else {
            opinion = "it's a beautiful day...";
        }

        System.out.println(opinion);

        int month = 8;
        String monthString;

        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            default:
                monthString = "Unknown month";
                break;
        }

        System.out.println(monthString);
    }
}
