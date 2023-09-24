package myfirstpackage;

public class MySecondClass {
    private int a;
    private int b;

   public MySecondClass(int x, int y){ a = x; b = y;}


    public int getA() {
        return a;
    }

    public void setA(int number) {
        this.a = number;
    }

    public int getB() {
        return b;
    }

    public void setB(int number) {
        this.b = number;
    }

    public int ost() {
    return a % b;
    }
}