import java.util.ArrayList;
public class two    {
    public static void main()   {
        goldbach(20);
    }

    public static void goldbach(int num)   {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < num; i++)    {
            list.add(i);
        }

        for(int i = list.size() - 1; i >= 0; i--)   {
            if(list.get(i) % 2 == 0 && list.get(i) != 2 || list.get(i) % 3 == 0 && list.get(i) != 3 || list.get(i) % 5 == 0 && list.get(i) != 5 || list.get(i) % 7 == 0 && list.get(i) != 7)    {
                list.remove(i);
            }
        }
        System.out.println(list);
        System.out.println("Answers:");
        for(int i = list.size() - 1; i >= 0; i--)   {
            if(list.contains(num - list.get(i)))   {
                System.out.println(list.get(i) + " + " + (num - list.get(i)));
            }
        }
    }
}
