import ru.MyException.MyException;
import ru.planets.*;

import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean exist=false;
        Scanner in = new Scanner(System.in);
            String planetName = in.nextLine().toUpperCase();
            try {
                for (Planet planets : Planet.values()) {
                        if (planets.name().equals(planetName)) {
                            planets.getInfo();
                            exist=true;
                        }
                }
                if (!exist)
                    throw new MyException();
            }
            catch (MyException ex){
            System.out.println("wrong planet");
        }
    }
}
