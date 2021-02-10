import java.util.*;

public class Exercise {
    public static void main(String args[]) {
        // Create some temporary data structures to use later
        Character[] tmpArray = {'C', 'Z'};
        List<Character> tmpLetters = List.of('!', '8');
        List<Character> tmpList = Arrays.asList(tmpArray);

        // Create new ArrayDeque from array
        ArrayDeque<Character> queue = new ArrayDeque<>(tmpList);

        // Add elements to the start and end of the list.
        queue.offerFirst('β'); // Start
        queue.offer('H'); // End
        queue.add('U'); // End
        queue.offerLast('i'); // End
        queue.addFirst('a'); // Start
        queue.addAll(tmpLetters); // End
        queue.addLast('ß'); // End
        queue.push('å'); // Start

        // Alternate approach to using an iterator; reverse iteration
        System.out.println("...Reverse order");
        for (Iterator it = queue.descendingIterator(); it.hasNext();) {
            System.out.println(it.next());
        }

        // Look at front, end
        System.out.println("...Looking");
        System.out.println(queue.getFirst()); // Start
        System.out.println(queue.getLast()); // End
        System.out.println(queue.peek()); // Start
        System.out.println(queue.peekFirst()); // Start
        System.out.println(queue.peekLast()); // End
        System.out.println(queue.element()); // Start
        System.out.println(queue.contains('U')); // Specific value, returns boolean
        System.out.println("...Non-destructive looks");
        System.out.println(queue);

        // Remove characters one at a time. Print what remains.
        System.out.println("...Removing");
        System.out.println(queue.pop()); // Start
        System.out.println(queue.poll()); // Start
        System.out.println(queue.pollFirst()); // Start
        System.out.println(queue.pollLast()); // Last
        System.out.println(queue.remove());   // Start
        System.out.println(queue.removeFirst()); // Start
        System.out.println(queue.removeLast());  // End
        System.out.println(queue.remove('U')); // Specific value, returns boolean
        System.out.println("...Remaining");
        System.out.println(queue);
    }
}