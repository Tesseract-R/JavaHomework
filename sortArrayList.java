import java.util.ArrayList;

public class sortArrayList {
    // 递归实现快速排序
    public static void sort(ArrayList<Number> list, int l, int r){
        if (l < r){
            int i = l, j = r;
            Number x = list.get(l);
            while(i < j){
                while(i<j && list.get(j).doubleValue() >= x.doubleValue()){
                    j--;
                }
                list.set(i, list.get(j));
                while(i<j && list.get(j).doubleValue() <= x.doubleValue()){
                    i++;
                }
                list.set(j, list.get(i));
            }
            list.set(i, x);
            sort(list, l,i - 1);
            sort(list,i + 1, r);
            }
        }

    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<Number>();
        list.add(1);
        list.add(9);
        list.add(2);
        list.add(8);
        list.add(3);
        sort(list,0,list.size() - 1);
        for (Number number : list) {
            System.out.println(number);
        }
    }
}