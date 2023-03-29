import java.util.*;
public class key_value_01 {
    public static void main(String[] args) {
        Map<Integer, String> vehicles = new HashMap<>();
        vehicles.put(1, "Cycle");
        vehicles.put(10, "Motor Bike");
        vehicles.put(11, "Car");
        vehicles.put(15, "Bus");
        vehicles.put(18, "Truck");

        for( Map.Entry<Integer, String> entry : vehicles.entrySet() ){//for keys and value
            System.out.println( entry.getKey() + " = " + entry.getValue() );
        }
        for(Integer keys : vehicles.keySet()){// for keys
            System.out.println( keys );
        }

        for(String value : vehicles. values()){//for value
            System.out.println( value );
        }


    }
}
