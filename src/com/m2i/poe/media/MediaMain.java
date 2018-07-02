package com.m2i.poe.media;

public class MediaMain {

    public static void main(String[] args) {
        IMedia m2 = new Media(0,"",0);
        IMedia m = new Book(1,"Java",10);
        m = new Cd(2,"A que Johnny",20);
        m = new Dvd(3, "Rambo 12", 30);
        System.out.println(m.getNetPrice());
        m.setPublisher(new Publisher(4,"Gaumont"));
        m.getAuthorList().add(new Author(5,"Silvester","Stallone"));
        int zone = ((Dvd) m).getZone();
    }
}
