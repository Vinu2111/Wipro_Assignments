package wiprofirst.allasiment;

import java.util.LinkedList;
import java.util.List;

import java.util.LinkedList;
import java.util.List;

public class secondassiment {
    public static void main(String[] args) {
        List<String> task = new LinkedList<>();
        task.add("pen!");
        task.add("pencil");
        task.add("eraser!");
        task.add("book");

        List<String> toFront = new LinkedList<>();

        for (String tt : new LinkedList<>(task)) { // loop over a copy
            if (tt.endsWith("!")) {
                task.remove(tt);
                toFront.add(tt); // collect items to move
            }
        }

        for (int i = toFront.size() - 1; i >= 0; i--) {
          task.add(0, toFront.get(i));
        }

        System.out.println("Updated list:");
        for (String t : task) {
            System.out.println(t);
        }
    }
}

