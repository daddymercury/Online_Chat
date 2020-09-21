import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        int couterOfTheList1 = 0;
        int couterOfTheList2 = 0;
        boolean istrue = false;

        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i) == elem) {
                couterOfTheList1++;
            }
        }

        for (int i = 0; i < list2.size(); i++) {
            if(list2.get(i) == elem) {
                couterOfTheList2++;
            }
        }

        if(couterOfTheList1 == couterOfTheList2) {
            istrue = true;
        }
        return istrue;
    }
}