package org.chobobdev;

import java.util.HashMap;
import java.util.Map;

public class ChapterOne {

    public Map<Character, Integer> countChar(String str){
        Map<Character,Integer> result = new HashMap<>();                                    // 리턴할 값을 저장할 값을 저장할 맵
        for (int i =0; i<str.length();i++){                                                 // for문으로 스트링의 문자 하나 하나의 인덱스를 순회
            char ch = str.charAt(i);                                                        // 각 인덱스의 문자를 charAt()을 이용하여 가져온다
            result.compute(ch,(k,v)->(v==null)? 1: ++v);                                    // compute는 람다식을 사용할 수 있게 한다, NullPointerException 를 방지하기 위해 null일때의 리턴값을 1로 지정
        }
        return result;
    }
}
