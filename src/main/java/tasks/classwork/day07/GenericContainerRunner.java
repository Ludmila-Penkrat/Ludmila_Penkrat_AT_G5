package tasks.classwork.day07;

public class GenericContainerRunner {

    public static void main(String[] args) {

        GenericContainer<Integer> container = new GenericContainer<>(); // когда мы создаем объект нам обязательно нужно указать с каким типом он будет работать
        // <String>, <Bubble>, <Integer> или любой другой и сможем работать только с оббъектами указнного типа

        for (int i=0; i<10; i++){
            container.add(i);
//            container.add("buuuuuuu");
        }
        System.out.println(container + "-created!\n");
        while (!container.isEmpty()){
            int integer = container.removeLast();
            System.out.println("Number " + integer + " removed...");
        }
    }
}
