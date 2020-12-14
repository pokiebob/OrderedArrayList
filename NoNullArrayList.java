import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {

	NoNullArrayList() {
		super();
	}

	NoNullArrayList(int startingCapacity) {
		super(startingCapacity);
	}

	public void add(T element) {
		if (element == null) {
			throw new IllegalArgumentException("element " + element + "cannot be null");
		} else {
			super.add(element);
		}
	}

	public void add(int index, T element) {
		if (element == null) {
			throw new IllegalArgumentException("element " + element + "cannot be null");
		} else {
			super.add(index, element);
		}
	}

	public static void main(String[] args) {

	}



}