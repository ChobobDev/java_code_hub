package org.chobobdev;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class ChapterOneTest {
    @Test
    void countCharOne(){
        Map<Character,Integer> map = new HashMap<>();
        map.put('A', 2);
        map.put('B', 2);
        map.put('C', 2);
        ChapterOne chapterone = new ChapterOne();
        assertEquals(chapterone.countChar("ABCABC"),map);
    }

    @Test
    void countCharTwo(){
        Map<Character,Integer> map = new HashMap<>();
        map.put(' ', 2);
        map.put('B', 1);
        map.put('b', 1);
        map.put('C', 1);
        map.put('e', 3);
        map.put('g', 1);
        map.put('h', 1);
        map.put('i', 2);
        map.put('n', 3);
        map.put('o', 2);
        map.put('r', 1);
        map.put('S', 1);
        ChapterOne chapterone = new ChapterOne();
        assertEquals(chapterone.countChar("Seongbin Bernie Cho"),map);
    }


}