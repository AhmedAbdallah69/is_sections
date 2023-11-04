public class minutesInYears {
    public static void main(String[] args){
        double minutes = 1000000000;

        int minutesPerHour = 60;
        int hoursPerDay = 24;
        int daysPerYear = 365;

        int minutesPerYear = minutesPerHour * hoursPerDay * daysPerYear;
        int minutesPerDay = minutesPerHour * hoursPerDay;

        double days = (minutes%minutesPerYear)/minutesPerDay;
        minutes -= (minutes%minutesPerYear);
        double years = minutes/minutesPerYear;
        System.out.println(years);
        System.out.println(days);

    }
}
