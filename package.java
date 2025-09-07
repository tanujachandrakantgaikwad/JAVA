package mypackage;   // declare package

 class Demo {
    void showMessage() {
        System.out.println("Hello! This is a demo program inside a package.");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.showMessage();
    }
}
