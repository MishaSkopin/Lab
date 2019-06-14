/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misha04;

/**
 *
 * @author admin
 */
import misha03.ViewableResult;
import misha03.View;

/**
 * ConcreteCreator (шаблон проектирования Factory Method)<br>
 * Объявляет метод, "фабрикующий" объекты
 *
 * @author xone
 * @version 1.0
 * @see ViewableResult
 * @see ViewableTable#getView()
 */
public class ViewableTable extends ViewableResult {

    /**
     * Создаёт отображаемый объект {@linkplain ViewTable}
     */
    @Override
    public View getView() {
        return new ViewTable();
    }
}
