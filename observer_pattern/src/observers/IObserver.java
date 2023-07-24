package observers;

import domain.Employee;

public interface IObserver {
    void callMe(Employee emp, String msg); // this is the method that will be called when the subject changes

}
