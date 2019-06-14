/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misha02;

/**
 *
 * @author admin
 */
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Содержит реализацию методов для вычисления и отображения результатов.
 *
 * @author xone
 * @version 1.0
 */
public class Calc {

    /**
     * Имя файла, используемое при сериализации.
     */
    private static final String FNAME = "Item2d.bin";

    /**
     * Сохраняет результат вычислений. Объект класса {@linkplain Item2d}
     */
    private Item2d result;

    /**
     * Инициализирует {@linkplain Calc#result}
     */
    public Calc() {
        result = new Item2d();
    }

    /**
     * Установить значение {@linkplain Calc#result}
     *
     * @param result - новое значение ссылки на объект {@linkplain Item2d}
     */
    public void setResult(Item2d result) {
        this.result = result;
    }

    /**
     * Получить значение {@linkplain Calc#result}
     *
     * @return текущее значение ссылки на объект {@linkplain Item2d}
     */
    public Item2d getResult() {
        return result;
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
     * Вычисляет значение функции и сохраняет результат в объекте
     * {@linkplain Calc#result}
     *
     * @param l - аргумент вычисляемой функции.
     * @param w - аргумент вычисляемой функции.
     * @param h - аргумент вычисляемой функции.
     */
    public Item2d init(int l, int w, int h) {
        result.setL(l);
        result.setW(w);
        result.setH(h);
        return result.setPSV(P(l, w, h), S(l, w), V(l, w, h));
    }

    /**
     * Выводит результат вычислений.
     */
    public void show() {
        System.out.println(result);
    }

    /**
     * Сохраняет {@linkplain Calc#result} в файле {@linkplain Calc#FNAME}
     *
     * @throws IOException
     */
    public void save() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(result);
        os.flush();
        os.close();
    }

    /**
     * Восстанавливает {@linkplain Calc#result} из файла {@linkplain Calc#FNAME}
     *
     * @throws Exception
     */
    public void restore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        result = (Item2d) is.readObject();
        is.close();
    }

    public int toInt(String line) {
         return Integer.parseInt(line, 2);
    }
}
