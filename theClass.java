
public class theClass {
    public static void main(String[] args) {
        //Classes and Objects

        Lens lensOne = new Lens("sony", "85mm", true);
        Lens lensTwo = new Lens("canon", "79mm", true);
        System.out.println("lens 1:");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);

        System.out.println("lens 2:");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);
    }


    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}
