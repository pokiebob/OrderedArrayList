public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

	OrderedArrayList() {
		super();
	}

	OrderedArrayList(int startingCapacity) {
		super(startingCapacity);
	}

	public boolean add(T element) {
		for (int i = 0; i < size(); i++) {
			if (super.get(i).compareTo(element) > 0) {
				super.add(i, element);
				return true;
			}
		}
		return super.add(element);
	}

	public void add(int index, T element) {
		add(element);
	}

	public T set(int index, T element) {
		T value = get(index);
		remove(index);
		add(element);
		return value;
	}

	public static void main(String[] args) {

	}
}