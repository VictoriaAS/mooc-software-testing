package VictoriaTutorial;

public class NumFinderMain {
    public static void main(String[] args) {
        NumFinder nf = new NumFinder();
        nf.find(new int[] {3,100,7,9});
        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());

    }
}
