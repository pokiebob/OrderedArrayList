public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

	OrderedArrayList() {
		super();
	}

	OrderedArrayList(int startingCapacity) {
		super(startingCapacity);
	}

	public boolean add(T element) {
		for (int i = 0; i < size()) {
			if (get(i) > element) {
				return super.add(i, element);
			}
		}
		return super.add(element);
	}

	public void add(int index, T element) {
		add(element);
	}

	public T set(int index, T element) {
		remove(index);
		return add(element);
	}

	public static void main(String[] args) {

	}
}