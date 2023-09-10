public class ToStringParsePractice14 {
    public static void main(String[] args) {
        String str="amazon, 1512,2023,1703\n" +
                "ali 8888, 2024";
        int index1= str.indexOf(",");
        int index2=str.indexOf(",", index1+1);
        System.out.println(index1);//6
        System.out.println(index2);//12
        String first_company=str.substring(index1+2, index2);
        System.out.println(first_company);
        int company1=Integer.parseInt(first_company);
        System.out.println(company1);
        String second=str.substring(index2+1, 17);
        System.out.println(second);
        int secondconv=Integer.parseInt(second);
        System.out.println(secondconv);

        int a=10;
        String strst=Integer.toString(a);
        System.out.println(strst+ " ToString method");



    }
}
