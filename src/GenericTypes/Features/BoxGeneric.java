package GenericTypes.Features;

public class BoxGeneric<T> {
    private int length;
    private int width;
    private T content;

    public BoxGeneric(int length, int width, T content) {
        this.length = length;
        this.width = width;
        this.content = content;
    }

    public int getLenght() {
        return length;
    }

    public void setLenght(int lenght) {
        this.length = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "BoxGeneric{" +
                "lenght=" + length +
                ", width=" + width +
                ", content=" + content +
                '}';
    }
}