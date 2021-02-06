package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Marcin", "Kasia", "Ania"));

      /*  for (String name : names) {
            System.out.println(name);
        }*/

        Iterator<String> namesIterator = names.iterator();

        while (namesIterator.hasNext()){
            String name = namesIterator.next();
            System.out.println(name);
            if (name.equals("Marcin")) {
                namesIterator.remove();
            }
        }
        System.out.println(names);




    }


}
