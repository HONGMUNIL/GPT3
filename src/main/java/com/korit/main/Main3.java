package com.korit.main;


//제네릭


import com.korit.util.ForEachPrinter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.korit.util.ForEachPrinter2.print;

public class Main3 {




    public static void main(String[] args) {
        String[] names = new String[]{"a", "b", "c"};
        Integer[] numbers = new Integer[]{1, 2, 3};
        //List.of() : 추가 변경 X
        List<Integer> list = List.of(1, 2, 3, 4, 5);


        //변경안되니 객체만들고 추가
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.add(10);


        //stream()도 사용가능 리스트를 스트림으로 변환 후 새 리스트생성
        List<Integer> list3 = list.stream().collect(Collectors.toList());
        list3.add(20);


    }

}
