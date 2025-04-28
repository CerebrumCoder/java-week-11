


public class TestCircleWithException {
    public static void main(String[] args) {
        try {
            CircleWithException c1 = new CircleWithException(5);
            CircleWithException c2 = new CircleWithException(2);
            CircleWithException c3 = new CircleWithException(-9);
            CircleWithException c4 = new CircleWithException(2);
        } catch (IllegalArgumentException ex) {
            System.out.println("Tidak bisa buat lingkaran dengan radius < 0");
            System.out.println("Pesan exception: " + ex.getMessage());
        } finally {
            System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());
        }
    }


}
