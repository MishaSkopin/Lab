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
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import misha02.Item2d;
import misha03.ViewResult;

/**
 * Создание окна отображения графика
 *
 * @author xone
 * @version 1.0
 * @see Frame
 */
@SuppressWarnings("serial")
public class Window extends Frame {

    /**
     * Толщина отступа от края окна
     */
    private static final int BORDER = 20;
    /**
     * Объект, реализующий интерфейс {@linkplain ex02.View};<br>
     * обслуживает коллекцию объектов {@linkplain ex01.Item2d}
     */
private ViewResult view;

    /**
     * Инициализирует {@linkplain Window#view};<br>
     * Создает обработчик события закрытия окна
     *
     * @param view значение для поля {@linkplain Window#view}
     */
    public Window(ViewResult view) {
        this.view = view;
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                //System.exit(0);
                setVisible(false);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        Rectangle r = getBounds(), c = new Rectangle();
        r.x += BORDER;
        r.y += 25 + BORDER;
        r.width -= r.x + BORDER;
        r.height -= r.y + BORDER;
        c.x = r.x;
        c.y = r.y + r.height / 2;
        c.width = r.width;
        c.height = r.height / 2;
        g.setColor(Color.LIGHT_GRAY);
        g.setColor(Color.RED);
        g.drawLine(c.x, c.y, c.x + c.width, c.y);
        g.drawLine(c.x, r.y, c.x, r.y + r.height);
        double maxX = 0, maxY =  view.getItems().get(0).getS(), scaleX, scaleY;
        for (Item2d item : view.getItems()) {
            if (item.getL() > maxX) {
                maxX = item.getL();
            }
            if (Math.abs(item.getS()) > maxY) {
                maxY = Math.abs(item.getS());
            }
        }
        g.drawString("+" + maxY, r.x, r.y);
        g.drawString("-" + maxY, r.x, r.y + r.height);
        g.drawString("+" + maxX, c.x + c.width
                - g.getFontMetrics().stringWidth("+" + maxX), c.y);
        scaleX = c.width / maxX;
        scaleY = c.height / maxY;
        g.setColor(Color.BLUE);
        for (Item2d item : view.getItems()) {
            g.drawOval(
                    c.x + (int) (item.getL() * scaleX) - 5,
                    c.y - (int) (item.getS() * scaleY) - 5,
                    10, 10
            );
        }
    }
}
