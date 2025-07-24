package lesson5;

import java.util.Arrays;

public class CloningOfArrays {
    public static void main(String[] args) {
        //Рассуждения на тему глубокого и поверхностного клонирования
//        Поверхностное клонирование — это процесс копирования объекта, при котором создается новый объект,
//        но его поля содержат ссылки на те же самые объекты, что и поля оригинального объекта.
//        Это может привести к неожиданным последствиям, если оригинальный массив изменяется после
//        клонирования, ведь изменения будут отображаться и в его копии.
//        В отличие от поверхностного, глубокое клонирование предполагает создание независимых копий всех
//        объектов, на которые ссылаются поля оригинального объекта. Это означает, что изменения в одном
//        объекте не повлияют на другой.
        int[]a = {3, 5, 6, 7, 8};
        int[] b = new int[a.length];
        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        a[0] = 15;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("/////////////");
        StringBuilder[]c = {new StringBuilder("a"), new StringBuilder("b")};
        StringBuilder[] d = new StringBuilder[c.length];
        System.arraycopy(c, 0, d, 0, c.length);
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        c[0].append("15");
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
    }
}