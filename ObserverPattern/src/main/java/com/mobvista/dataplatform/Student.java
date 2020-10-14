package com.mobvista.dataplatform;

public class Student implements IReader {
    @Override
    public void getNews(String news) {
        System.out.println("That's a beautiful story:" + news);
    }
}
