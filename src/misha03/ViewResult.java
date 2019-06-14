/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misha03;

/**
 *
 * @author admin
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import misha02.Item2d;

/**
 * ConcreteProduct (Шаблон проектирования Factory Method)<br>
 * Вычисление функции, сохранение и отображение результатов
 *
 * @author xone
 * @version 1.0
 * @see View
 */
public class ViewResult implements View {

    Scanner reader = new Scanner(System.in);
    /**
     * Имя файла, используемое при сериализации
     */
    private static final String FNAME = "items.bin";
    /**
     * Определяет количество значений для вычисления по умолчанию
     */
    private static final int DEFAULT_NUM = 10;
    /**
     * Коллекция аргументов и результатов вычислений
     */
    private ArrayList<Item2d> items = new ArrayList<Item2d>();

    /**
     * Вызывает {@linkplain ViewResult#ViewResult(int n) ViewResult(int n)} с
     * параметром {@linkplain ViewResult#DEFAULT_NUM DEFAULT_NUM}
     */
    public ViewResult() {
        this(DEFAULT_NUM);
    }

    /**
     * Инициализирует коллекцию {@linkplain ViewResult#items}
     *
     * @param n начальное количество элементов
     */
    public ViewResult(int n) {
        for (int ctr = 0; ctr < n; ctr++) {
            items.add(new Item2d());
        }
    }

    /**
     * Получить значение {@linkplain ViewResult#items}
     *
     * @return текущее значение ссылки на объект {@linkplain ArrayList}
     */
    public ArrayList<Item2d> getItems() {
        return items;
    }

    /**
     * Вычисляет значение функции.
     *
     * @param l - аргумент вычисляемой функции.
     * @param w - аргумент вычисляемой функции.
     * @param h - аргумент вычисляемой функции.
     * @return результат вычисления функции.
     */
    private int P(int l, int w, int h) {
        return l + w + h;
    }
    /**
     * Вычисляет значение функции.
     *
     * @param l - аргумент вычисляемой функции.
     * @param w - аргумент вычисляемой функции.
     * @return результат вычисления функции.
     */
    private int S(int l, int w) {
        return l * w;
    }
    /**
     * Вычисляет значение функции.
     *
     * @param l - аргумент вычисляемой функции.
     * @param w - аргумент вычисляемой функции.
     * @param h - аргумент вычисляемой функции.
     * @return результат вычисления функции.
     */
    private int V(int l, int w, int h) {
        return l * w * h;
    }

    /**
     * Вычисляет значение функции и сохраняет результат в коллекции
     * {@linkplain ViewResult#items}
     *
     * @param stepL шаг приращения аргумента
     * @param stepW шаг приращения аргумента
     * @param stepH шаг приращения аргумента
     */
    public void init(int stepL, int stepW, int stepH) {
        int l = 0;
        int w = 0;
        int h = 0;
        for (Item2d item : items) {
            item.setLWHPSV(l, w, h, P(l, w, h), S(l, w), V(l, w, h));
            l += stepL;
            w += stepW;
            h += stepH;
        }
    }

    /**
     * Вызывает <b>init(double stepX)</b> со случайным значением аргумента<br>
     * {@inheritDoc}
     */
    @Override
    public void viewInit() {
        init(Integer.parseInt(reader.nextLine(), 2), Integer.parseInt(reader.nextLine(), 2), Integer.parseInt(reader.nextLine(), 2));
    }

    /**
     * Реализация метода {@linkplain View#viewSave()}<br> {@inheritDoc}
     */
    @Override
    public void viewSave() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(items);
        os.flush();
        os.close();
    }

    /**
     * Реализация метода {@linkplain View#viewRestore()}<br> {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public void viewRestore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        items = (ArrayList<Item2d>) is.readObject();
        is.close();
    }

    /**
     * Реализация метода {@linkplain View#viewHeader()}<br> {@inheritDoc}
     */
    @Override
    public void viewHeader() {
        System.out.println("Results:");
    }

    /**
     * Реализация метода {@linkplain View#viewBody()}<br> {@inheritDoc}
     */
    @Override
    public void viewBody() {
        for (Item2d item : items) {
            System.out.printf("(%d; %d; %d; %d; %d; %d) ", item.getL(), item.getW(), item.getH(), item.getP(), item.getS(), item.getV());
        }
        System.out.println();
    }

    /**
     * Реализация метода {@linkplain View#viewFooter()}<br> {@inheritDoc}
     */
    @Override
    public void viewFooter() {
        System.out.println("End.");
    }

    /**
     * Реализация метода {@linkplain View#viewShow()}<br> {@inheritDoc}
     */
    @Override
    public void viewShow() {
        viewHeader();
        viewBody();
        viewFooter();
    }
}
