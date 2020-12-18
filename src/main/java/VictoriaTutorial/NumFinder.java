package VictoriaTutorial;

public class NumFinder {
    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;

    public int getSmallest() {
        return smallest;
    }

    public void setSmallest(int smallest) {
        this.smallest = smallest;
    }

    public int getLargest() {
        return largest;
    }

    public void setLargest(int largest) {
        this.largest = largest;
    }

    public void find(int[] nums) {
        for (int n : nums) {
            if (n < smallest) smallest = n;
            if (n > largest) largest = n;

        }
        /* getters for smallest and largest. right click>>generate>> select setter or
         getter */

        };
    }