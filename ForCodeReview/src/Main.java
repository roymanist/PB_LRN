import services.services;
import dump.Note;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {


        services FUNC = new services();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("1. Чтение заметок");
            System.out.println("2. Создание заметки");
            System.out.println("3. удаление");
            System.out.println("4. Выход");
            System.out.print("Введите Ваш выбор: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    Note[] tstNote = FUNC.ReadNote(FUNC.PATH);


                    for (int i = 0; i < tstNote.length; i++) {
                        tstNote[i].DrawNote();
                    }
                    break;


                case 2:

                    FUNC.NewNote(FUNC.PATH);
                    break;


                case 3:

                    FUNC.DelNote(FUNC.PATH);
                    break;

                case 4:

                    System.out.println("Выход...");
                    return;

                default:
                    System.out.println("Неверный выбор");
            }

        }
    }
}