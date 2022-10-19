import org.testng.annotations.Test;

import java.sql.SQLOutput;
public class Homwork2Practic {
    @Test
    public void testingHomwork2() {
      Homwork2 firstMobile   =  new Homwork2();
      firstMobile.setModel("Samsung");
              firstMobile.setScreenSize(5.5);
                      firstMobile.setMaterial("plastic");
   Homwork2 secondMobile = new Homwork2();
   secondMobile.setModel("nokia");
   secondMobile.setScreenSize(4.5);
   secondMobile.setMaterial("metal");
        System.out.println("First Mobil");
        System.out.println(firstMobile.getModel());
        System.out.println(firstMobile.getScreenSize());
        System.out.println(firstMobile.getMaterial());
}
}