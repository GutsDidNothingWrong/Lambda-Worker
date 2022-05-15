package workerRelated;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
