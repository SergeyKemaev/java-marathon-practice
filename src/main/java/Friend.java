import java.util.Objects;

public class Friend {
    public String name;

    public Friend(String name) {
        this.name = name;
    }

    public String toString() {
        return "Друг. Имя: " + this.name;
    }

    // Проверяет, что объекты равны
    // если a.equals(b) == true, то a.hashCode() == b.hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return name.equals(friend.name);
    }

    // Уникальный идентификатор объекта
    // Номер паспорта
    // 6300 9988877
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
