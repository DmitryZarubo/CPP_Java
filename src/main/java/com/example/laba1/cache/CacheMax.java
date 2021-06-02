package com.example.laba1.cache;


import com.example.laba1.parametrs.Max;
import org.springframework.stereotype.Component;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Component
public class CacheMax {

    private final Set<Max> set = new HashSet<>();

    public boolean isAlreadyHashed(Max max) {return set.contains(max);}

    public void addToMap(Max max) {
        set.add(max);}

    public Max getParameter(Max max){
        ArrayList<Max> array = new ArrayList<>(set);
        return array.get(array.indexOf(max));
    }

}
