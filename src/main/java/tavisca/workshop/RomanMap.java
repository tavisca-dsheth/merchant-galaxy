package tavisca.workshop;

import javax.naming.directory.Attributes;
import java.util.HashMap;

public class RomanMap {
    public static HashMap<Character, Integer> romanMap = new HashMap<>()  {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('M', 500);
        put('D', 1000);
    }};
}
