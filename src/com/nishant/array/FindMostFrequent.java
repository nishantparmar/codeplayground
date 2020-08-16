package com.nishant.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FindMostFrequent {

	final static int[] INPUT = {1,5,1,9,9,5,1,9,7,7,9,9}; 
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> aMap = new HashMap<Integer, Integer>();
		
		for(int i=0; i< INPUT.length;i++) {
			if(aMap.get(INPUT[i]) != null){
				aMap.put(INPUT[i], aMap.get(INPUT[i]) +1);
			}else {
				aMap.put(INPUT[i], 1);
			}
		}//O(n)
		
		int maxCount = 0;
		int number = 0;
		
		 Iterator<Entry<Integer, Integer>> it = aMap.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry<Integer, Integer> pair = it.next();
		        if((Integer)pair.getValue() > maxCount) {
		        	maxCount = (Integer)pair.getValue();
		        	number = (Integer)pair.getKey();
		        }
		    }//O(n)
		
		    System.out.println(number);
		    System.out.println(maxCount);

	}

}
