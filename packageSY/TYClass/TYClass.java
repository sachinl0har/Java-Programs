package packageSY.TYClass;

import java.io.*;

public class TYClass {
    public int tm, pm;

    public void get() throws IOException {
        System.out.println("Enter the marks of the theory out of 400 and practicals out of 200: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        tm = Integer.parseInt(br.readLine());
        pm = Integer.parseInt(br.readLine());
    }

}
