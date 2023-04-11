package kr.hs.study.beans;

import lombok.Data;
import org.springframework.stereotype.Component;



public class Car {
    private int n;
    private String name;

    public Car() {
    }

    public Car(int n, String name) {
        this.n = n;
        this.name = name;
    }

    public int getN() {
        return n;
    }

    public String getName() {
        return name;
    }
}
