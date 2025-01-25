package controller;

import java.util.List;

public interface ICrudMethods {
    void create();
    Object read();
    void delete();
    Object update();
    Object search();
    List<Object> all();
}
