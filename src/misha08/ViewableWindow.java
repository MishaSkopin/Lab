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
import misha03.Viewable;

/**
 * ConcreteCreator (шаблон проектирования Factory Method); реализует метод,
 * "фабрикующий" объекты
 *
 * @author xone
 * @version 1.0
 * @see Viewable
 * @see Viewable#getView()
 */
public class ViewableWindow implements Viewable {

    @Override
    public View getView() {
        return new ViewWindow();
    }
}
