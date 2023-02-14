package FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Subject {
        private List<Observer> observers;

        public Subject() {
            observers = new ArrayList<Observer>();
        }

        public void register(Observer obj) {
            observers.add(obj);
        }

        public void unregister(Observer obj) {
            observers.remove(obj);
        }

        public void notifyObservers() {
            for (Observer var : observers) {
                var.update(this);
            }
        }

}

