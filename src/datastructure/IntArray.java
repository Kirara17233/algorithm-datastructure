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
            if (data.length - 1 - pos >= 0) System.arraycopy(data, pos, data, pos + 1, data.length - 1 - pos);
            data[pos] = n;
        } else {
            int[] tmp = new int[size * 2];
            if (pos >= 0) System.arraycopy(data, 0, tmp, 0, pos);
            tmp[pos] = n;
            if (data.length - pos >= 0) System.arraycopy(data, pos, tmp, pos + 1, data.length - pos);
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
        if (size - (pos + 1) >= 0) System.arraycopy(data, pos + 1, data, pos + 1 - 1, size - (pos + 1));
        --size;
    }

    public void print() {
        System.out.println("Size: " + size + "/" + data.length);
        for (int i = 0; i < size; ++i) {
            System.out.println("[" + i + "]: " + data[i]);
        }
    }

    public static void main(String[] args) {
        IntArray a = new IntArray();
        a.insert(5);
        a.insert(2);
        a.insert(0, 1);
        a.update(0, a.get(2));
        a.delete(0);
        a.print();
    }
}
