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
        for (int s = 0; s < source.size(); s++) {
            if (source.get(s) <= treshold) {
                result.add(source.get(s));

            } else {
                logger.log("к несчастью цифра " + source.get(s) + " выбывает");
            }
        }
        return result;
    }
}