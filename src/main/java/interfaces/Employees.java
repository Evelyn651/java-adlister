package interfaces;

import models.Employee;

public interface Employees {
    //CRUD. an insert usually returns a number in a database.
    long insert(Employee employee);
    void update(long id);
    Employee show(long id);
    void delete(long id);

}
