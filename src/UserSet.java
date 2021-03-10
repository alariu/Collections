import java.util.HashSet;
import java.util.Set;

public class UserSet {


        public static void main(String[] args) {
            final Set<User> hashSet1 = new HashSet<>();
            hashSet1.add(new User("Anna", 25));
            hashSet1.add(new User("Irina", 38));
            hashSet1.add(new User("Anton", 60));
            hashSet1.add(new User("Alina", 25));
            hashSet1.add(new User("Ivan", 30));
            hashSet1.add(new User("Ivan", 30));

            //вывод на консоль информации в виде: <элемент>
            for (User user : hashSet1) {
                System.out.println(user);
            }

            final Set<User> hashSet2 = new HashSet<>();
            hashSet2.add(new User("Peter", 25));
            hashSet2.add(new User("Irina", 38));
            hashSet2.add(new User("Natalia", 60));
            hashSet2.add(new User("Alina", 27));
            hashSet2.add(new User("Ivan", 30));



        }

        Set<User> compareSets (Set<User> hashSet1, Set<User> hashSet2) {
            Set<User> finalSet = new HashSet<>();
            for (User user: hashSet1) {
                if (hashSet2.contains(user)) finalSet.add(user);
            }
            return finalSet;
        }

    }

