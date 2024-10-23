package datastructures.devsuperior.topicoinicial;

public class ProductMain {
    public static void main(String[] args) {
        var p1 = new Product("Laptop", 1000.00, 5);
        var p2 = new Product("Headphones", 200.00, 2);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }
}
