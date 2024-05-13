package api;
import dump.Note;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public interface iReadFiles
{
    public Note[] ReadNote(String PATH);

}
