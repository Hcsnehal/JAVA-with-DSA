import java.util.*;
public class collection {
   //java collection are the set of pre-defined classes and interfaces that help programmer to perform different kinds of data structure 
   //opration like sorting,serching,traversing,storing and proccessing data efficiently .
   public static void main(String[] args) {
//     int arr[] = {1,2,3,4,5,4};
//    for (int i = 0; i < arr.length; i++) {
//     System.out.println(arr[i]);

//1.Arraylist//
// ArrayList<String> str =new ArrayList<String>();
// str.add("apple");
// str.add("banana");
// str.add("orange");
// str.add("watermelon");
// str.add("mango");
// str.add("apple");
// System.out.println(str);

//using iterator//
// ArrayList<String> str = new ArrayList<>();
// str.add("mango");
// str.add("banana");
// str.add("orange");
// str.add("watermelon");
// str.add("mango");
// str.add("apple");
// Iterator itr = str.iterator();
// while (itr.hasNext()) {
//     System.out.println(itr.next());
// }

//iteration using for each loop//
// ArrayList<String> list = new ArrayList<>();
// list.add("mango");
// list.add("banana");
// list.add("watermelon");
// list.add("apple");
// for (String fruit : list) {
//     System.out.println(fruit);
// }

//get and set arraylist//
// ArrayList<String> list = new ArrayList<>();
// list.add("banana");
// list.add("mango");
// list.add("watermelon");
// list.add("apple");
// System.out.println("returning elemrnt from list" +list.get(2));
// list.set(1,"kivi");
// for(String frt : list){
//     System.out.println(frt);
// }

//Sort in arraylist:
//The sort() method in Java is used to arrange the elements of a collection in a specific order, either ascending or descending.
// Sorting is a common operation performed on arrays and lists to organize data for efficient searching, analysis, or presentation.

// ArrayList<String> list = new ArrayList<>();
// list.add("mango");
// list.add("banana");
// list.add("apple");
// list.add("kivi");
// list.add("watermelon");

// list.set(0,"sinu");
// System.out.println("sorting the list :");
// Collections.sort(list);
// for(String frt : list){
//     System.out.println(frt);
// }
// System.out.println("getting the element =" +list.get(1));

// ArrayList<Integer> i = new ArrayList<>();
// i.add(6);
// i.add(2);
// i.add(3);
// i.add(4);

// Collections.sort(i);
// for(Integer a : i){
//     System.out.println(a);
// }

// ArrayList<String> list = new ArrayList<>();
// list.add("mango");
// list.add("banana");
// list.add("apple");
// list.add("kivi");
// list.add("watermelon");
// ListIterator<String> list1=list.listIterator(list.size());  
//               while(list1.hasPrevious())  
//               {  
//                   String str=list1.previous();  
//                   System.out.println(str);  
//               }  

// for each method in java//
// ArrayList<String> list = new ArrayList<>();
// list.add("mango");
// list.add("banana");
// list.add("apple");
// list.add("kivi");
// list.add("watermelon");

// // list.forEach(a ->{
// //     System.out.println(a);
// // });
 
// //forEachRemaining method//
// Iterator<String> st = list.iterator();
// st.forEachRemaining(a ->{
//  System.out.println(a);
// });


// ArrayList<String> list1 = new ArrayList<>();
// list1.add("mango");
// list1.add("orange");
// list1.add("kivi");

// ArrayList<String> list2 = new ArrayList<>();
// list1.add("watermolom");
// list1.add("orange");
// list1.add("kivi");

// list1.retainAll(list2);
// System.out.println(list1);


//isEmpty() method in java //
// ArrayList<String> list1 = new ArrayList<>();
// System.out.println("is list empty" +list1.isEmpty());
// list1.add("mango");
// list1.add("orange");
// list1.add("kivi");
// System.out.println("after insertion ");
// System.out.println("is list empty" +list1.isEmpty());

//2)Linklist//
//linklist is a linear collection of data structure where data are not stored in sequentially inside the 
//computer momory but thay are link woth each other by the help of address//

//types of linklist//
//1.singly linklist
//2.doubly linklist
//3.circular linklist

//1.Singly linklist
//-insert item at begining,ending.
//-insert item at any position.
//-delete from begining and ending.delet from at any position

// LinkedList<String> ls = new LinkedList<>();
// ls.add("banana");
// ls.add("mango");
// ls.add("orange");
// ls.add("kivi");
// System.out.println("origanal linklist " +ls);

// ls.addFirst("sinu");
// ls.addLast("minu");
// System.out.println("after adding first and last element " +ls);

// ls.removeFirst();
// ls.removeLast();
// ls.remove("kivi");
// System.out.println("list after removing some elements " +ls);

// String st1 =ls.getFirst();
// System.out.println("getfirst element in list " +st1);

// String st2 =ls.getLast();
// System.out.println("getlast element in list " +st2);


//2.Doubly linklist//

//it is the linear collection of data item called node where each node is divided into three part i.e 
//data part,previous part and next part.


//list//

// List<String> st = new ArrayList<String>();
// st.add("mango");
// st.add("orange");
// st.add("banana");
// for(String str : st){
//    System.out.println(str);
// }

//converting array to list//
// String[] arr = {"mango","banana","orange","kivi"};
// // System.out.println("printing array ");
// System.out.println(arr);

// List<String> st = new ArrayList<String>();
// for(String sinu : arr){
//    System.out.println(sinu);
// }


//hashset in java //
// HashSet<String> set = new HashSet<>();
// set.add("one");
// set.add("two");
// set.add("three");
// set.add("four");
// Iterator<String> i = set.iterator();
// while (i.hasNext()) {
//    System.out.println(i.next());
// }

//Hashset from another collection//
// ArrayList<String> list = new ArrayList<>();
// list.add("one");
// list.add("two");
// list.add("three");
// list.add("Four");
// list.add("Four");

// HashSet<String> set = new HashSet(list);
// set.add("seven.");
// Iterator<String> itr = set.iterator();
// while (itr.hasNext()) {
//    System.out.println(itr.next());
// }

//linkhashSet//
// LinkedHashSet<String> list = new LinkedHashSet();
// list.add("mango");
// list.add("banana");
// list.add("mango");
// list.add("kivi");

// Iterator<String> itr = list.iterator();
// while (itr.hasNext()) {
//    System.out.println(itr.next());
// }

//TreeSet//
// TreeSet<String> tr = new TreeSet();
// tr.add("za");
// tr.add("two");
// tr.add("three");
// Iterator<String> i = tr.iterator();
// while (i.hasNext()) {
//    System.out.println(i.next());
   
// }

// TreeSet<String> tr = new TreeSet();
// tr.add("za");
// tr.add("two");
// tr.add("three");
// Iterator<String> i = tr.descendingIterator();
// while (i.hasNext()) {
//    System.out.println(i.next());
   
// }


// TreeSet<Integer> tr = new TreeSet();
// tr.add(22);
// tr.add(2);
// tr.add(3);
// System.out.println("lowest value " +tr.pollFirst());
// System.out.println("highest value " +tr.pollLast());

//queue in java //
//Queue follows FIFO principal i.e insertion of element take place at the end and deletion take place from head//
// Queue<String> st = new LinkedList<>();
// st.add("one");
// st.add("two");
// st.add("three");
// System.out.println("Queue " +st);
// String st1 = st.remove();
// System.out.println("After removal "+st1);

// String peekelement = st.peek();
// System.out.println("head element " +peekelement);

// System.out.println("queue after removal" +st);

// boolean b = st.contains("three");
// System.out.println(b);
// st.add("four");
// System.out.println("element aftr insertion " +st);

// String removeeleement = st.remove();
// System.out.println("remove element" +st);

// //priority queue//
// PriorityQueue<Integer> pr = new PriorityQueue<>();
// pr.add(60);
// pr.add(20);
// pr.add(100);
// pr.add(5);
// System.out.println(pr);


// System.out.println("remove element" +pr.poll());
// System.out.println("element after removal" +pr);
// System.out.println("head of the element " +pr.peek());

//Deque//
//Deque<String> dr = new ArrayDeque<String>(); 
// dr.add("five");
// dr.add("two");
// dr.addLast("three");
// dr.addFirst("four");

// // System.out.println("deque is =" +dr);
// // System.out.println("remove first= "+dr.removeFirst());
// // System.out.println("remove last =" +dr.removeLast());

// // System.out.println("element after removal =" +dr);

// // System.out.println("Add one element " +dr.add("seven"));
// // System.out.println("element after adding element" +dr);

// // System.out.println("peek first =" +dr.peekFirst());
// // System.out.println("peek last =" +dr.peekLast());
// System.out.println("display ="+dr);

   //map in java : stored value in key value pair //
   // Map<Integer,String> m = new HashMap<Integer,String>();
//    Map<Integer,String> m=new HashMap<Integer,String>();  
//    m.put(100,"Amit");  
//    m.put(101,"Vijay");  
//    m.put(102,"Rahul");  
//    //Elements can traverse in any order  
//   for(Map.Entry ms : m.entrySet()){
//   System.out.println(ms.getKey()+ " " +ms.getValue());
//   }

// Map<Integer,String> m = new HashMap<Integer,String>();
// m.put(1,"snehal");
// m.put(2,"sinu");
// m.put(3,"sakshi");
// m.put(4,"sanika");
// for(Map.Entry ms : m.entrySet()){
//    System.out.println(ms.getKey() + " " +ms.getValue());
// }

// Map<Integer,String> m = new HashMap<Integer,String>();
// m.put(1,"snehal");
// m.put(2,"sinu");
// m.put(3,"sakshi");
// m.put(4,"sanika");

// for(Map.Entry ms : m.entrySet()){
//    System.out.println(ms.getKey() + " " + ms.getValue());
// }

// HashMap<Integer,String> m = new HashMap<Integer,String>();
// m.put(1,"snehal");
// m.put(2,"sinu");
// m.put(3,"sakshi");
// m.put(4,"sanika");

// for(Map.Entry ms : m.entrySet()){
//    System.out.println(ms.getKey() + " " + ms.getValue());
// }
// // m.remove(3,"sakshi");
// // System.out.println("aftr removing " +m);

//treemap in java//

// TreeMap<Integer,String> m = new TreeMap<Integer,String>();
// m.put(5,"rani");
// m.put(2,"sinu");
// m.put(3,"Aakshi");
// m.put(4,"sanika");
// for(Map.Entry ms : m.entrySet()){
//    System.out.println(ms.getKey() + " " +ms.getValue());
// }
   }
   }

