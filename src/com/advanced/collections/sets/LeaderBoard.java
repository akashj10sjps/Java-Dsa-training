package com.advanced.collections.sets;

import java.util.*;

public class LeaderBoard {
    public static void main(String[] args) {
        Set<Integer> scores=new HashSet<>();
        scores.add(200);
        scores.add(100);
        scores.add(150);
        scores.add(450);
        scores.add(300);
        System.out.println("Board stats:"+scores);
        Set<Integer> score=new TreeSet<>(Collections.reverseOrder());
        score.add(200);
        score.add(100);
        score.add(150);
        score.add(450);
        score.add(300);
        System.out.println("Board stats using treeset:"+score);
    }
}
