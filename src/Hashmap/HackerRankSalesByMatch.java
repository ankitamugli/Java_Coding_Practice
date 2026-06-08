package Hashmap;

import java.util.HashMap;

public class HackerRankSalesByMatch {

	public static void main(String[] args) {

		int[] arr = {1,2,1,2,1,3,2};

		HashMap<Integer,Integer> map = new HashMap<>();

		for(int key : arr) {
			if(map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			}
			else {
				map.put(key, 1);
			}
		}

		System.out.println(map);

		int count = 0;

		for(int key : map.keySet()) {
			int val = map.get(key);
			count += val / 2;
			System.out.println(key + " " + map.get(key));
		}

		System.out.println("Pairs = " + count);
	}
}