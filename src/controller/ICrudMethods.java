package controller;

import entity.Book;

import java.util.Map;

public interface ICrudMethods {
    Book create();
    Map delete();
    Map update();
    Map read();


}
