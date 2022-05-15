package workerRelated;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String message);
}
