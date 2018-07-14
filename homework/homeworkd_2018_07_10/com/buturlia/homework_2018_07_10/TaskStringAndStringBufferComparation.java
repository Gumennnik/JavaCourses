package com.buturlia.homework_2018_07_10;

public class TaskStringAndStringBufferComparation {
    private String stringForCompare;
    private StringBuffer stringbufferForCOmpare;

    public TaskStringAndStringBufferComparation(String stringForCompare) {
        this.stringForCompare = stringForCompare;
        this.stringbufferForCOmpare = new StringBuffer(stringForCompare);
    }


    public long compareStringAndStringBuffer() {
        long result;
        int counter = 1000;


        long timeForString = System.currentTimeMillis();
        for (int i = 0; i < counter; i++) {
            stringForCompare = stringForCompare + i;

        }
        timeForString = timeForString - System.currentTimeMillis();

        long timeForStringBuffer = System.currentTimeMillis();
        for (int i = 0; i < counter; i++) {
            stringbufferForCOmpare.append(i);
        }
        timeForStringBuffer = timeForStringBuffer - System.currentTimeMillis();
//
//        System.out.println("String is " + stringForCompare);
//
//        System.out.println("Stringbuffer s " + stringbufferForCOmpare);
//
        return timeForString - timeForStringBuffer;
    }
}
