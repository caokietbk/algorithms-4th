class QuickUnion {
	private final int[] elements; 

	public QuickUnion(int numberOfElements) {
		elements = new int[numberOfElements];
		for (int i = 0; i < elements.length; i++) {
			elements[i] = i;
		}
	}

	private int root(int i) {
		while(elements[i] != i) {
			i = elements[i];
		}
		return i;
	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	public void union(int p, int q){
		int proot = root(p);
		int qroot = root(q);
		elements[proot] = qroot;
	}
}
