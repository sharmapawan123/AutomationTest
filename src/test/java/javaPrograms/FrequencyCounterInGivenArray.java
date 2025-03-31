package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyCounterInGivenArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,2,3,3,3,4,5,5,5,5,4};
		
		Map<Integer, Integer> freqCounterMap = new HashMap<>();
		
		for(int arrVal : arr)
		{
			freqCounterMap.put(arrVal, freqCounterMap.getOrDefault(arrVal, 0)+1);
		}
		
		for(Entry<Integer, Integer> entry : freqCounterMap.entrySet() )
		{
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
