

public class DataBasejava {
    public static void main(String[] args) {
        System.out.printf("qtd de argumentos = %d%n", args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.printf("\targs[%d] = %s%n", i, args[i]);
        }
    }
}

class DefinirPeso {
    String name = "";
    int age = 0;
    char sex = 'm';
}
