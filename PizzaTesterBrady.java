//Kabrina Brady

public class PizzaTesterBrady {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza();
        Pizza yourPizza = new Pizza("pepperoni", "extra large", 13.99);

        myPizza.setPrice(12.99);
        myPizza.setTopping("mushroom");

        String myOrder = myPizza.repeatOrder();
        String yourOrder = yourPizza.repeatOrder();
        System.out.println("My order: " + myOrder);
        System.out.println("Your order: " + yourOrder);
    }
}