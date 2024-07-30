package com.rd;

public class Main {

    public static void main(String[] args) {
        CreateTable.createTable();
        InsertData.insertData();
        SelectData.selectData();
        DeleteData.deleteData("John");  // "John" adındaki veriyi siler
        SelectData.selectData();  // Son durumu kontrol eder
    }
}

