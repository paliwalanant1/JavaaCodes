package constructor.parameterizeconstructor.staticvalues.parameterizesixteen;

public class OrderInfo {
    public static void main(String[] args) {
        Order o = new Order("123", 2500);
        System.out.println(o.getOrderId() + " - " + o.getAmount());
    }
}
