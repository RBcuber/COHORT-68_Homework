package app;

public interface MyList {
    int size();
    void add(Person person);
    void add(Person person, int index);
    int indexOf(Person person);
    Person get(int index);

}