package sort;

import java.util.List;

public class SwapableList<T> implements SwapableData<T> {

    List<T> list;

    public SwapableList(List<T> list) {
        this.list = list;
    }

    public int size() {
        return list.size();
    }

    public void swap(int i, int j) {
        T tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }

    public T get(int i) {
        return list.get(i);
    }
}