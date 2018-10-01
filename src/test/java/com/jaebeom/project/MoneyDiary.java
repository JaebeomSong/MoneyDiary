package com.jaebeom.project;
import java.time.LocalDateTime;
import java.lang.String;

public class MoneyDiary{
    LocalDateTime 날짜;
    String 내용;
    int 수입;
    int 지출;
    int 잔액 = 10;

    public static void main(String[] args){
        MoneyDiary moneyDiary = new MoneyDiary();

        System.out.print(moneyDiary.잔액);
    }

}