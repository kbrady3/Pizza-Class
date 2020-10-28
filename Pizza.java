//Kabrina Brady

public class Pizza {
    String topping;
    String size;
    double price;

    public Pizza(){
        setTopping("cheese");
        setSize("large");
        setPrice(9.99);
    }

    public Pizza(String topping, String size, double price){
        setTopping(topping);
        setSize(size);
        setPrice(price);
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String repeatOrder(){
        String size = getSize();
        String topping = getTopping();
        double price = getPrice();

        return "You ordered a " + size + " " + topping + " pizza for " + price + ".";
    }
}