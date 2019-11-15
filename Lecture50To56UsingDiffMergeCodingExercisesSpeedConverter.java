public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        
        if (kilometersPerHour < 0) {
            return -1;
            
        }
        
        return Math.round(kilometersPerHour / 1.609);
        }
         public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour <0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
            " km/h = " + milesPerHour + 
            " mi/h ");
        }
    }
}



// main.java (Second Window)

public class main {

    public static void main(String[] args) {

        double miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);
    }
}
