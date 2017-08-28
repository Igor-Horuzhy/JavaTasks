package com.xyz;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Игорь
 * 8/27/2017.
 */
public class Downloader {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Please, enter 2 arguments to start");
        }
        InputStream in = null;
        FileOutputStream fileOut = null;
        try{
            URL remote = new URL(args[0]);
            URLConnection con = remote.openConnection();

            fileOut = new FileOutputStream(args[1]);
            in = con.getInputStream();

            int data;
            long sum=0;

            while((data=in.read()) != -1){
                sum+=data;
                System.out.println(sum);

                fileOut.write(data);
            }

        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                in.close();
                fileOut.flush();
                fileOut.close();
            }
            catch(IOException ee){
                System.out.println("........");
            }

        }
    }
}
