import java.io.*;

/**
 * Created by 201037629 on 2015-02-19.
 */
public class Terminateur implements Runnable
{
    @Override
    public void run() {


        try {
            BufferedReader reader=  new BufferedReader(new InputStreamReader( System.in ) );
            String ligne = null;

            while (ligne.equals("Q") || ligne.equals(("q")))
            {
             ligne = reader.readLine();

            }
        }
        catch (IOException e)
        {
            System.out.println(e);

        }
    }


}
