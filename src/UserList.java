import java.util.*;

public class UserList {

    public static void main(String[] args) {
        List<User> list1 = new ArrayList<>();
        list1.add(new User("Anna",25));
        list1.add(new User("Irina",30));
        list1.add(new User("Irina",35));
        list1.add(new User("Anton",40));
        list1.add(new User("Ivan",40));
        list1.add(new User("Ivan",40));

        //вывод на консоль информации в виде: <индекс>: <элемент>
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(i + ": " + list1.get(i));
        }

        List<User> list2 = new ArrayList<>();
        list2.add(new User("Peter",25));
        list2.add(new User("Irina",30));
        list2.add(new User("Irina",35));
        list2.add(new User("Alina",40));
        list2.add(new User("Ivan",40));
        list2.add(new User("Ivan",40));


    }

        List<User> compareLists(List<User> list1, List<User> list2) {
        List<User> finalList = new ArrayList<>();
        for (User user: list1) {
            if (list2.contains(user)) finalList.add(user);
        }
        return finalList;
    }



}





