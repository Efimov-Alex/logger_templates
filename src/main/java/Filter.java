import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int count = 0;

        for (int number : source) {
            if (number < treshold) {
                logger.log("Элемент '" + number + "' не подходит");
            } else {
                logger.log("Элемент '" + number + "' подходит");
                result.add(number);
                count += 1;
            }
        }

        logger.log("Прошло фильтр " + count + " элемента из " + source.size());

        return result;
    }
}