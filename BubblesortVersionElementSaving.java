/*
 * Tobias Straub
 * hello@tobiasstraub.com
 * http://www.tobiasstraub.com
 * 
 * This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/.
 */
package bubblesortversionelementsaving;

public class BubblesortVersionElementSaving {

    public static void bubblesort(int[] dataSequence) {
        int n = dataSequence.length;
        int temp;
        int elementSaving;

        while (n > 1) {
            elementSaving = 1;
            for (int i = 0; i < n - 1; ++i) {
                if (dataSequence[i + 1] < dataSequence[i]) {
                    temp = dataSequence[i];
                    dataSequence[i] = dataSequence[i + 1];
                    dataSequence[i + 1] = temp;
                    elementSaving = i + 1;
                }
            }
            n = elementSaving;
        }
    }

    public static void main(String[] args) {
        int[] dataSequence = {6, 8, 10, 3}; // The data sequence to be sorted
        bubblesort(dataSequence); // Call sort method

        for (int i = 0; i < dataSequence.length; i++) {
            System.out.print(dataSequence[i] + " ");
        }
    }
}
