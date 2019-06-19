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
import misha03.View;
import misha05.Application;

/**
 * Вычисление и отображение результатов; cодержит реализацию статического метода
 * main()
 *
 * @author xone
 * @version 7.0
 * @see Main#main
 */
public class Main {

    /**
     * Выполняется при запуске программы; вызывает метод
     * {@linkplain Application#run(Viewable)}
     *
     * @param args параметры запуска программы
     */
    public static void main(String[] args) {
        Application app = Application.getInstance();
        app.run(new ViewableWindow().getView());
        System.exit(0);
    }
}
