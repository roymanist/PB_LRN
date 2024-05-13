package api;
import dump.Note;
import java.io.*;
import java.util.Scanner;

public class index implements iNewNote, iDeleteFile, iReadFiles
{
    public void NewNote(String PATH)
    {
        Scanner whrite =  new Scanner(System.in);
        System.out.println("Внесите название заметки");
        String NewName = whrite.nextLine()+".txt";
        System.out.println("Внесите текст заметки");
        String NewTxt = whrite.nextLine();;



        try {
            FileWriter fileWriter = new FileWriter(PATH + "/" + NewName);
            fileWriter.write(NewTxt);
            fileWriter.close();
            System.out.println("Заметка успешно создана");

        } catch (IOException e) {
            System.out.println("Произошла ошибка при создании файла или записи текста: " + e.getMessage());
        }
    }

    public void DelNote(String PATH)
    {
        File folder = new File(PATH);
        File[] files = folder.listFiles();

        for(int i =0 ; i<files.length; i++)
        {
            System.out.println( (i+1)+") "+ files[i].getName());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите файл для удаления");
        int x = scanner.nextInt();

        try
        {
            files[x - 1].delete();
            System.out.println("Успешно удалено");
        }  catch (ArrayIndexOutOfBoundsException e) {System.out.println("Вы выбрали неверный индекс файла");}
    }

    public Note[] ReadNote(String PATH)
    {

        File dir = new File(PATH);

        File[] X =  dir.listFiles();
        Note [] zam = new Note[X.length];


        for (int a = 0; a<zam.length; a++) {
            // Действия с каждым файлом
            // Например, открытие файла
            zam[a] = new Note();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(X[a]));
                zam[a].txt = reader.readLine();
                zam[a].Name = X[a].getName();

                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return zam;
    }
}
