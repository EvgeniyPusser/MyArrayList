package lists;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();

        list.add("opop");
        list.add("ioio");
        list.add("RRRR");
        list.add("y");


       list.removeEl("y");

        System.out.print(list);

        }
    }

