package com.mobvista.dataplatform;

public class ObserverPatternClient {
    public static void main(String[] args) {
        IReader studentOne = new Student();
        IReader scientistOne = new Scientist();
        AbstractMagazine timeStory = new TimeStoryMagazine();
        AbstractMagazine science = new ScienceMagazine();

        timeStory.addReader(studentOne);
        science.addReader(scientistOne);

        timeStory.publishNews("Long long time ago,the Chinese people ...");
        science.publishNews("The Three-Body World is Coming!");
    }
}
