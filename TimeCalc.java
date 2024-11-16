public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        
        int hours = Integer.parseInt(String.valueOf(time.substring(0, 2)));
        int minutes = Integer.parseInt(String.valueOf(time.substring(3, 5)));
        int minutesToAdd = Integer.parseInt(args[1]);

        int totalMinutes = hours*60 + minutes + minutesToAdd;

        int newHour = (totalMinutes/60) % 24;
        int newMinutes = totalMinutes % 60;

        System.out.println(((newHour<10) ? "0" + newHour : newHour) + ":" + ((newMinutes<10) ? "0" + newMinutes : newMinutes));
    }
}
