import java.util.*;

//ArrayList

class AlTask
{
    public static void main(String[] args) 
    {
        //Task 1: Create and Print an ArrayList
        ArrayList<String> Al=new ArrayList<>();
        Al.add("Mahesh");
        Al.add("Vishnu");
        Al.add("Dinesh");
        Al.add("Vicky");
        Al.add("Deena");
        System.out.println("Task 1:");
        System.out.println("Array List: "+Al);

        //Task 2: Remove an Element from ArrayList
        Al.remove(0);
        Al.remove("Dinesh");
        System.out.println("Task 2:");
        System.out.println("Remove Element by index & value, Modified ArrayList: "+Al);

        //Task 3: Search in an ArrayList    
        System.out.println("Task 3:");
        System.out.println("The object Found in index: "+Al.indexOf("Deena"));

        //Task 4: Sort an ArrayList
        ArrayList<Integer> Al2=new ArrayList<>();
        Al2.add(2);
        Al2.add(3);
        Al2.add(1);
        Al2.add(4);
        Al2.add(5);
        Collections.sort(Al2);
        System.out.println("Task 4:");
        System.out.println("Sort an ArrayList: "+Al2);

        //Task 5: Convert an ArrayList to an Array
        String[] A=new String[Al.size()];
        for(int i=0;i<Al.size();i++)
        {
            A[i]=Al.get(i);
        }
        System.out.println("Task 5:");
        System.out.println("Convert an String ArrayList to an String Array: "+Arrays.toString(A));
        int[] A2=new int[Al2.size()];
        int Sum=0;
        for(int i=0;i<Al2.size();i++)
        {
            Sum+=Al2.get(i);
            A2[i]=Al2.get(i);
        }
        System.out.println("Convert an Integer ArrayList to an Int Array: "+Arrays.toString(A2));
        System.out.println("Sum of all Elements: "+Sum);
    }
}

//LinkedList

class LlTask
{
    public static void main(String[] args) 
    {
        //Task 1: Create a LinkedList and Add Elements
        LinkedList<Integer> Ll=new LinkedList<>();
        Ll.addFirst(2);
        Ll.addLast(3);
        Ll.add(2,1);
        Ll.add(3,4);
        Ll.add(4,7);
        System.out.println("Task 1:");
        System.out.println("Linked List: "+Ll);

        //Task 2: Remove Elements from LinkedList
        Ll.removeFirst();
        Ll.removeLast();
        Ll.remove((Integer) 4);
        System.out.println("Task 2:");
        System.out.println("Remove Element by First,Last Index & Value, Modified LinkedList: "+Ll);

        //Task 3: Iterate Over a LinkedList
        System.out.println("Task 3:");
        System.out.println("Print Element Using ForLoop:");
        for(int i=0;i<Ll.size();i++)
        {
            System.out.print(Ll.get(i)+" ");
        }
        System.out.println("\nPrint Element Using Iterator:");
        Iterator<Integer> i=Ll.iterator();
        while(i.hasNext()) 
        {
            System.out.print(i.next()+" ");
        }

        //Task 4: Convert a LinkedList to an ArrayList
        LinkedList<String> Ll2=new LinkedList<>();
        Ll2.addFirst("Mahesh");
        Ll2.addFirst("Raja");
        Ll2.addLast("Deena");
        Ll2.addLast("Bala");
        Ll2.add(2,"Deva");
        ArrayList<String> Al=new ArrayList<>();
        Al.addAll(Ll2);
        System.out.println("\nTask 4:");
        System.out.println("Convert a LinkedList to an ArrayList: "+Al);

        //Task 5: Reverse a LinkedList
        LinkedList<String> RLl=new LinkedList<>(Ll2);
        java.util.Collections.reverse(RLl);
        System.out.println("Task 5:");
        System.out.println("Reverse a LinkedList: "+RLl);
    }
}

//HashSet

class HSTask
{
    public static void main(String[] args)
    {
        //Task 1: Create and Add Elements to a HashSet
        HashSet<String> Hs=new HashSet<>();
        Hs.add("Maran");
        Hs.add("Vinoth");
        Hs.add("Arun");
        Hs.add("Tamil");
        Hs.add("Arun");
        System.out.println("Task 1:");
        System.out.println("HashSet: "+Hs);

        //Task 2: Remove an Element from a HashSet
        Hs.remove("Vinoth");
        System.out.println("Task 2:");
        System.out.println("Remove an Specified Element from a HashSet: "+Hs);

        //Task 3: Check if an Element Exists
        System.out.println("Task 3:");
        System.out.println("Element Exists: "+Hs.contains("Maran"));

        //Task 4: Convert HashSet to an ArrayList
        HashSet<Integer> Hs2=new HashSet<>();
        Hs2.add(4);
        Hs2.add(3);
        Hs2.add(5);
        Hs2.add(1);
        Hs2.add(2);
        ArrayList<Integer> Al= new ArrayList<>();
        Al.addAll(Hs2);
        System.out.println("Task 4:");
        System.out.println("Convert a LinkedList to an ArrayList: "+Al);

        //Task 5: Iterate Over a HashSet
        System.out.println("Task 5:");
        System.out.println("Print Element Using For-eachLoop:");
        for(String i:Hs)
        {
            System.out.print(i+" ");
        }
        System.out.println("\nPrint Element Using Iterator:");
        Iterator<String> i=Hs.iterator();
        while(i.hasNext()) 
        {
            System.out.print(i.next()+" ");
        }
    }
}

//HashMap

class HMTask
{
    public static void main(String[] args) 
    {
        //Task 1: Create and Print a HashMap
        HashMap<Integer,String> Hm=new HashMap<>();
        Hm.put(1,"Raja");
        Hm.put(2,"Mani");
        Hm.put(3,"Abi");
        Hm.put(4,"Mani");
        Hm.put(5,"Ram");       
        System.out.println("Task 1:");
        System.out.println("HashMap: "+Hm);
        
        //Task 2: Retrieve a Value from HashMap
        System.out.println("Task 2:");
        Set<Map.Entry<Integer, String>> es = Hm.entrySet();
        Iterator<Map.Entry<Integer, String>> i = es.iterator();
        while (i.hasNext()) 
        {
            Map.Entry<Integer, String> me = i.next();
            if (me.getKey().equals(3)) 
            {
                System.out.println("Retrived Value: "+me.getValue());
                break;
            }
        }

        //Task 3: Remove a Key from HashMap
        Integer key=2;
        Hm.remove(key);
        System.out.println("Task 3:");
        System.out.println("Remove an Entry: "+Hm);

        //Task 4: Iterate Over a HashMap
        System.out.println("Task 4:");
        for(var e:Hm.entrySet())
        {
            System.out.println("Key: "+e.getKey()+" - Value: "+e.getValue());
        }

        //Task 5: Convert HashMap Keys and Values to Separate Lists
        System.out.println("Task 5:");
        ArrayList<Integer> KeyAl=new ArrayList<>();
        KeyAl.addAll(Hm.keySet());
        System.out.println("Convert HashMap Keys to ArrayLists: "+KeyAl);
        ArrayList<String> ValueAl=new ArrayList<>();
        ValueAl.addAll(Hm.values());
        System.out.println("Convert HashMap Values to ArrayLists: "+ValueAl);
    }
}

//Balanced Bracket

class BracketStack
{
    public static void main(String[] args)
    {
        String str="[()]{}{[()()]()}";
        char[] ch=str.toCharArray();
        Stack<Character> S=new Stack<>();
        Boolean found=true;
        if(ch.length%2!=0)
        {
            found=false;
        }
        for(int i=0;i<ch.length;i++)
        {
            if (ch[i]=='{'||ch[i]=='['||ch[i]=='(') 
            {
                S.push(ch[i]);
            }
            else if(ch[i]==')'||ch[i]==']'||ch[i]=='}') 
            {
                if(S.isEmpty()==false)
                {
                    if(S.peek()==ch[i]);
                    {
                        S.pop();
                    }
                }
                else
                {
                    found=false;
                }
            }   
        }
        if(found!=true||S.isEmpty()!=true)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
    }
}

//Reverse Bracket

class BracketReverse
{
    public static void main(String[] args) 
    {
        String str="{{}}}";
        char[] ch=str.toCharArray();
        Stack<Character> stack = new Stack<>();
        Boolean found=true;
        int needreverse=0;
        if(ch.length%2!=0) 
        {
            needreverse=-1;
        }
        else
        {
        for(int i=0;i<ch.length;i++) 
        {
            if (ch[i]=='{') 
            {
                stack.push(ch[i]);
            } 
            else 
            {
                if(stack.isEmpty()) 
                {
                    stack.push(ch[i]);
                    needreverse++;
                } 
                else 
                {
                    stack.pop();
                }
            }
        }
        needreverse+=stack.size()/2;
        }
        System.out.println(needreverse);
    }
}

//Check Palindrome

class PalindromeStack
{
    public static void main(String[] args) 
    {
        String str="racecar";
        Stack<Character> S=new Stack<>();
        char[] ch=str.toCharArray();
        Boolean found=false;
        for(int i=0;i<ch.length;i++) 
        {
            S.push(ch[i]);
        }
        while(S.isEmpty()==false) 
        {
            if(S.peek()==S.pop())
            {
                found=true;
            }
            else
            {
                found=false;
            }
        }
        if(found=true)
        {
            System.out.println(str+"Palindrome");
        }
        else
        {
            System.out.println(str+"Not Palindrome");
        }
    }
}