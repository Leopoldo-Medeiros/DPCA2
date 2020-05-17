import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface StockMarket {
    List<StockMarket> stock = new ArrayList<StockMarket>();

     void update(Map<String, Double> stock);

}


