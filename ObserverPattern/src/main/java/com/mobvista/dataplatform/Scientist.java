package com.mobvista.dataplatform;

public class Scientist implements IReader{
    @Override
    public void getNews(String news) {
        System.out.println("Maybe fake news that I heard," + news);
    }
}
