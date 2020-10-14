package com.mobvista.dataplatform;

public class TimeStoryMagazine extends AbstractMagazine {
    @Override
    public void publishNews(String news) {
        readers.forEach(reader -> reader.getNews("[Story Time]" + news));
    }
}
