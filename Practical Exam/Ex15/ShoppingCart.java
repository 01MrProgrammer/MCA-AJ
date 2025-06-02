import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class ShoppingCart implements Serializable {
private List<String> items;
private List<Double> prices;
public ShoppingCart() {
items = new ArrayList<>();
prices = new ArrayList<>();
}
public void addItem(String item, double price) {
items.add(item);
prices.add(price);
}
public void removeItem(int index) {
items.remove(index);
prices.remove(index);
}
public List<String> getItems() {
return items;
}
public List<Double> getPrices() {
return prices;
}
public double getTotal() {
double total = 0;
for (double price : prices) {
total += price;
}
return total;
}
}