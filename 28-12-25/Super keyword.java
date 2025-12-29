class A {
    int x = 10;
}
class B extends A {
    int x = 20;
    void show() {
        System.out.println(super.x);
    }
}
