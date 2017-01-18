package generator;

public interface Generator<T> {
	T next();
	enum Order {
		ASC, DESC
	}
}
