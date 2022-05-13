package WorkerRelated;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String message);
}
