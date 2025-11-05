package aw.sp.beans;

import java.util.List;

public class Subjects {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "list=" + list +
                '}';
    }
}
