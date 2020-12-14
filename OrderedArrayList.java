public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

	OrderedArrayList() {
		super();
	}

	OrderedArrayList(int startingCapacity) {
		super(startingCapacity);
	}

	public boolean add(T element) {
		if (element == null) {
			throw new IllegalArgumentException("element " + element + "cannot be null");
		}
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
		OrderedArrayList<Integer> o = new OrderedArrayList<Integer>();
		o.add(2);
		o.add(1);
		o.add(5);
		o.add(-4);
		o.add(3);
		System.out.println(o.set(4,-1000));
		for (int i : o) {
			System.out.println(i);
		}

	}
}