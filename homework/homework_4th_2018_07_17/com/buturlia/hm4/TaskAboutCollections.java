package com.buturlia.hm4;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaskAboutCollections {

    public static ArrayList union(Set set1, Set set2)
    {
        ArrayList temporary = new ArrayList();
        set1.iterator().forEachRemaining(s -> temporary.add(s));
        set2.iterator().forEachRemaining(s -> temporary.add(s));
        return temporary;
    }

    public static Set intersect(Set set1, Set set2){
        Set temporary = new LinkedHashSet();
        set1.retainAll(set2);
        temporary.addAll(set1);
        return temporary;
    }


}
