/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misha08;

/**
 *
 * @author admin
 */
import java.awt.Dimension;
import java.util.Scanner;
import misha03.ViewResult;

/**
 * ConcreteProduct (шаблон проектирования Factory Method); отображение графика
 *
 * @author xone
 * @version 1.0
 * @see ViewResult
 * @see Window
 */
public class ViewWindow extends ViewResult {

    Scanner reader = new Scanner(System.in);
    /**
     * Количество элементов коллекци
     */
    private static final int POINTS_NUM = 100;
    /**
     * Отображаемое окно
     */
    private Window window = null;

    /**
     * Создание и отображение окна
     */
    public ViewWindow() {
        super(POINTS_NUM);
        window = new Window(this);
        window.setSize(new Dimension(640, 480));
        window.setTitle("Result");
        window.setVisible(true);
    }

    @Override
    public void viewInit() {
        init(Integer.parseInt(reader.nextLine(), 2), Integer.parseInt(reader.nextLine(), 2), Integer.parseInt(reader.nextLine(), 2));
    }

    @Override
    public void viewShow() {
        super.viewShow();
        window.setVisible(true);
        window.repaint();
    }
}
