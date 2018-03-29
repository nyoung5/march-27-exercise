package headfirst.iterator.dinermergeri;

import java.util.Iterator;
import java.util.LinkedList;

public class VesuvioMenu implements Menu{
	LinkedList<MenuItem> menuItems;

public VesuvioMenu() {
	menuItems = new LinkedList<>();
	addItem("Fettuccine Alfredo", "Fresh blended cream sauce", true, 10.25);
	addItem("Penne Crabmeat","Crabmeat sautéed in a fresh blended vodka cream sauce", false, 11.95);
	addItem("Baked Spaghetti", "Spaghetti baked with mozzarella cheese and meat sauce",false,10.50);
}


public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
      menuItems.add(menuItem);
  }


public LinkedList<MenuItem> getMenuItems() {
	return menuItems;
}


@Override
public Iterator<MenuItem> createIterator() {
	
	return menuItems.iterator();
}

}
