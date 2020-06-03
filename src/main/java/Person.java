import java.util.ArrayList;
import java.util.List;

public class Person {

    private String id;
    private String name;

    private List<Friend> friends = new ArrayList<>();
    private List<Photo> photos = new ArrayList<>();

    // основные модификаторы доступа: public, private
    public Person(String newId, String newName) {
        // Создаем новый объект Person, поля не инициализированы
        this.id = newId; // задать свой id
        this.name = newName; // задаем имя
    }

    // get<Имя поля>
    public String getName() {
        return name;
    }

    public void addFriend(Friend friend) {
        this.friends.add(friend);
    }

    // Переопределяем стандартный метод
    // модификатор доступа (public), тип результата (String), имя метода (toString), аргументы (ничего нет)
    public String toString() {
        // Person. id: <айди человека>, name: <имя человека>, friend: <информация о друге>
        // Если друг есть, то вывести информацию о человеке + Friend: <информация о друге>
        // Иначе вывести информацию о человеке + текст "нет друзей"

        // if (photo != null)
        // дописать инфу о фото к personInfo
        // if (friend != null)
        // дописать инфу о друге к personInfo

        String personInfo = "Person. Id: " + this.id + ", Name: " + this.name;
        // Если переменная friends инициализирована (есть значение) и список друзей не пустой
        if (friends != null && !friends.isEmpty()) { // Если (условие)
            // если условие выполнится, то заходим сюда
            // personInfo + информация о друге
            personInfo = personInfo + ", Friends: " + this.friends;
        } else { // Иначе
            // если НЕ выполнится, то заходим сюда
            // personInfo + "нет друзей"
            personInfo = personInfo + ", нет друзей";
        }

        if (this.photos != null) {
            personInfo = personInfo + ", Фото: " + this.photos;
        } else {
            personInfo = personInfo + ", нет фото";
        }
        // вернуть окончательный personInfo
        return personInfo;
    }
}
