package headfirst.iterator.dinermergeri;

import java.util.ArrayList;

public class MenuTestDrive {

  public static void main(String args[]) {
    Menu pancakeHouseMenu = new PancakeHouseMenu();
    Menu dinerMenu = new DinerMenu();
    Menu vesuvioMenu = new VesuvioMenu();
    
    ArrayList<Menu> menus = new ArrayList<>();
    menus.add(pancakeHouseMenu);
    menus.add(dinerMenu);
    menus.add(vesuvioMenu);
    
    Waitress waitress = new Waitress(menus);
    waitress.printMenu();
    //waitress.printVegetarianMenu();

//    System.out.println("\nCustomer asks, is the Hotdog vegetarian?");
//    System.out.print("Waitress says: ");
//    if (waitress.isItemVegetarian("Hotdog")) {
//      System.out.println("Yes");
//    } else {
//      System.out.println("No");
//    }
//    System.out.println("\nCustomer asks, are the Waffles vegetarian?");
//    System.out.print("Waitress says: ");
//    if (waitress.isItemVegetarian("Waffles")) {
//      System.out.println("Yes");
//    } else {
//      System.out.println("No");
//    }

  }
}
