public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        //bigCount -> represent the count of big flour bags (5 kilo each)
        //smallCount -> represents the count of small flour bags (1 kilo each)
        //goal-> represents the goal amount of kilos of flour needed to assemble a package.
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (bigCount * 5 + smallCount < goal) {
            return false;
        }
        if (goal % 5 <= smallCount * 1) {
            return true;
        }
        return false;
    }
}
