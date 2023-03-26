import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Введите размер ");
        logger.log("Введите размер ");
        int s = scanner.nextInt();


        logger.log("Введите верхнюю границу ");    //   System.out.print("Введите верхнюю границу ");
        int s1 = scanner.nextInt();


        Random random = new Random();
        List<Integer> randomList = new ArrayList<>();

        for (int i = 0; i < s; i++) {
            int a = random.nextInt(s1);
            randomList.add(a);
        }
        logger.log("Создаем список" + randomList + " вот он");

        logger.log("теперь введите порог для фильтра ");
        int s3 = scanner.nextInt();
        Filter filter = new Filter(s3);
        randomList = filter.filterOut(randomList);

        logger.log(String.valueOf(randomList) + "Вот список");
        logger.log("Пока пока");
    }
}