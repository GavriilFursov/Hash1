import java.util.HashMap;
import java.util.Map;

public class Main {
    static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod " +
            "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, " +
            "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat " +
            "nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui " +
            "officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.toLowerCase().charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                int v = map.get(c);
                v++;
                map.put(c, v);
            }
        }
        System.out.println(map);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char cMax = ' ';
        char cMin = ' ';
        for (char key : map.keySet()) {
            int value = map.get(key);
            if (key != ' ' && key != ',' && key != '.') {
                if (value > max) {
                    max = value;
                    cMax = key;
                }
                if (value < min) {
                    min = value;
                    cMin = key;
                }
            }
        }
        System.out.println("Наиболее часто встречается буква (не считая пробелов и знаков препинания): " + cMax + ", встречается " + max + " раз");
        System.out.println("Реже всего встречается буква (не считая пробелов и знаков препинания): " + cMin + ", встречается " + min + " раз");
    }
}