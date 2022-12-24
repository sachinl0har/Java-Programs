package packageSY.SYClass;

import java.io.BufferedReader;
import java.io.*;

public class SYClass {
    public int ct, mt, et;

    public void get() throws IOException {
        System.out.println("Enter marks of students for computer, maths and electronics subject out of 200 ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ct = Integer.parseInt(br.readLine());
        mt = Integer.parseInt(br.readLine());
        et = Integer.parseInt(br.readLine());
    }

}