package com.company.chapter13;

public class ThreadEx11_2 extends Thread{

    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println(new String("|"));
        }
    }
}
