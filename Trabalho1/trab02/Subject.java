package trab02;

import java.util.*;

public class Subject {
    
    private String val;
    private List<Observer> observer;

    public Subject() {
        this.observer = new ArrayList<>();
    }
    
    public void registerObserver(Observer observer){
        this.observer.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observer.remove(observer);
    }

    public void notifyObserver(){
        this.observer.forEach((obs) -> {
            obs.Imprimir(this);
        });
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
        this.notifyObserver();
    }

    public List<Observer> getObserver() {
        return observer;
    }

    public void setObserver(List<Observer> observer) {
        this.observer = observer;
    }

}
