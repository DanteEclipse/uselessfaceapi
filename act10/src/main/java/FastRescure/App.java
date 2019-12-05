package FastRescure;
/*
Oh Deamn!
*/

import org.apache.log4j.*;
import java.util.*;
import facebook4j.*;


public class App {
private static final Logger logthis = LogManager.getLogger(App.class);
public static Scanner read = new Scanner(System.in);
public static final Facebook faceapi = new FacebookFactory().getInstance();

    public static void main(final String[] args)  throws FacebookException { 

        System.out.println("Hola...");

        String username = faceapi.getName();

        System.out.println(username);

        logthis.info(faceapi.getName());
    }  
       

}