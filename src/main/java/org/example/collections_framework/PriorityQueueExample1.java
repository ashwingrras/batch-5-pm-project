package org.example.collections_framework;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PriorityQueueExample1
{
    public static void main(String[] args)
    {
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>();
        priorityQueue1.add("vikash");
        priorityQueue1.add("yogesh");
        priorityQueue1.add("yuvraj");
        priorityQueue1.add("jahanvi");
        priorityQueue1.add("ashwin");
        System.out.println("priority queue: "+priorityQueue1);
        priorityQueue1.remove();
        System.out.println(priorityQueue1.peek());
        System.out.println(priorityQueue1);
        System.out.println(priorityQueue1.poll());
        System.out.println(priorityQueue1);
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>();
        priorityQueue2.add(2);
        priorityQueue2.add(3);
        priorityQueue2.add(1);
        priorityQueue2.add(4);
        priorityQueue2.add(5);
        priorityQueue2.add(15);
        System.out.println(priorityQueue2);


        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer value1, Integer value2) {

                System.out.println("at compare method, value1: "+value1+", value2: "+value2);
                if (value1 < value2)
                    return -1;
                if (value1 == value2)
                    return 0;
                return 1;
            }
        });

        integerPriorityQueue.add(15);
        integerPriorityQueue.add(12);
        //integerPriorityQueue.add(10);
        integerPriorityQueue.add(25);
        integerPriorityQueue.add(23);
        integerPriorityQueue.add(35);
        System.out.println("integerPriorityQueue: "+integerPriorityQueue);
        ///// from geeks  for geeks
        Comparator<Integer> ascendingOrderComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2)
                    return -1;
                if (o1 == o2)
                    return 0;
                return 1;
            }
        };
        Queue<Integer> priorityQueue = new PriorityQueue<>(ascendingOrderComparator);

        // insert elements in the queue
        /*priorityQueue.offer(15);
        priorityQueue.offer(12);
        priorityQueue.offer(25);
        priorityQueue.offer(23);
        priorityQueue.offer(35);*/
        priorityQueue.offer(15);
        //priorityQueue.offer(100);
        priorityQueue.offer(12);
        priorityQueue.offer(23);
        priorityQueue.offer(25);
        priorityQueue.offer(35);
        priorityQueue.offer(32);
        System.out.println("priorityQueue: before sorted "+priorityQueue);
        int priorityQueueSize =priorityQueue.size();
        Queue<Integer> priorityQueueMod = new PriorityQueue<>();
        for(int i = 0; i < priorityQueueSize; i++)
        {
            priorityQueueMod.add(priorityQueue.poll());
        }
        System.out.println("priorityQueueMod: "+priorityQueueMod);
        List<Integer> sorted = priorityQueue.stream().sorted().toList();
        System.out.println("sorted: "+sorted);
        System.out.println("priorityQueue: after sorted "+priorityQueue);
        Queue<Integer> sortedQueue = new LinkedList<>(sorted);
        System.out.println("sortedQueue: "+sortedQueue);
        System.out.println("priorityQueue: after sortedQueue "+priorityQueue);
        // output
        while (!priorityQueue.isEmpty())
        {
            System.out.print(priorityQueue.poll() + " ");
        }
        Iterator<Integer> iterator = priorityQueueMod.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
