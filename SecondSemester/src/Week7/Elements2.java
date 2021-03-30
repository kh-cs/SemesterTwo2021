package Week7;

/**
 * Created by Khaled Jalal on 3/8/2021.
 */
public class Elements2 {
    private String name ;
    private float price ;
    private int q ;

    public Elements2(String name, float price, int q) {
        this.name = name;
        this.price = price;
        this.q = q;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQ() {
        return q;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        String s = name+"    "+q+"    "+price+"  ";
        return s;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQ(int q) {
        this.q = q;
    }
}
