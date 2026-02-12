import java.util.*;

class ArrayListPractice {
    public void practice(Scanner sc) {
        // TASK:- take input from user and save it in arrayList, then get the sum of the
        // elements and find the largest
        int sum = 0;
        int n, ele;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the number of elements:- ");
        n = sc.nextInt(); // taking input from user
        System.out.println("Enter the elements:- ");
        for (int i = 0; i < n; i++) {
            ele = sc.nextInt(); // the user will insert value
            list.add(ele); // the value is stored inside arraylist
        }
        int max = list.get(0); // initializing varaible
        System.out.println("the elements are:- ");
        for (int x : list) {
            System.out.print(x + " "); // display of elements using for each loop
            sum += x;
            if (x > max) {
                max = x;
            }
        }
        System.out.println();
        System.out.println("Sum :- " + sum);
        System.out.println("Largest Element:- " + max);

    }
}

class StackPractice {
    public void practice(Scanner sc) {
        int n, ele;
        Stack<Integer> st = new Stack<>(); // initalizing stack(LIFO)
        System.out.println("Enter the number of elements:- ");
        n = sc.nextInt(); // taking input from user
        System.out.println("Enter the " + n + " elements:- ");
        for (int i = 0; i < n; i++) {
            ele = sc.nextInt();
            st.push(ele); // the user input is pushed to stack
        }
        System.out.println("The Stack elements are :- ");
        for (int x : st) {
            System.out.print(x + " ");// printing the stack
        }
        System.out.println();
        int peek = st.peek();
        System.out.println("The top element :- " + peek);// peek operation help to look the top of the stack

        if (!st.isEmpty()) {
            int removed = st.pop();
            System.out.println("The popped element:- " + removed); // using pop we remove the 1 element
        }

        System.out.println("The stack after pop:- ");
        for (int x : st) {
            System.out.print(x + " "); // prints stack after pop operation
        }

    }
}

class QueuePractice {
    public void practice(Scanner sc) {
        int n, ele;
        Queue<Integer> q = new LinkedList<>(); // initalizing Queue(FIFO)
        System.out.println("Enter the number of elements:- ");
        n = sc.nextInt(); // taking input from user
        System.out.println("Enter the " + n + " elements:- ");
        for (int i = 0; i < n; i++) {
            ele = sc.nextInt();
            q.offer(ele); // the user input is pushed to queue
        }
        System.out.println("The Queue elements are :- ");
        for (int x : q) {
            System.out.print(x + " ");// printing the queue
        }
        System.out.println();

        if (!q.isEmpty()) {
            int peek = q.peek();
            System.out.println("The first element :- " + peek);// peek operation help to look the top of the queue

            int remove = q.poll();
            System.out.println("The popped ele:- " + remove);// remove the first element
        }

        System.out.println("The Queue elements(after pop) are :- ");
        for (int x : q) {
            System.out.print(x + " ");// printing the queue
        }
        System.out.println();

    }
}

class PriorityQueuePractice {
    public void practice(Scanner sc) {
        int n, ele;
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // initalizing PriorityQueue(Min Heap) where the smallest == highest priority
        System.out.println("Enter the number of elements:- ");
        n = sc.nextInt(); // taking input from user
        System.out.println("Enter the " + n + " elements:- ");
        for (int i = 0; i < n; i++) {
            ele = sc.nextInt();
            pq.offer(ele); // the user input is pushed to pq
        }
        System.out.println("The PriorityQueue elements are :- ");
        for (int x : pq) {
            System.out.print(x + " ");// printing the pq
        }
        System.out.println();
        if (!pq.isEmpty()) {
            int peek = pq.peek();
            System.out.println("The highest priority element :- " + peek);// peek operation help to look the top of the pq

            int remove = pq.poll();
            System.out.println("The popped ele:- " + remove);// remove the first element
        }

        System.out.println("The PriorityQueue elements(after pop) are :- ");
        for (int x : pq) {
            System.out.print(x + " ");// printing the pq
        }
        System.out.println();
    }
}

class ArrayDequePractice {
    public void practice(Scanner sc) {
        int n, ele;
        ArrayDeque<Integer> ad = new ArrayDeque<>(); // initalizing
        System.out.println("Enter the number of elements:- ");
        n = sc.nextInt(); // taking input from user
        System.out.println("Enter the " + n + " elements:- ");
        for (int i = 0; i < n; i++) {
            ele = sc.nextInt();
            ad.offerLast(ele); // the user input is stored inside ad
        }
        System.out.println("Enter the element to add to the front:- ");
        int front = sc.nextInt();
        ad.offerFirst(front);

        System.out.println("The Deque elements are :- ");
        for (int x : ad) {
            System.out.print(x + " ");// printing
        }
        System.out.println();

        if (!ad.isEmpty()) {
            int peek = ad.peekFirst();
            int rear = ad.peekLast();
            System.out.println("The front element :- " + peek);// peek operation help to look the elements inside ad
            System.out.println("The last element :- " + rear);

            int removeFront = ad.pollFirst();
            int removeRear = ad.pollLast();
            System.out.println("removed from front:- " + removeFront);// remove the first element
            System.out.println("Removed from rear:- " + removeRear); // remove the first element
        }

        System.out.println("The Final Deque :- ");
        for (int x : ad) {
            System.out.print(x + " ");// printing
        }
        System.out.println();
    }
}

class setPractice {
    public void practice(Scanner sc) {
        int n, ele;
        Set<Integer> hs = new HashSet<>(); // duplicate are not stored
        Set<Integer> lhs = new LinkedHashSet<>(); // same has hashset but the order will be maintained
        Set<Integer> ths = new TreeSet<>(); // for sorted form

        System.out.println("Enter the number of elements:- ");
        n = sc.nextInt();
        System.out.println("Enter the " + n + " elements:- ");
        for (int i = 0; i < n; i++) {
            ele = sc.nextInt();
            hs.add(ele);
            lhs.add(ele);
            ths.add(ele);
        }
        System.out.println("The HashSet values:- ");
        for (int x : hs) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("The LinkedHashSet values:- ");
        for (int y : lhs) {
            System.out.print(y + " ");
        }
        System.out.println();
        System.out.println("The TreeSet values:- ");
        for (int z : ths) {
            System.out.print(z + " ");
        }
    }
}

class MapPractice {
    public void practice(Scanner sc) {
        int n, ele;
        String name;
        Map<Integer, String> mp = new HashMap<>(); // key value pair
        Map<Integer, String> tmp = new TreeMap<>(); // for sorted form

        System.out.println("Enter the number of students:- ");
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Roll No. and there Name :- ");
        for (int i = 0; i < n; i++) {
            ele = sc.nextInt();
            sc.nextLine();
            name = sc.nextLine();
            mp.put(ele, name);
            tmp.put(ele, name);
        }
        System.out.println("The HashMap values:- ");
        for (Map.Entry<Integer, String> e : mp.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
        System.out.println();
        System.out.println("The TreeMap values:- ");
        for (Map.Entry<Integer, String> e : tmp.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}

public class Collections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose the option:- ");
            System.out.println("1:ArrayList, 2:Stack, 3:Queue, 4:PriorityQueue, 5:ArrayDeque, 6:Set, 7:Map, 8:exit");
            int ch = sc.nextInt();
            if (ch == 8) {
                System.out.println("Exiting....");
                break;
            } else {
                switch (ch) {
                    case 1:
                        ArrayListPractice ar = new ArrayListPractice();
                        ar.practice(sc);
                        break;
                    case 2:
                        StackPractice st = new StackPractice();
                        st.practice(sc);
                        break;
                    case 3:
                        QueuePractice q = new QueuePractice();
                        q.practice(sc);
                        break;
                    case 4:
                        PriorityQueuePractice pq = new PriorityQueuePractice();
                        pq.practice(sc);
                        break;
                    case 5:
                        ArrayDequePractice ad = new ArrayDequePractice();
                        ad.practice(sc);
                        break;
                    case 6:
                        setPractice hs = new setPractice();
                        hs.practice(sc);
                        break;
                    case 7:
                        MapPractice map = new MapPractice();
                        map.practice(sc);
                        break;
                    default:
                        System.out.println("Invalid..");
                        break;
                }
            }
        }
        sc.close();
    }
}