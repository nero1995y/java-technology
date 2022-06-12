package com.base.api.objects;

import java.util.Objects;

public class Student {
    int sno;
    String name;

    public Student(int sno) {
        this.sno = sno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, name);
    }
}
