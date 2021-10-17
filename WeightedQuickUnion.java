class WeightedQuickUnion {
	private final int[] elements;
	private final int[] sizes;

	public WeightedQuickUnion(int numberOfElements){

		elements = new int[numberOfElements];
		sizes = new int[numberOfElements];

		for (int i = 0; i < elements.length; i++) {
			elements[i] = i;
			sizes[i] = 1;
		}
	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	public void union(int p, int q) {
		int proot = root(p);
		int qroot = root(q);
		if (proot == qroot) return;

		if (sizes[proot] < sizes[qroot]) {
			elements[proot] = qroot;
			sizes[qroot] += sizes[proot];
		} else {
			elements[qroot] = proot;
			sizes[proot] += sizes[qroot];
		}
	}

	private int root(int i) {
		while(elements[i] != i) {
			i = elements[i];
		}
		return i;
	}

}

