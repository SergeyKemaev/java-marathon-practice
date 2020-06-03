public class Photo {
    public String name;
    public String url;

    public Photo(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String toString() {
        return "Фото. Название: " + this.name + ", Ссылка: " + this.url;
    }
}
