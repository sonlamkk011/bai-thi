package baithi;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        car c = new car();
        Scanner nhap = new Scanner(System.in);
        System.out.println("yeu cau nguoi dung nhap ten vao:");
        c.name = nhap.nextLine();
        System.out.println("ten: "+c.getName());
        System.out.println("van toc toi da:"+c.moveMax());

        moto m = new moto();
        System.out.println("yeu cau nguoi dung nhap vao:");
        m.name = nhap.nextLine();
        System.out.println("ten:"+m.getName());
        System.out.println("van toc toi da:"+m.moveMax());
    }
}
