
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private final List<Product> products;

    public HotDrinkVendingMachine(List<Product> products) {this.products = products;
    }

    public Product getProduct(String name){
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Ггорячий напиток c названием %s не найден.", name));
    }

    public HotDrink getProduct(String name, int volume, int temperature){
        for(Product product: products){
            if(product instanceof HotDrink){
                if(product.getName().equalsIgnoreCase(name) && (((HotDrink) product).getVolume() == volume) &&(((HotDrink) product).getTemperature()) == temperature){
                    return (HotDrink) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Горячий напиток c названием %s не найден.", name));
    }
}
