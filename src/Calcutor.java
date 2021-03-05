public class Calcutor {
    public int cumpute(int nums1, int nums2, char symbol) {
        switch (symbol) {
            case '+':
                return nums1 + nums2;
            case '-':
                return nums1 - nums2;
            default:
                throw new IllegalArgumentException();
        }
    }
}
