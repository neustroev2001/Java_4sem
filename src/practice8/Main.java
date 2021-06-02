package practice8;

import practice8.memento.Editor;
import practice8.memento.Originator;
import practice8.observer.FirstObserver;
import practice8.observer.SecondObserver;
import practice8.observer.Subject;
import practice8.observer.ThirdObserver;

public class Main {
    /*
    Паттерны Снимок, Наблюдатель.
     */
    public static void main(String[] args) {
        Editor editor = new Editor(new Originator());
        editor.write("Hello, World!");
        editor.write("\n123");
        editor.hitSave();
        editor.write("This will be deleted");
        editor.hitUndo();
        editor.print();

        Subject subject = new Subject();
        new FirstObserver(subject);
        new SecondObserver(subject);
        new ThirdObserver(subject);
        System.out.println("Let's make a change");
        subject.setState(1);
        System.out.println("One more");
        subject.setState(2);
    }
}
