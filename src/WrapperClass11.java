public class WrapperClass11 {
    public static void main(String[] args) {
        Integer num=3;
        Double nums2 = 2.5;
        Boolean isEqual=true;
        Double result=calculate(num, nums2, isEqual);
        System.out.println("result = " + result);
    }
    public static Double calculate(Integer num, Double nums2, Boolean isEqual){
        if(isEqual){
            return (double) num+nums2;
        }else{
            return (double) num-nums2;
        }
    }
}
