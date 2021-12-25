public class PaintJob {
    public static int getBucketCount
            (double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double wallArea = width * height;
        double numberOfBuckets = (wallArea - (extraBuckets * areaPerBucket)) / areaPerBucket;
        //return (int) numberOfBuckets;
        return (int) Math.ceil(numberOfBuckets);
    }

    public static int getBucketCount
            (double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double wallArea = width * height;
        double numberOfBuckets = wallArea / areaPerBucket;
        //return (int) numberOfBuckets + 1;
        return (int) Math.ceil(numberOfBuckets);
    }

    public static int getBucketCount(double wallArea, double areaPerBucket) {
        if (wallArea <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double numberOfBuckets = wallArea / areaPerBucket;
        //return (int) numberOfBuckets + 1;
        return (int) Math.ceil(numberOfBuckets);
    }
}
