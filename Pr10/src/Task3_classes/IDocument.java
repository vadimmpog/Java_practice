package Task3_classes;

import javax.swing.*;

public interface IDocument {
    JPanel contents = new JPanel();
    JTextArea student = new JTextArea();
    JLabel hello = new JLabel("Для работы нажмите старт.");
    JLabel alert = new JLabel();
    JButton start = new JButton("Старт");
    JButton exit = new JButton("Выход");
    JButton search = new JButton("Поиск");
    JButton sort = new JButton("Отсортировать по баллам");
}

