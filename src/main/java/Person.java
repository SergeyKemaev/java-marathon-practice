import java.util.ArrayList;

public class Person {

    private String id;
    private String name;
    private Friend friend;
    private Photo photo;

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

    public void setFriend(Friend friend) {
        this.friend = friend;
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
        // Если переменная friend инициализирована (есть значение)
        if (this.friend != null) { // Если (условие)
            // если условие выполнится, то заходим сюда
            // personInfo + информация о друге
            personInfo = personInfo + ", Friend: " + this.friend;
        } else { // Иначе
            // если НЕ выполнится, то заходим сюда
            // personInfo + "нет друзей"
            personInfo = personInfo + ", нет друзей";
        }

        if (this.photo != null) {
            personInfo = personInfo + ", Фото: " + this.photo;
        } else {
            personInfo = personInfo + ", нет фото";
        }
        // вернуть окончательный personInfo
        return personInfo;
    }
}
