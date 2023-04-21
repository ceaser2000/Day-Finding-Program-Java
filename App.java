
/* Date -> Day i.e Monday,Tuesday etc finding Program */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* Taking Date as an input from the user. */
        
        String date = "";
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter date in this Format [DD-MON-YYY] i.e 01-APR-2000: ");
        date = cs.next();
        cs.close();

        /* Converting the given string into UpperCase */
        date = date.toUpperCase();

        if (date.length() > 11) {
            System.out.println("Exceeding Date Format Length Please Retry!!!");
            System.exit(0);
        }


        /* Selecting Month Number */
        String month = date.substring(3, 6);

        int monNum = 0;
        switch (month) {
            case "MAR":
                monNum = 1;
                break;
            case "APR":
                monNum = 2;
                break;
            case "MAY":
                monNum = 3;
                break;
            case "JUN":
                monNum = 4;
                break;
            case "JUL":
                monNum = 5;
                break;
            case "AUG":
                monNum = 6;
                break;
            case "SEP":
                monNum = 7;
                break;
            case "OCT":
                monNum = 8;
                break;
            case "NOV":
                monNum = 9;
                break;
            case "DEC":
                monNum = 10;
                break;
            case "JAN":
                monNum = 11;
                break;
            case "FEB":
                monNum = 12;
                break;
            default:
                System.out.println("Invalid Month Value Please Enter Correctly!!!");
        }
     

        /* If given date has JANUARY or FEBRUARY then -1 from the year. */
        int year = Integer.parseInt(date.substring(7, 11));
        switch (month) {
            case "JAN":
                year = year - 1;
                break;
            case "FEB":
                year = year - 1;
                break;
        }

        /* Extrating last and first two digits of Year */
        String NewYear = String.valueOf(year);
        int firstYearTwoDig = Integer.parseInt(NewYear.substring(0, 2));
        int lastYearTwoDig = Integer.parseInt(NewYear.substring(2));

        /* Extracting day of the month i.e 1,2,3,4,5 etc */
        int day = Integer.parseInt(date.substring(0, 2));

        /* Using Zeller Method to calculate the day of the given date. */
        // int zell = (int) (k + ((13 * m - 1) / 5) + D + (D / 4) + (c / 5) - 2 *
        // i.e int zell = (int) (day + ((13 * monNum- 1) / 5) + lastYearTwoDig +
        // (lastYearTwoDig / 4) + (firsYearTwoDig / 5) - 2 *firstYearTwoDig);
        int v = (13 * monNum - 1) / 5;
        int x = lastYearTwoDig / 4;
        int y = firstYearTwoDig / 4;
        int z = 2 * firstYearTwoDig;

        int zell_value = day + v + lastYearTwoDig + x + y - z;

        if (zell_value > 0) {
            int day_code = zell_value % 7;
            switch (day_code) {
                case 0:
                    System.out.println("On " + date + " it was " + "Sunday");
                    break;
                case 1:
                    System.out.println("On " + date + " it was " + "Monday");
                    break;
                case 2:
                    System.out.println("On " + date + " it was " + "Tuesday");
                    break;
                case 3:
                    System.out.println("On " + date + " it was " + "Wednesday");
                    break;
                case 4:
                    System.out.println("On " + date + " it was " + "Thursday");
                    break;
                case 5:
                    System.out.println("On " + date + " it was " + "Friday");
                    break;
                case 6:
                    System.out.println("On " + date + " it was " + "Saturday");
                    break;
                default:
                    System.out.println("Invalid !!!");
            }
        } else if (zell_value < 0) {
            int day_code = zell_value % 7;
            day_code = day_code + 7;
            switch (day_code) {
                case 0:
                    System.out.println("On " + date + " it was " + "Sunday");
                    break;
                case 1:
                    System.out.println("On " + date + " it was " + "Monday");
                    break;
                case 2:
                    System.out.println("On " + date + " it was " + "Tuesday");
                    break;
                case 3:
                    System.out.println("On " + date + " it was " + "Wednesday");
                    break;
                case 4:
                    System.out.println("On " + date + " it was " + "Thursday");
                    break;
                case 5:
                    System.out.println("On " + date + " it was " + "Friday");
                    break;
                case 6:
                    System.out.println("On " + date + " it was " + "Saturday");
                    break;
                default:
                    System.out.println("Invalid !!!");
            }
        }

    }
}
