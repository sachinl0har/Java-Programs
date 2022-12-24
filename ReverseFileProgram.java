import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.Reader;


public class ReverseFileProgram {

    public static void main(String[] args) {

        FileInputStream fis = null;
        RandomAccessFile raf = null;

        // by default, let's use utf-8
        String characterEncoding = "utf-8";

        // but if you pass an optional 3rd parameter, we use that
        if(args.length==3) {
            characterEncoding = args[2];
        }

        try{

            // input file
            File in = new File(args[0]);
            fis = new FileInputStream(in);

            // a reader, because it respects character encoding etc
            Reader r = new InputStreamReader(fis,characterEncoding);

            // an outputfile 
            File out = new File(args[1]);

            // and a random access file of the same size as the input, so we can write in reverse order 
            raf = new RandomAccessFile(out, "rw");
            raf.setLength(in.length());

            // a buffer for the chars we want to read 
            char[] buff = new char[1];

            // keep track of the current position (we're going backwards, so we start at the end)
            long position = in.length(); 

            // Reader.read will return -1 when it reached the end.
            while((r.read(buff))>-1) {

                // turn the character into bytes according to the character encoding
                Character c = buff[0];
                String s = c+"";
                byte[] bBuff = s.getBytes(characterEncoding);

                // go to the proper position in the random access file
                position = position-bBuff.length;
                raf.seek(position);

                // write one or more bytes for the character
                raf.write(bBuff);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // clean up
            try {
                fis.close();
            } catch (Exception e2) {
            }
            try {
                raf.close();
            } catch (Exception e2) {
            }
        }


    }


}