import java.util.Scanner;

public class BanketConsolReader extends BanketReader {

    private Scanner scanner;

    public BanketConsolReader() {
       scanner = new Scanner(System.in);
    }

    @Override
    Person readLine() {
        String name = scanner.nextLine();
        Person person = new Person(name);
        return person;
    }


    }


