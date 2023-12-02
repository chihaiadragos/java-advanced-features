package ExercisesForLiveCodingAdvanced.Exercise5;

import java.util.ArrayList;
import java.util.List;

public class SDAHashSet<E> {

    private static final int INITIAL_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;

    private List<List<E>> buckets;
    private int size;

    public SDAHashSet() {
        this.buckets = new ArrayList<>(INITIAL_CAPACITY);
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            buckets.add(new ArrayList<>());
        }
        this.size = 0;
    }

    public boolean add(E element) {
        if (contains(element)) {
            return false; // Element already exists in the set
        }

        if (shouldResize()) {
            resize();
        }

        int bucketIndex = getBucketIndex(element);
        buckets.get(bucketIndex).add(element);
        size++;
        return true;
    }

    public boolean remove(E element) {
        int bucketIndex = getBucketIndex(element);
        List<E> bucket = buckets.get(bucketIndex);
        if (bucket.remove(element)) {
            size--;
            return true;
        }
        return false; // Element not found
    }

    public boolean contains(E element) {
        int bucketIndex = getBucketIndex(element);
        return buckets.get(bucketIndex).contains(element);
    }

    public int size() {
        return size;
    }

    private int getBucketIndex(E element) {
        return Math.abs(element.hashCode()) % buckets.size();
    }

    private boolean shouldResize() {
        return (double) size / buckets.size() > LOAD_FACTOR;
    }

    private void resize() {
        List<List<E>> newBuckets = new ArrayList<>(buckets.size() * 2);
        for (int i = 0; i < buckets.size() * 2; i++) {
            newBuckets.add(new ArrayList<>());
        }

        for (List<E> bucket : buckets) {
            for (E element : bucket) {
                int newBucketIndex = Math.abs(element.hashCode()) % newBuckets.size();
                newBuckets.get(newBucketIndex).add(element);
            }
        }

        buckets = newBuckets;
    }

    public void clear() {
        buckets = new ArrayList<>(INITIAL_CAPACITY);
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            buckets.add(new ArrayList<>());
        }
        size = 0;
    }

    @Override
    public String toString() {
        return "SDAHashSet{" +
                "buckets=" + buckets +
                ", size=" + size +
                '}';
    }
}