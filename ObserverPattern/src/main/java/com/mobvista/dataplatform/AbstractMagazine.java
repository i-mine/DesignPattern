package com.mobvista.dataplatform;

import java.util.ArrayList;
import java.util.Collection;

public abstract class AbstractMagazine {
    protected Collection<IReader> readers = new ArrayList<IReader>();

    public abstract void publishNews(String news);

    public void addReader(IReader reader){
        readers.add(reader);
    }

    public void removeReader(IReader reader){
        readers.remove(reader);
    }

}
