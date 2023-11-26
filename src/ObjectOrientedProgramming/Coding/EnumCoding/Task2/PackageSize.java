package ObjectOrientedProgramming.Coding.EnumCoding.Task2;

public enum PackageSize {
    SMALL(5, 10),
    MEDIUM(11, 20),
    LARGE(21, 30);

    public final int minSize;
    public final int maxSize;
    private PackageSize(int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    public static PackageSize getPackageSize(int packageSize) {
        if (packageSize >= SMALL.minSize && packageSize <= SMALL.maxSize) {
            return SMALL;
        } else if (packageSize >= MEDIUM.minSize && packageSize <= MEDIUM.maxSize) {
            return MEDIUM;
        } else if (packageSize >= LARGE.minSize && packageSize <= LARGE.maxSize) {
            return LARGE;
        }
        return null;
    }
}
