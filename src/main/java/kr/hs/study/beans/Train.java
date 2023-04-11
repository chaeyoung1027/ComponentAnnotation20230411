package kr.hs.study.beans;

import lombok.Data;
import org.springframework.stereotype.Component;


public class Train {
    String name;
    int num;
    String nickname;

    public Train(String name, int num, String nickname){
        this.name = name;
        this.num = num;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getNickname() {
        return nickname;
    }
}
