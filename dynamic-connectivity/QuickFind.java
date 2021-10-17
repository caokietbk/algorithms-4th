class QuickFind {

	final private int[] elements;

	public QuickFind(int numberOfElements) {
		elements = new int[numberOfElements];
		for (int i = 0; i < elements.length; i++) {
			elements[i] = i;
		}
	}

	void union(int p, int q) {
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == elements[p]) {
				elements[i] = elements[q];
			}
		}
	}

	boolean connected(int p, int q) {
		return elements[p] == elements[q];
	}

	public void showContent() {
		System.out.println("Show the content of elements.");
		for (int i = 0; i < elements.length; i++) {
			System.out.printf("(%d:%d)\n", i, elements[i]);
		}
	}
}
