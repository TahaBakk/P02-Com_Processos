import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by x3727349s on 19/10/16.
 */
public class Main {

    public static void main(String[] args) {

        String salida = null;
        String comando = "python convertToMayus.py Hey hola";

        try {

            Process proceso = Runtime.getRuntime().exec(comando);

            InputStreamReader entrada = new InputStreamReader(proceso.getInputStream());
            BufferedReader stdInput = new BufferedReader(entrada);


            while ((salida = stdInput.readLine()) !=null){
                System.out.println(salida);
            }


        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
