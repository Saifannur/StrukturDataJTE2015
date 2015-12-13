import java.math.BigDecimal;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Write a description of class DataDecimal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DataDecimal
{
    public LinkList muat(String namaBerkas)throws FileNotFoundException{
        try {
            FileWriter fw = new FileWriter (namaBerkas);
            BufferedWriter berkas = new BufferedWriter (fw);
            
            berkas.close();
        }catch(IOException err) {
        }
        return null;
    }
}
