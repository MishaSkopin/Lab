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
import java.io.Serializable;

/**
 * Хранит исходные данные и результат вычислений.
 *
 * @author xone
 * @version 1.0
 */
public class Item2d implements Serializable {

    /**
     * Аргумент вычисляемой функции.
     */
// transient
    private int l;
    private int w;
    private int h;

    /**
     * Результат вычисления функции.
     */
    private int p;
    private int s;
    private int v;

    /**
     * Автоматически сгенерированная константа
     */
    private static final long serialVersionUID = 1L;

    /**
     * Инициализирует поля {@linkplain Item2d#x}, {@linkplain Item2d#y}
     */
    public Item2d() {
        l = 0;
        w = 0;
        h = 0;
        p = 0;
        s = 0;
        v = 0;
    }

    /**
     * Устанавливает значения полей: аргумента и результата вычисления функции.
     *
     * @param l - значение для инициализации поля {@linkplain Item2d#l}
     * @param w - значение для инициализации поля {@linkplain Item2d#w}
     * @param h - значение для инициализации поля {@linkplain Item2d#h}
     * @param p - значение для инициализации поля {@linkplain Item2d#p}
     * @param s - значение для инициализации поля {@linkplain Item2d#s}
     * @param v - значение для инициализации поля {@linkplain Item2d#v}
     */
    public Item2d(int l, int w, int h, int p, int s, int v) {
        this.l = l;
        this.w = w;
        this.h = h;
        this.p = p;
        this.s = s;
        this.v = v;
    }

    /**
     * Установка значения поля {@linkplain Item2d#l}
     *
     * @param l - значение для {@linkplain Item2d#l}
     * @return Значение {@linkplain Item2d#x}
     */
    public int setL(int l) {
        return this.l = l;
    }

    /**
     * Получение значения поля {@linkplain Item2d#l}
     *
     * @return Значение {@linkplain Item2d#l}
     */
    public int getL() {
        return l;
    }

    /**
     * Установка значения поля {@linkplain Item2d#w}
     *
     * @param w - значение для {@linkplain Item2d#w}
     * @return Значение {@linkplain Item2d#w}
     */
    public int setW(int w) {
        return this.w = w;
    }

    /**
     * Получение значения поля {@linkplain Item2d#w}
     *
     * @return значение {@linkplain Item2d#w}
     */
    public int getW() {
        return w;
    }

    /**
     * Установка значения поля {@linkplain Item2d#h}
     *
     * @param h - значение для {@linkplain Item2d#h}
     * @return Значение {@linkplain Item2d#x}
     */
    public int setH(int h) {
        return this.h = h;
    }

    /**
     * Получение значения поля {@linkplain Item2d#h}
     *
     * @return Значение {@linkplain Item2d#h}
     */
    public int getH() {
        return h;
    }

    /**
     * Установка значения поля {@linkplain Item2d#p}
     *
     * @param p - значение для {@linkplain Item2d#p}
     * @return Значение {@linkplain Item2d#x}
     */
    public int setP(int p) {
        return this.p = p;
    }

    /**
     * Получение значения поля {@linkplain Item2d#p}
     *
     * @return Значение {@linkplain Item2d#p)
     */
    public int getP() {
        return p;
    }

    /**
     * Установка значения поля {@linkplain Item2d#s}
     *
     * @param s - значение для {@linkplain Item2d#s}
     * @return Значение {@linkplain Item2d#x}
     */
    public int setS(int s) {
        return this.s = s;
    }

    /**
     * Получение значения поля {@linkplain Item2d#s}
     *
     * @return Значение {@linkplain Item2d#s}
     */
    public int getS() {
        return s;
    }

    /**
     * Установка значения поля {@linkplain Item2d#v}
     *
     * @param v - значение для {@linkplain Item2d#v}
     * @return Значение {@linkplain Item2d#x}
     */
    public int setV(int v) {
        return this.v = v;
    }

    /**
     * Получение значения поля {@linkplain Item2d#v}
     *
     * @return Значение {@linkplain Item2d#v}
     */
    public int getV() {
        return v;
    }

    /**
     * Установка значений {@linkplain Item2d#l), {@linkplain Item2d#w}, {@linkplain Item2d#h), {@linkplain Item2d#p}, {@linkplain Item2d#s), {@linkplain Item2d#v}
     *
     * @param l - значение для инициализации поля {@linkplain Item2d#l}
     * @param w - значение для инициализации поля {@linkplain Item2d#w}
     * @param h - значение для инициализации поля {@linkplain Item2d#h}
     * @param p - значение для инициализации поля {@linkplain Item2d#p}
     * @param s - значение для инициализации поля {@linkplain Item2d#s}
     * @param v - значение для инициализации поля {@linkplain Item2d#v}
     * @return this
     */
    public Item2d setLWHPSV(int l, int w, int h, int p, int s, int v) {
        this.l = l;
        this.w = w;
        this.h = h;
        this.p = p;
        this.s = s;
        this.v = v;
        return this;
    }
    /**
     * Установка значений {@linkplain Item2d#p}, {@linkplain Item2d#s), {@linkplain Item2d#v}
     *
     * @param p - значение для инициализации поля {@linkplain Item2d#p}
     * @param s - значение для инициализации поля {@linkplain Item2d#s}
     * @param v - значение для инициализации поля {@linkplain Item2d#v}
     * @return this
     */
    public Item2d setPSV(int p, int s, int v) {
        this.p = p;
        this.s = s;
        this.v = v;
        return this;
    }

    /**
     * Представляет результат вычислений в виде строки.<br>{@inheritDoc}
     */
    @Override
    public String toString() {
        return "l = " + l + ", w = " + w + ", h = " + h + ", p = " + p + ", s = " + s + ", v = " + v;
    }
}
