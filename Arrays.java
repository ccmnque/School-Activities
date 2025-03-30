public class Arrays {
    public static void main(String[] args) {
        int[]array={45, 23, 89, 90, 12, 80};
        int total = 0;
        for(int i =1; <=array.length; i++) {
            total += array[i];
        }
        System.out.println("Total\t: " + total);
    }
}