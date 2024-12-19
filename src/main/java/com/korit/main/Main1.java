package com.korit.main;

import com.korit.service.ATestService;
import com.korit.service.BTestService;
import com.korit.service.TestPrint;

import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        TestPrint testPrint = null;

        ATestService atestService = new ATestService();
        BTestService bTestService = new BTestService();

        Random random = new Random();
        int randomInt = random.nextInt(100);

        if (randomInt % 2 == 0) {
            testPrint =atestService;

        }else {
            testPrint =bTestService;
        }
        testPrint.print();
    }
}
