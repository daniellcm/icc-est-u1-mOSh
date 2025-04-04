import controller.ShellSort;

public class App {
    public static void main(String[] args) throws Exception {
        ShellSort sS = new ShellSort();
        int[] a = { -10, 0, 4, 7, 2, 1, 9, 6, 5 };
        System.out.println("Daniel Cajas ");
        System.out.println("Ordenado Ascendentemente");
        sS.printArray(a);  
        sS.sort(a, true);  
        sS.printArray(a);  
        System.out.println("");
        System.out.println("Ordenado Descendentemente");
        sS.sort(a, false);  
        System.out.println(" ");
    }
}

