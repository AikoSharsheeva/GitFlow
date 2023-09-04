public class Array1 {
    public static void main(String[] args) {
        int[] expenses = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int total=0;
        for(int i=0; i< expenses.length; i++) {
            total=total+expenses[i];
        }
        System.out.println("total = " + total);
    }
}