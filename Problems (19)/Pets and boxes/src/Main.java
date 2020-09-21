class Box<T extends Animal> {
    private T element;

    public T getElement() {
        return element;
    }

    public void add(T element) {}
}

// Don't change the code below
class Animal {}