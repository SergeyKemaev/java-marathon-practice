import java.util.*;

public class Application {

    public static void main(String... args) {
        // Создаем объект Человек
        Person pers = new Person("123", "Иванов Иван");

        System.out.println("Это человек. " + pers);

        // Создаем объект Друг
        Friend friend = new Friend("Петров Петр");

        System.out.println("Это друг " + friend);

        pers.addFriend(friend);
        System.out.println("Это человек с другом. " + pers);

        // Массив - array
        // Collection

        // List, Set
        // List - список, набор объектов одного типа
        // Set - множество, набор уникальных объектов

        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Петр");
        listOfNames.add("Вася");
        listOfNames.add("Петр");
        listOfNames.add("Коля");
        listOfNames.add("Петр");

        System.out.println(listOfNames);
        System.out.println(listOfNames.contains("Петр"));

        // HashSet - "стандартное" множество, поддерживающее уникальность, но не сохраняющее порядок
        Set<String> setOfNames = new HashSet<>();
        setOfNames.add("Петр");
        setOfNames.add("Вася");
        setOfNames.add("Сергей");
        setOfNames.add("Петр");
        setOfNames.add("Коля");
        setOfNames.add("Петр");

        System.out.println(setOfNames);

        Set<Friend> setOfFriends = new HashSet<>();
        setOfFriends.add(new Friend("Петр"));
        setOfFriends.add(new Friend("Вася"));
        setOfFriends.add(new Friend("Сергей"));
        setOfFriends.add(new Friend("Петр"));

        System.out.println(setOfFriends);

        setOfFriends.remove(new Friend("Петр"));
        System.out.println(setOfFriends);

        // point1, point2, point3
        // arr -> 01
        // 00 - 1
        // 01 - 3
        // 02 - 5
        // ...
        // 09 - 321

        // 10 - ......


        // arr[0] -> 00
        // arr[5] -> 05

        // Домашнее задание

        // Написать метод addPhoto для добавления фотографии
        // Поменять тип photos на Set<Photo>:
        // добавить в Photo hashCode + equals основанные только на url, игнорируем имя
        // Поправить toString в Person, выводить текст "нет фото", когда множество фотографий пустое
        // Код выложить в свой репозиторий в GitHub и прислать ссылку в Telegram или на почту (sergey.kemaev@gmail.com)
    }
}
