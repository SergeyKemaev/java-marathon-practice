import java.util.Objects;

public class Photo {
    public String name;
    public String url;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return url.equals(photo.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url);
    }

    public Photo(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String toString() {
        return "Фото. Название: " + this.name + ", Ссылка: " + this.url;
    }
}
