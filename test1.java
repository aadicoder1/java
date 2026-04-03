//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import java.util.Queue;
//import java.util.SortedSet;

public class test1{

public static void main(String[] args) {
    
    //class : ArrayList,LinkedList,HashSet,TreeSet,PriorityQueue,ArrayDeque,Stack,Vector

    //Iterable : Collection,List,Set,Queue,Deque,SortedSet,NavigableSet


    /*List<String> list = new ArrayList<>();
    list.add("Aman");
    list.add("Rahul");
    list.add("Aman");
    list.add(42);
    System.out.println(list);*/

    List <Integer> nums = Arrays.asList(3, 1, 4, 2);
    Collections.sort(nums);
    Collections.reverse(nums);
}
}