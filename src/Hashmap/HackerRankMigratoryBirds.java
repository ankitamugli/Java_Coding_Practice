package Hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HackerRankMigratoryBirds {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int key : arr) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        int maxVal = 0;
        for (int key : map.keySet()) {
            int val = map.get(key);
            if (val > maxVal) {
                maxVal = val;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == maxVal) {
                res.add(key);
            }
        }
        
        int abc = Collections.min(res);
        System.out.println("bird: " + abc);
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}