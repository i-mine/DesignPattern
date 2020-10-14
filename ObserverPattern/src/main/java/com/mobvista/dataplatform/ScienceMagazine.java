package com.mobvista.dataplatform;

public class ScienceMagazine extends AbstractMagazine {
    @Override
    public void publishNews(String news) {
        readers.forEach(reader -> reader.getNews("[Science Time]" + news));
    }
}
