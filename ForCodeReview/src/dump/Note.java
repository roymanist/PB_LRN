package dump;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Note {


    private int height = 5;
    private int width = 20;

   public String Name = "";
   public String txt = "";


    public void DrawNote()

    {
        //Верх
for(int i = 0; i<width; i++){System.out.print('-');}
System.out.println(' ');
       //Верх

        //Название
System.out.print('|');
int centr = (width - (Name.length()-2)) / 2;

        for(int i = 0; i<centr;i++)
        {System.out.print(' ');}

        for(int i = 0; i<Name.length()-4;i++)
        {System.out.print(Name.charAt(i));}

        for(int i = 0; i< (centr +(width - Name.length()) % 2) ;i++)
        {System.out.print(' ');}


 System.out.println('|');
        //Название

        //Низ
        for(int i = 0; i<width; i++){System.out.print('-');}
        System.out.println(' ');
        //Низ
int Counter = 0;
for(int j =0;j<height;j++)
    {
        System.out.print('|');

        for(int i =0;i<width-2;i++)
        {
            if (Counter < txt.length()){System.out.print(txt.charAt(Counter)); Counter++;}else{System.out.print(' ');}
        }


            System.out.println('|');
    }
        //Низ
        for(int i = 0; i<width; i++){System.out.print('-');}
        System.out.println(' ');
        //Низ



    }


}





