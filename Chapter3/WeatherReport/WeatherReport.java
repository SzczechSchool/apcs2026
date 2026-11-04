
/**
 * Write a description of class WeatherReport here.
 *
 * Kyle Szczech
 * 10/2
 */
public class WeatherReport
{
    public enum WeatherType {
        Sunny, 
        Cloudy,
        Rainy,
        Foggy,
        Windy,
        Snowy
    }
    public static void main(String[] args){
        //Create counter variable
        int rainyDays = 0;
        //Array of all possible values
        WeatherType[] options = WeatherType.values();
        // Header, Initializer, Condition, Mutator
        for ( int day = 1; day <= 7; day++) {
            // pick a random index 0 to length of enum
            WeatherType today = options[(int)(Math.random() * options.length)];
            
            System.out.println(" Weather: " + today + " day: " + day);
            //enums are ints
            if ( today == WeatherType.Rainy){
                rainyDays++;
            }
        }
        System.out.println(" rainy days: " + rainyDays);
        
        System.out.println("All Supported Weather Types:");
        
        for(WeatherType w: WeatherType.values()) {
            System.out.println("Category " + w );
        }
        
        for( int i = 0 ; i <= 99; i += 3){
            if ( i % 3 == 0){
                System.out.println(i + "");
            }
        }
        
        
        
        
        
    }
}
