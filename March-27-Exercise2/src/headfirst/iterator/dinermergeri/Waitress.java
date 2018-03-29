package headfirst.iterator.dinermergeri;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Waitress {

  private List<Menu> menus;

  public Waitress(List<Menu> menus) {//Menu pancakeHouseMenu, Menu dinerMenu) {
    this.menus = menus;
  }

 /* public boolean isItemVegetarian(String name) {
    Iterator pancakeIterator = pancakeHouseMenu.createIterator();
    if (isVegetarian(name, pancakeIterator)) {
      return true;
    }
    Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
    if (isVegetarian(name, dinerIterator)) {
      return true;
    }
    return false;
  }
*/
  public void printMenu() {
    for (Menu menu : menus) {
    	  printMenu(menu.createIterator());
    }
  }

//  public void printVegetarianMenu() {
//    System.out.println("\nVEGETARIAN MENU\n----\nBREAKFAST");
//    printVegetarianMenu(pancakeHouseMenu.createIterator());
//    System.out.println("\nLUNCH");
//    printVegetarianMenu(dinerMenu.createIterator());
//  }

  private boolean isVegetarian(String name, Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = iterator.next();
      if (menuItem.getName().equals(name)) {
        if (menuItem.isVegetarian()) {
          return true;
        }
      }
    }
    return false;
  }

  private void printMenu(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = iterator.next();
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
    System.out.println("End of menu!");
  }

  private void printVegetarianMenu(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = iterator.next();
      if (menuItem.isVegetarian()) {
        System.out.print(menuItem.getName());
        System.out.println("\t\t" + menuItem.getPrice());
        System.out.println("\t" + menuItem.getDescription());
      }
    }
  }
}
