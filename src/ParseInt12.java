public class ParseInt12 {
    public static void main(String[] args) {
        String str="10";
        String str2="5";
        int result=calculateSum(str, str2);
        System.out.println("result = " + result);
    }
    public static int calculateSum(String str, String str2){
        int num=Integer.parseInt(str);
        int num2=Integer.parseInt(str2);
        int sum=num+num2;
        return sum;
    }
}
