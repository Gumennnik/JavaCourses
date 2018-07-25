package com.buturlia.hm4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TaskAboutConvertation implements CanConvertToArrayList {

    private Object[] strings;
    private Object[] doubles;

//    public TaskAboutConvertation(Object[] a ) {
//        if(a instanceof String[]) {
//            this.strings = (String[]) a.clone();
//        }else if (a instanceof Double[]){
////            this.doubles = (Double[]) a.clone();
////        } else {
////            throw new Error();
////        }
//
//    }

    public List convertToList(Object[] objectArray) {

        return Arrays.asList(objectArray);
    }
}
