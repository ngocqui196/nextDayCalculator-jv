import java.util.Scanner;

public class NextDayCalculator {

    public static int[] nextDay(int inputDay, int inputMonth,int inputYear) {
        final int MAXMONTH = 12;
        int[] nextDayMonthYear = {inputDay,inputMonth,inputYear};

        if (inputDay >= testDayInYear(inputMonth,inputYear)) {
            nextDayMonthYear[0] = 1;
            if (nextDayMonthYear[1] >= MAXMONTH){
                nextDayMonthYear[1] = 1;
                nextDayMonthYear[2]++;
            }else nextDayMonthYear[1]++;
        }else nextDayMonthYear[0]++;
        return nextDayMonthYear;
    }

    public static int testDayInYear(int month,int year) {
        int day;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return day = 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return day = 30;
            case 2:
                if (isLeapYear(year)) {
                    return day = 29;
                }
                return day = 28;
            default:
                return day = -1;
        }
    }

    public static boolean isLeapYear(int year){
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;
        if (isDivisibleBy4){
            if (isDivisibleBy100) {
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            }
            isLeapYear = true;
        }
        return isLeapYear;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day: ");
        int day = Integer.parseInt(sc.nextLine());
        System.out.println("Enter month: ");
        int month = Integer.parseInt(sc.nextLine());
        System.out.println("Enter year: ");
        int year = Integer.parseInt(sc.nextLine());
        int[] nextDay = nextDay(day,month,year);
        System.out.printf("Ngày hôm này là %d ,%d ,%d.",day,month,year);
        System.out.printf("Ngày tiếp theo là ngày %d  ,%d  ,%d.",nextDay[0],nextDay[1],nextDay[2]);


    }
}
