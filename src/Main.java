import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
     Picker picker = new Picker();
     BanketReader banketReader = picker.pickReader();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите количество посетителей");
        int countOfPerson = scanner.nextInt();
        Person[] people = banketReader.readAll(countOfPerson);

        System.out.println(people[2]);

        ResultPrinter resultPrinter= new ResultPrinter();
        resultPrinter.printResult(people);
    }
}




