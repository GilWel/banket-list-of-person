import java.io.FileNotFoundException;
import java.util.Scanner;

public class Picker {
    public BanketReader pickReader() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите, откуда получать данные: 1 - файл; 2- консоль");
        int switcher = scanner.nextInt();
scanner.nextLine();
        BanketReader banketReader = null;

        if (switcher == 1) {
            System.out.println("Введите имя файла");
            String str = scanner.nextLine();
            banketReader = new BanketFileReader(str);
        }
        if (switcher == 2) {
            banketReader = new BanketConsolReader();
        }
        return banketReader;
    }
}

