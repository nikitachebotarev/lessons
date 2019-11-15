import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();

        Worker w1 = new Worker();
        w1.name = "Семен";
        w1.secondName = "Казинский";
        w1.spec = "Пастух";

        Worker w2 = new Worker();
        w2.name = "Петруха";
        w2.secondName = "Самуэльский";
        w2.spec = "Бездомный";

        Worker w3 = new Worker();
        w3.name = "Периславль";
        w3.secondName = "Котов";
        w3.spec = "Ферзь местный";

        workers.add(w1);
        workers.add(w2);
        workers.add(w3);

        if (args.length < 2) {
            System.out.println("Неверное колличество параметров, введите имя и фамилию");
        } else {
            for (Worker worker : workers) {
                if (worker.name.equalsIgnoreCase(args[0]) && worker.secondName.equalsIgnoreCase(args[1])) {
                    System.out.println(String.format("%1$s %2$s %3$s", worker.name, worker.secondName, worker.spec));
                    return;
                }
            }
        }
    }

    public static class Worker {

        public String name;
        public String secondName;
        public String spec;
    }
}
