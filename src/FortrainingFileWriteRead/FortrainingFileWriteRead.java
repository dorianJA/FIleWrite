package FortrainingFileWriteRead;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class FortrainingFileWriteRead {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream outputStream = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        byte[] buffer  = new byte[1000];
        while(inputStream.available()>0){
            int count = inputStream.read(buffer);
            outputStream.write(buffer,0,count);
        }

    }
}
