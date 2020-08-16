package com.nishant.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CommonElementsInTwoArrays {

	final static int[] INPUT1 = {1,3,4,6,7,9}; 
	final static int[] INPUT2 = {1,2,4,5,9,10}; 
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> aMap = new HashMap<Integer, Integer>();
		
		for(int i=0; i< INPUT1.length;i++) {
			if(aMap.get(INPUT1[i]) != null){
				aMap.put(INPUT1[i], aMap.get(INPUT1[i]) +1);
			}else {
				aMap.put(INPUT1[i], 1);
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
