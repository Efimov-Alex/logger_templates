import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.print("Введите размер списка: ");
        int size = scanner.nextInt();

        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();

        logger.log("Создаём и наполняем список");

        List<Integer> array = new ArrayList<>();
        String arrayString = "";
        for (int i = 0; i < size; i++) {
            arrayString += " ";
            int number = random.nextInt(maxValue);
            array.add(number);
            arrayString += number;
        }

        logger.log("Создаём и наполняем список" + arrayString);
        logger.log("Просим пользователя ввести входные данные для фильтрации");

        System.out.print("Введите порог для фильтра: ");
        int limit = scanner.nextInt();
        Filter filter = new Filter(limit);

        logger.log("Запускаем фильтрацию");
        List<Integer> result = filter.filterOut(array);
        arrayString = "";
        for (int i = 0; i < result.size(); i++) {
            arrayString += " ";
            arrayString += result.get(i);
        }

        logger.log("Отфильтрованный список:" + arrayString);
        logger.log("Завершаем программу");
    }
}
