package com.buturlia.hm4;

import java.awt.*;
import java.util.ArrayList;

public class TaskUniversalSaver  {
    private ArrayList<Object> savedList;
    public TaskUniversalSaver()
    {
        savedList = new ArrayList<Object>();
    }

    public void addElement(Object obj)
    {
        savedList.add(obj);
        return;
    }

    public Object getElemet(int index)
    {
        try {
            return savedList.get(index-1);
        } catch (Exception e)
        {
            System.out.println("Invalid argument");
            return null;
//            e.printStackTrace();
        }

    }

    public void printAllElementsToTerminal()
    {
        for (Object a: savedList
             ) {
            System.out.println(a);
        }
        return;
    }

}
