import java.util.ArrayList;
public class One   {
    public static void main(String[] args)  {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 2; i <= 100; i++)    {
            list.add(i);
        }
        //System.out.println(list);
        sieve(list);
    }
    
    public static void sieve(ArrayList<Integer> myList)  {
        for(int i = myList.size() - 1; i >= 0; i--) {
            if(myList.get(i) % 2 == 0 && myList.get(i) != 2 || myList.get(i) % 3 == 0 && myList.get(i) != 3 || myList.get(i) % 5 == 0 && myList.get(i) != 5 || myList.get(i) % 7 == 0 && myList.get(i) != 7)  myList.remove(i);
        }
        //System.out.println(myList);
    }
}


