import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class ArraysAsListToSet20 {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>(Arrays.asList(12, 3, 5, 2, 8, 7, 6));
        Set<Integer> nums2 = new HashSet<>(Arrays.asList(2, 5, 20));
        boolean result = nums.containsAll(nums2);
        System.out.println("result = " + result);

        Set<String> invitedGuest = new HashSet<>();
        invitedGuest.add("Ferrari");
        invitedGuest.add("Lamborghini");
        invitedGuest.add("Porsche");
        invitedGuest.add("Bugatti");
        invitedGuest.add("Lexus");
        invitedGuest.add("Mercedes");
        invitedGuest.add("BMW");

        Set<String> registGuest = new HashSet<>();
        registGuest.add("Ferrari");
        registGuest.add("BMW");
        registGuest.add("fit");


        if (invitedGuest.containsAll(registGuest)) {
            System.out.println("ready to sent all  registered speakers ");
        } else {
            System.out.println("someone is trying to sneak in");

            for (String var : registGuest) {
                if (!invitedGuest.contains(var)) {
                    System.out.println(var + " is trying  to sneak in");
                    System.out.println("remove " + var);
             //       registGuest.remove(var); something wrong when using this methods

                }
            }
        }
        System.out.println(registGuest);

        System.out.println("****************************************");

        Set<String> invitedGuest2 = new HashSet<>();
        invitedGuest2.add("Ferrari");
        invitedGuest2.add("Lamborghini");
        invitedGuest2.add("Porsche");
        invitedGuest2.add("Bugatti");
        invitedGuest2.add("Lexus");
        invitedGuest2.add("Mercedes");
        invitedGuest2.add("BMV");

        Set<String> registGuest2 = new HashSet<>();
        registGuest2.add("Ferrari");
        registGuest2.add("BMV");
        if (invitedGuest2.containsAll(registGuest2)) {
            System.out.println("ready to sent all  registered speakers ");
        } else {
            registGuest2.retainAll(invitedGuest2);

        }
        System.out.println(registGuest2);

    }
}
