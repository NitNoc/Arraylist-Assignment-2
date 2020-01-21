import java.util.ArrayList;
public class Three  {
    public static void main(String args[])   {
        ArrayList<Integer> n1 = new ArrayList<Integer>();
        n1.add(9);
        n1.add(9);
        n1.add(9);
        n1.add(9);
        ArrayList<Integer> n2 = new ArrayList<Integer>();
        n2.add(9);
        n2.add(9);
        n2.add(9);
        n2.add(9);
        //n2.add(9);
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer = add(n1, n2);
    }

    public static ArrayList<Integer> add(ArrayList<Integer> first, ArrayList<Integer> second)   {
        int num = 0;
        int carry = 0;
        int sum = 0;
        ArrayList<Integer> end = new ArrayList<Integer>();
        int greater = 0;
        if(first.size() > second.size())    {
            greater = first.size();
        }   else    {
            greater = second.size();
        }
        for(int i = greater; i >= first.size() - 1 || i >= second.size() - 1; i--)  {
            if(first.size() >= 0 && second.size() >= 0) {
                sum = first.get(i) + second.get(i);
                
            }
            end.add(0, sum);
        }
        return end;
    }
}
