import java.util.Map;
import java.util.TreeMap;

public class UserMap {


    public static void main(String[] args) {

        Map<Integer, User> map1 = new TreeMap();
        map1.put(1, new User("Anna", 25));
        map1.put(2, new User("Irina", 30));
        map1.put(3, new User("Irina", 35));
        map1.put(4, new User("Anton",40));
        map1.put(5, new User("Ivan",40));
        map1.put(6, new User("Ivan",40));

        //итерация по значениям: <значение>
        for (User value : map1.values()) {
            System.out.println(value);
        }

        //итерация по ключам: <ключ>: <значение>
        for (Integer key : map1.keySet()) {
            System.out.println(key + ": " + map1.get(key));
        }

        //итерация по парам: <ключ>: <значение>
        for (Map.Entry<Integer, User> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
