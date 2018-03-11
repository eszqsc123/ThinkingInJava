package org.nt.think1;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        try {
            new A().f();
            System.out.println("stop");
        } finally {
            return;
        }
    }
}

class A {
    public void f() throws IOException {}
}
