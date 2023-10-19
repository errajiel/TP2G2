public class ArrayExercises {
    public static void optimizedBubbleSort(int[] arr) {
        // Votre code ici pour le tri à bulles optimisé
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static int searchInRotatedArray(int[] arr, int target) {
        // Votre code ici pour la recherche dans un tableau pivoté
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;

            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) right = mid - 1;
                else left = mid + 1;
            } else {
                if (target > arr[mid] && target <= arr[right]) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }

    public static int[][] merge(int[][] intervals) {
        // Votre code ici pour fusionner les intervalles
        int[][] merged = new int[intervals.length][2];
        int idx = -1;

        for (int[] interval : intervals) {
            if (idx == -1 || interval[0] > merged[idx][1]) {
                merged[++idx] = interval;
            } else {
                merged[idx][1] = Math.max(merged[idx][1], interval[1]);
            }
        }

        int[][] result = new int[idx + 1][2];
        System.arraycopy(merged, 0, result, 0, idx + 1);
        return result;
    }
}