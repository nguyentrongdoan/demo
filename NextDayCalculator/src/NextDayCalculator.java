public class NextDayCalculator {
    public static String nextDay(int inputDay, int inputMonth, int inputYear) {
        if (inputDay == 31 && inputMonth == 1) {
            inputDay = 1;
            inputMonth++;
        } else
            return (inputDay + 1) + "-" + inputMonth + "-" + inputYear;

    }
}
