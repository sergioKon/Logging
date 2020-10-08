package main.infra.logging;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.logging.*;

public class Console{
    // Obtain a suitable logger.
	public static final Logger applog = Logger.getGlobal();
    public static void main(String argv[]) throws FileNotFoundException {
        System.setOut(new PrintStream(new File("logger.log")));
        //  System.setOut(new PrintStream(new FileOutputStream("logger.log", true)));
        System.out.println(" message ");
    }
}