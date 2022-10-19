import org.testng.annotations.Test;

public class ObjectsPractice {
    @Test
    public void workingWithOrders(){
      Order firstOrder =  new Order();
        firstOrder.setTotalPrice(12.34);
        firstOrder.setAddress("Riga str.1");
        firstOrder.setItemCount(9);

        Order secondOrder = new Order();
        firstOrder.setTotalPrice(55.67);
        firstOrder.setAddress("Riga str.2");
        firstOrder.setItemCount(3);
System.out.println("Hello ");
        System.out.println("1st order");
        System.out.println(firstOrder.getTotalPrice());
        System.out.println("2st order");
        System.out.println(secondOrder.getTotalPrice());
    }
}
