package Observer_book;
import java.util.ArrayList;
import java.util.List;

public class Subject {
        private List<Observer> observers;

        public Subject() {
            observers = new ArrayList<Observer>();
        }

        public void attach(Observer o) {
            observers.add(o);
        }

        public void detach(Observer o) {
            observers.remove(o);
        }

        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update(this);
            }
        }

}

