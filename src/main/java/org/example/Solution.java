package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int[] A){
        Map<Integer, Boolean> dictionary= new HashMap<Integer, Boolean>();
        for(int i=0;i<A.length;i++){
            if(dictionary.containsKey(A[i])){
                dictionary.remove(A[i]);
            }else{
                dictionary.put(A[i],true);
            }
        }
        int result=dictionary.keySet().stream().findFirst().get();
        return result;
    }
}
