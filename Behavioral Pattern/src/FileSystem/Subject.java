package FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Subject {
        private List<Observer> objectList;

        public Subject() {
            objectList = new ArrayList<Observer>();
        }

        public void register(Observer obj) {
            objectList.add(obj);
        }

        public void unregister(Observer obj) {
            objectList.remove(obj);
        }

        public void notifyObject() {
            for (Observer var : objectList) {
                var.update(this);
            }
        }

}

