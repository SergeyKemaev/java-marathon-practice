public class Application {

    public static void main(String... args) {
        // Создаем объект Человек
        Person pers = new Person("123", "Иванов Иван");

        System.out.println("Это человек. " + pers);

        // Создаем объект Друг
        Friend friend = new Friend("Петров Петр");

        System.out.println("Это друг " + friend);

        pers.setFriend(friend);
        System.out.println("Это человек с другом. " + pers);

        // Домашнее задание

        // Добавить класс Фото (name, URL) типа https://sun9-52.userapi.com/c639922/v639922888/26e01/OGWigNFvXyk.jpg)
        // Photo(String name, String url)
        // Написать метод toString() для Photo

        // Добавить поле photo в Person и внести в toString(), считаем, что фото может не быть
        // Условия:
        // Вывести информацию о человеке
        // Если фото есть, то дописать + Photo: <информация о фото>
        // Иначе дописать текст "нет фото"

        // Если друг есть, то дописать Friend: <информация о друге>
        // Иначе дописать текст "нет друзей"

        // Вывести человек с фото и другом
        // Решение присылайте на sergey.kemaev@gmail.com

    }
}
