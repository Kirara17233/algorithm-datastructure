package datastructure;

public class IntArray {
    private int size;
    private int[] data;

    public IntArray() {
        this.size = 0;
        this.data = new int[1];
    }

    public IntArray(int size) {
        this.size = 0;
        this.data = new int[size];
    }

    public void insert(int pos, int n) {
        if (size++ < data.length) {
            for (int i = data.length - 1; i > pos; --i) {
                data[i] = data[i - 1];
            }
            data[pos] = n;
        } else {
            int[] tmp = new int[size * 2];
            for (int i = 0; i < pos; ++i) {
                tmp[i] = data[i];
            }
            tmp[pos] = n;
            for (int i = pos; i < data.length; ++i) {
                tmp[i + 1] = data[i];
            }
            data = tmp;
        }
    }

    public void insert(int n) {
        insert(size, n);
    }

    public int get(int pos) {
        return data[pos];
    }

    public void update(int pos, int n) {
        data[pos] = n;
    }

    public void delete(int pos) {
        for (int i = pos + 1; i < size; ++i) {
            data[i - 1] = data[i];
        }
        --size;
    }

    public void print() {
        System.out.println("Size: " + size + "/" + data.length);
        for (int i = 0; i < size; ++i) {
            System.out.println("[" + i + "]: " + data[i]);
        }
    }
}
