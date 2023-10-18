import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте! Введите наименование интересующего Вас товара: ");
        String name=scanner.nextLine();

        System.out.println("Введите колличество товара: ");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Некоректный ввод, повторите попытку");
        }
        int quantity=scanner.nextInt();

        System.out.println("Введите адрес доставки: ");
        scanner.nextLine();
        String address=scanner.nextLine();

        System.out.println("Введите контактный номер телефона: ");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Некоректный ввод, повторите попытку");
        }
        int telephone=scanner.nextInt();
        scanner.close();

        System.out.printf("Ваш заказ принят!\n" +
                       "Товар: %s в количестве %d, прибудет к Вам в ближайшее время.\n" +
                       "Товар доставим по адресу: %s.\n" +
                      "Ваш контактный номер: %d \n", name, quantity,address,telephone);

    }

}




