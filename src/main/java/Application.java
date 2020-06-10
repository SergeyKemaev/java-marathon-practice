import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Application {

    public static void main(String... args) {
        int[] arr = new int[10]; // массив, в котором 10 элементов
        // 0 - [0]
        // 1 - [0]
        // 2 - [0]
        // 3 - [0]
        // ...
        // 9 - [0]

        int j = 0;
        System.out.println("j++: " + j++);
        System.out.println("j : " + j);
        j = 0;
        System.out.println("++j : " + ++j);

        System.out.println("---------- for ----------");
        for (
                // 1. начальное условие
                int i = 0;
                // 2. условие, при котором выполняется тело цикла
                i < arr.length; // i < 10
                // 3. вспомогательное действие на каждом шаге
                i = i + 1) { // i++ ==> i = i + 1
            // тело цикла

            int a = arr[i]; // a --> область памяти до изменения arr[j], arr заполнен нулями

            // что-то делаем с a в теле цикла
            // записываем новое значение в ячейку arr[i]
            arr[i] = 10 - i; // 10 - 0, 10 - 1, ...
            System.out.println(i + " : " + a); // 1 (индекс элемента) : 0 (значение)
        }

        System.out.println("------------------------");

        System.out.println("----------- foreach -----------");
        for (int k : arr) { // объявляем переменную k, в которую кладем каждый следующий элемент коллекции
            // k - очередной элемент массива
            System.out.println(k);
        }
        System.out.println("------------------------");

        // Создаем объект Человек
        Person pers = new Person("123", "Иванов Иван");

        System.out.println("Это человек. " + pers);

        // Создаем объект Друг
        Friend friend = new Friend("Петров Петр");

        System.out.println("Это друг " + friend);

        pers.addFriend(friend);
        System.out.println("Это человек с другом. " + pers);

        Photo photo = new Photo("It's me", "https://vk.com/photos/my_photo.jpg");
        pers.addPhoto(photo);

        System.out.println("Это человек с другом и фото. " + pers);

        // Массив - array
        // Collection

        // List, Set
        // List - список, набор объектов одного типа
        // Set - множество, набор уникальных объектов
        System.out.println("-------- List --------");
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Петр");
        listOfNames.add("Вася");
        listOfNames.add("Петр");
        listOfNames.add("Коля");
        listOfNames.add("Петр");

        // Посчитать сколько Петров в списке
        for (int i = 0; i < listOfNames.size(); i = i + 1) {
            String name = listOfNames.get(i);
            System.out.println(i + " : " + name);
        }
        System.out.println(listOfNames);
        System.out.println(listOfNames.contains("Петр"));

        // HashSet - "стандартное" множество, поддерживающее уникальность, но не сохраняющее порядок
        System.out.println("-------- Set --------");
        Set<String> setOfNames = new HashSet<>();
        setOfNames.add("Петр");
        setOfNames.add("Вася");
        setOfNames.add("Сергей");
        setOfNames.add("Петр");
        setOfNames.add("Коля");
        setOfNames.add("Петр");

        for (String name : setOfNames) {
            System.out.println(name);
        }

        System.out.println(setOfNames);
        System.out.println("--------------------");

        Set<Friend> setOfFriends = new HashSet<>();
        setOfFriends.add(new Friend("Петр"));
        setOfFriends.add(new Friend("Вася"));
        setOfFriends.add(new Friend("Сергей"));
        setOfFriends.add(new Friend("Петр"));

        System.out.println(setOfFriends);

        setOfFriends.remove(new Friend("Петр"));
        System.out.println(setOfFriends);
        
        // Отсортированное множество
        // TreeSet - бинарное дерево, сортирует элементы при вставке/удалении

//        while (false) { // выполняется пока условие верно
//
//        }
//
//        String someVariable;
//        do {
//            //
//            System.out.println(setOfFriends);
//            /// someVariable = ???
//        } while (someVariable != "end"); // выполняется пока условие верно, чаще всего условие зависит от первого тела цикла

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("123", "Иванов Иван"));
        persons.add(new Person("456", "Петров Петр"));
        persons.add(new Person("789", "Сидоров Сидор"));

        System.out.println("-------- Map --------");
        // Ассоциативные массивы
        Map<String, Person> mapOfPersons = new HashMap<>();
        for (Person person: persons) {
            mapOfPersons.put(person.getId(), person);
        }
        
        System.out.println(mapOfPersons);

        System.out.println("--------- Get Person 123 ----------");
        System.out.println(mapOfPersons.get("123"));

        System.out.println("--------- Get Person Иван ----------");
        System.out.println(mapOfPersons.get("Иван"));

        System.out.println("-------------------");

        // Упорядоченное множество, элементы лежат в том порядке, в котором их добавляли
        // LinkedHashSet

        // Упорядоченный ассоциативный массив, элементы лежат в том порядке, в котором их добавляли
        // LinkedHashMap

        // Исключения, исключительные ситуации
        System.out.println("--------- Exceptions ----------");

//        readFromFile();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        try {
            int num = sc.nextInt();
            System.out.println("Вы ввели: " + num);
        } catch (InputMismatchException ime) {
            System.out.println("Вы ввели НЕ ЧИСЛО!!!");
        } catch (NullPointerException npe) {
            System.out.println("Scanner is null");
        }

        // 1. Error - ошибки (происходит в JVM - Java Virtual Machine), OutOfMemoryError
        // 2. Exceptions - исключительные ситуации - можно предсказать checked exceptions
        // 3. RuntimeExceptions - ошибки времени выполнения - нельзя предсказать, unchecked exceptions
        // 0. Throwable - что-то можеты вылететь при выполнении программы

        // Домашнее задание
        // Завести аккаунт на HackerRank, прорешать задания из категории Java Introduction
        // https://www.hackerrank.com/domains/java?filters%5Bsubdomains%5D%5B%5D=java-introduction
    }

//    public static void readFromFile() throws MyOwnDatabaseException {
//        Path somePath = Paths.get("folder1", "folder2", "folder3"); // folder1/folder2/folder3
//        try {
//            FileInputStream fis = new FileInputStream(somePath.toFile());
//            // ...
//            // ...
//            // ...
//            savePersonToDatabase();
//        } catch (Throwable t) {
//            // Обрабатываем ошибку
//            System.out.println("Файл не найден: " + somePath);
//        } catch (DatabaseException dbe) { // message: OR-32123 index something bla bla bla bla
//            throw new MyOwnDatabaseException("Database error");
//            System.out.println("Ошибка при сохранении пользователя + данные пользователя");
//        }
//    }
//
//    public static void doSomething(Person per, Photo p, Friend f) {
//        if (per == null) {
//            throw new IllegalArgumentException("Per is null");
//        }
//        per.addPhoto(null);
//
//    }
}
