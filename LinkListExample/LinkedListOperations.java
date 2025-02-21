
 // implement All linked list operations using LinkedList

 import java.util.LinkedList;
 import java.util.ListIterator;
 import java.util.Collections;
 import java.util.Scanner;
 
 public class LinkedListOperations {
     public static void main(String[] args) {
         LinkedList<Integer> linkedList = new LinkedList<>();
         Scanner scanner = new Scanner(System.in);
         boolean running = true;
 
         while (running) {
             System.out.println("\nLinkedList Operations Menu:");
             System.out.println("1. Add to the front");
             System.out.println("2. Add to the end");
             System.out.println("3. Add at a specific position");
             System.out.println("4. Remove from the front");
             System.out.println("5. Remove from the end");
             System.out.println("6. Remove by value");
             System.out.println("7. Get first element");
             System.out.println("8. Get last element");
             System.out.println("9. Get element at a specific position");
             System.out.println("10. Update element at a specific position");
             System.out.println("11. Traverse the list forward");
             System.out.println("12. Search by value");
             System.out.println("13. Size of the list");
             System.out.println("14. Check if the list is empty");
             System.out.println("15. Clear the list");
             System.out.println("16. Convert to array");
             System.out.println("17. Sort the list");
             System.out.println("18. Exit");
             System.out.print("Enter your choice: ");
             int choice = scanner.nextInt();
             scanner.nextLine();  // Consume the newline
 
             switch (choice) {
                 case 1:
                     System.out.print("Enter element to add to the front: ");
                     int element1 = scanner.nextInt();
                     linkedList.addFirst(element1);
                     System.out.println("List: " + linkedList);
                     break;
                 case 2:
                     System.out.print("Enter element to add to the end: ");
                     int element2 = scanner.nextInt();
                     linkedList.addLast(element2);
                     System.out.println("List: " + linkedList);
                     break;
                 case 3:
                     System.out.print("Enter position: ");
                     int position = scanner.nextInt();
                     scanner.nextLine();  // Consume the newline
                     System.out.print("Enter element to add: ");
                     int element3 = scanner.nextInt();
                     linkedList.add(position, element3);
                     System.out.println("List: " + linkedList);
                     break;
                 case 4:
                     if (!linkedList.isEmpty()) {
                         linkedList.removeFirst();
                         System.out.println("List: " + linkedList);
                     } else {
                         System.out.println("The list is empty.");
                     }
                     break;
                 case 5:
                     if (!linkedList.isEmpty()) {
                         linkedList.removeLast();
                         System.out.println("List: " + linkedList);
                     } else {
                         System.out.println("The list is empty.");
                     }
                     break;
                 case 6:
                     System.out.print("Enter element to remove: ");
                     int element4 = scanner.nextInt();
                     if (linkedList.remove(Integer.valueOf(element4))) {
                         System.out.println("Element removed. List: " + linkedList);
                     } else {
                         System.out.println("Element not found in the list.");
                     }
                     break;
                 case 7:
                     if (!linkedList.isEmpty()) {
                         System.out.println("First element: " + linkedList.getFirst());
                     } else {
                         System.out.println("The list is empty.");
                     }
                     break;
                 case 8:
                     if (!linkedList.isEmpty()) {
                         System.out.println("Last element: " + linkedList.getLast());
                     } else {
                         System.out.println("The list is empty.");
                     }
                     break;
                 case 9:
                     System.out.print("Enter position: ");
                     int position2 = scanner.nextInt();
                     if (position2 >= 0 && position2 < linkedList.size()) {
                         System.out.println("Element at position " + position2 + ": " + linkedList.get(position2));
                     } else {
                         System.out.println("Invalid position.");
                     }
                     break;
                 case 10:
                     System.out.print("Enter position: ");
                     int position3 = scanner.nextInt();
                     scanner.nextLine();  // Consume the newline
                     if (position3 >= 0 && position3 < linkedList.size()) {
                         System.out.print("Enter new element: ");
                         int newElement = scanner.nextInt();
                         linkedList.set(position3, newElement);
                         System.out.println("List: " + linkedList);
                     } else {
                         System.out.println("Invalid position.");
                     }
                     break;
                 case 11:
                     System.out.println("Forward traversal:");
                     ListIterator<Integer> iterator = linkedList.listIterator();
                     while (iterator.hasNext()) {
                         System.out.println(iterator.next());
                     }
                     break;
                 case 12:
                     System.out.print("Enter element to search: ");
                     int element5 = scanner.nextInt();
                     boolean contains = linkedList.contains(element5);
                     System.out.println("Contains " + element5 + "? " + contains);
                     break;
                 case 13:
                     System.out.println("Size of the list: " + linkedList.size());
                     break;
                 case 14:
                     boolean isEmpty = linkedList.isEmpty();
                     System.out.println("Is the list empty? " + isEmpty);
                     break;
                 case 15:
                     linkedList.clear();
                     System.out.println("List cleared. Current list: " + linkedList);
                     break;
                 case 16:
                     Object[] array = linkedList.toArray();
                     System.out.println("List converted to array: " + java.util.Arrays.toString(array));
                     break;
                 case 17:
                     Collections.sort(linkedList);
                     System.out.println("Sorted list: " + linkedList);
                     break;
                 case 18:
                     running = false;
                     System.out.println("Exiting...");
                     break;
                 default:
                     System.out.println("Invalid choice. Please try again.");
             }
         }
 
         scanner.close();
     }
 }
 