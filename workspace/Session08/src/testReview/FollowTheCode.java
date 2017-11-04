/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testReview;

/**
 *
 * @author dkruger
 */
public class FollowTheCode {
    public static void main(String[] args) {
        T t1 = new T(5);
        t1.f();
        S s1 = new S(3,5);
        S s2 = new S(3,5) {
            public void f() {
                System.out.println("xxx");
            }
        }
}


class T {
    private int y;
    public T(int y) { System.out.println("t");
    }
    public void f() { System.out.println("f"); }
}
class S extends T {
    private int x;
    public S(int x, int y) { 
        super(y);
        this.x = x;
        System.out.println("g");
    }
    public void f()  {
        super.f();
        System.out.println("testing");
    }
}