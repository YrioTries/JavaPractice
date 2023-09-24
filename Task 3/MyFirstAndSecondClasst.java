class MyFirstClass {
    public static void main(String[] args) {

        MySecondClass o = new MySecondClass(3, 2);
        System.out.println(o.ost());

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {

                o.setA(i);
                o.setB(j);

                System.out.print(o.ost());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass {
    private int a;
    private int b;

    MySecondClass(int x, int y){ a = x; b = y;}


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