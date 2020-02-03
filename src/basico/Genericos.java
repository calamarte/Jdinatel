package basico;

import java.util.*;

public class Genericos {

    /**
     * https://www.adictosaltrabajo.com/2015/09/25/introduccion-a-colecciones-en-java/
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("############# ARRAYLIST ###########");
        List<Integer> lista = new ArrayList();

        lista.add(1);
        lista.add(2);
        lista.add(1);
        lista.remove(2);

        System.out.println("ArrayList: " + lista);

        System.out.println("########### MAP ###########");
        Map<String, Integer> map = new HashMap();

        map.put("juan", 1);
        map.put("pepe", 5);

        System.out.println("Valor de juan: " + map.get("juan"));

        System.out.println("############# SET ###############");
        Set<Integer> set = new HashSet();

        set.add(1);
        set.add(1);

        System.out.println("Set: " + set);


        System.out.println("########### LINKEDLIST ###########");
        Deque<Integer> linkedList = new LinkedList();

        linkedList.push(1);
        linkedList.push(3);
        linkedList.push(15);
        linkedList.push(27);

        Integer ultimo = linkedList.pop();
        System.out.println("Ultimo valor era: " + ultimo);
        System.out.println("Linkedlist: " + linkedList);

        System.out.println("########### QUEU #############");

        Queue<Integer> fifo = new LinkedList();
        fifo.add(1);
        fifo.add(2);
        fifo.add(5);
        fifo.add(4);

        int size = fifo.size();
        for (int i = 0; i < size; i++) {
            System.out.println(fifo.poll());
        }

        //Es una pila sincronizada
        System.out.println("######### STACK ##########");

        Stack<Integer> stack = new Stack();
        stack.push(1);
        stack.push(3);

        System.out.println("La ultima posicion era: " + stack.pop());
        System.out.println("Stack: " + stack);



        String banner =
                "########################################\n" +
                "#            Iteraciones               #\n" +
                "########################################\n";

        System.out.println(banner);

        List<Integer> iterable = new ArrayList();

        iterable.add(1);
        iterable.add(1);
        iterable.add(1);
        iterable.add(1);

        System.out.println("CLASIC");
        for (int i = 0; i < iterable.size(); i++) {
            System.out.println(iterable.get(i));
        }

        System.out.println("FOREACH");
        for(Integer i : iterable){
            System.out.println(i);
        }

        System.out.println("ITERATOR");
        Iterator iterator = iterable.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("FUNCTIONAL FOREACH (Referencial)");
        iterable.forEach(System.out::println);

        System.out.println("FUNCTIONAL FOREACH (Lambda)");
        iterable.forEach(i -> System.out.println(i));

        Map<String, Integer> mapa = new HashMap();

        List<Integer> valores = (List<Integer>) mapa.values();



    }


    public class Generic<T extends Number>{

        private T gen;

        public void setGen(T gen){
            this.gen = gen;
        }




    }

}
