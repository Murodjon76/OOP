public class Botle extends Product {
    private int volime;

    public Botle(String name , double price, int volime) {
        super(name, price);
        this.volime = volime;
    }

    public Integer getVolime() {
        return volime;
    }

    public void setVolime(int volime) {
        this.volime = volime;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", volime=" + volime;
    }
}
