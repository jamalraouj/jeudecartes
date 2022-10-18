import java.util.concurrent.atomic.AtomicInteger;

public class Carte {
    private static AtomicInteger _ID = new AtomicInteger(0);
    private int id;

    private int point ;
    private String name;
    private Shape shape;

    public Carte(int point , Shape shape) {
        this.id = _ID.incrementAndGet();
        this.point =  point;
        this.shape = shape;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "id=" + id +
                ", point=" + point +
                ", name='" + name + '\'' +
                ", shape=" + shape +
                '}';
    }
}
