package com.buturlia.hm6;

import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task_Runner {

    public static void main(String[] args) throws Exception {
//        //Task one: writing and reading from binary:
//        Task_Runner.taskOneRun();

        ShapePart processor = new ShapePart("Core i5", true,
                "China", 200, false, 100,
                true, false,false);
        System.out.println(processor.getName() + "Created");

        ShapePart computerCase = new ShapePart("NZKX", false,
                "China", 100, false, 0,
                true, false,false);
        System.out.println(computerCase.getName() + " created");

        ShapePart mouse = new ShapePart("Cool mouse", true,
                "China", 500, true, 100,
                true, false,true);
        System.out.println(mouse.getName() + " created");

        ArrayList partsArray = new ArrayList();
        partsArray.add(processor);
        partsArray.add(computerCase);
        partsArray.add(mouse);
        try {
            Task_Runner.write(partsArray,"shapeParts.xml");


        }catch (Throwable e)
        {
            System.out.println("Can't write");
        }






    }

    public static void write(ArrayList f, String filename) throws Exception{
        System.out.println("Opening read stream");
        XMLEncoder encoder = new XMLEncoder( new BufferedOutputStream(new FileOutputStream(filename)));
        System.out.println("Trying write object");
        encoder.writeObject(f);
        encoder.close();
    }

    public static ShapePart read(String filename) throws Exception {
        XMLDecoder decoder =
                new XMLDecoder(new BufferedInputStream(
                        new FileInputStream(filename)));
        ShapePart o = (ShapePart)decoder.readObject();
        decoder.close();
        return o;
    }

    public static void taskOneRun()
    {
        Random random = new Random();
        int bound = 20;

        int[] tempInt = new  int[bound];
        byte[] tempByte = new byte[bound];
        for (int i = 0; i <bound ; i++) {
            tempInt[i] = random.nextInt(bound);
            tempByte[i] = (byte) tempInt[i];
        }

        System.out.println(" ");
        for (int i: tempInt
                ) {
            System.out.print(i + " ");

        }




        try(FileWriter fileWriter = new FileWriter("temp1", false)){
            System.out.println( " writing ");
            for (int b: tempInt
                    ) {
//                System.out.println(b);
                fileWriter.write(b);
                fileWriter.write("\n");
            }

            fileWriter.flush();

        }catch (Exception e)
        {
            System.out.println("writing with error");
        }




        ArrayList readedList = new ArrayList();
        try {
            FileReader fileReader = new FileReader("temp1");

            String temp = " ";

            readedList.add(fileReader.read() ) ;

        } catch (Exception e) {
            System.out.println("Reading with error");
//            e.printStackTrace();
        }

        System.out.println("Read done, printing");

        readedList.forEach( (Object o) -> {
            System.out.print(o);
        });
        System.out.println(readedList.size());


    }



}
