package org.milan.datastructure.heap;

/**
 * Problem: {@link @https://www.geeksforgeeks.org/merge-k-sorted-arrays/}
 * <p>
 * Time Complexity: O(n*k*logk) -- Insertion and deletion in a Min Heap requires logk time.
 * Space Complexity: O(n*k)
 *
 * @author Milan Rathod
 */
public class MergeKSortedArrays {

    /**
     * Merge all sorted arrays into one array
     *
     * @param input 2d array of integers
     * @param k     numbers of sorted arrays to be merged
     * @return merged sorted array
     */
    public int[] merge(int[][] input, int k) {

        MinHeapNode[] minHeapNodes = new MinHeapNode[k];

        int resultSize = 0;

        for (int i = 0; i < k; i++) {
            MinHeapNode minHeapNode = new MinHeapNode(input[i][0], i, 1);
            minHeapNodes[i] = minHeapNode;
            resultSize += input[i].length;
        }

        MinHeap minHeap = new MinHeap(minHeapNodes, k);

        int[] output = new int[resultSize];

        // One by one get the minimum element from the heap and replace it with next element of its array
        for (int i = 0; i < resultSize; i++) {

            // Get the minimum element and store it in result
            MinHeapNode minHeapNode = minHeap.getMin();

            output[i] = minHeapNode.element;

            // Find the next element that will replace current
            // root of heap. The next element belongs to same
            // array as the current root.
            if (minHeapNode.nextElement < input[minHeapNode.arrayNumber].length)
                minHeapNode.element = input[minHeapNode.arrayNumber][minHeapNode.nextElement++];
                // If root was the last element of its array
            else
                minHeapNode.element = Integer.MAX_VALUE;

            // Replace root with next element of array
            minHeap.replaceMin(minHeapNode);
        }

        return output;
    }

    static class MinHeap {

        /**
         * Array of elements in heap
         */
        MinHeapNode[] store;

        /**
         * Current number of elements in min heap
         */
        int heapSize;

        public MinHeap(MinHeapNode[] minHeapNodes, int size) {
            heapSize = size;
            store = minHeapNodes;
            int i = (heapSize - 1) / 2;
            while (i >= 0) {
                minHeapify(i);
                i--;
            }
        }

        /**
         * Recursive method to heapify a subtree with the root at
         * given index.
         * <p>
         * NOTE: his method assumes that the subtrees are already heapified
         *
         * @param index index for which heapify should done
         */
        private void minHeapify(int index) {
            int left = left(index);
            int right = right(index);
            int smallest = index;
            if (left < heapSize && store[left].element < store[index].element)
                smallest = left;
            if (right < heapSize && store[right].element < store[smallest].element)
                smallest = right;
            if (smallest != index) {
                swap(store, index, smallest);
                minHeapify(smallest);
            }
        }

        int left(int i) {
            return (2 * i + 1);
        }

        int right(int i) {
            return (2 * i + 2);
        }

        /**
         * Get the min node i.e. root node
         */
        MinHeapNode getMin() {
            if (heapSize <= 0) {
                System.out.println("Heap underflow");
                return null;
            }
            return store[0];
        }

        /**
         * Replace root with new node
         *
         * @param newRoot new root node
         */
        void replaceMin(MinHeapNode newRoot) {
            store[0] = newRoot;
            minHeapify(0);
        }

        /**
         * A utility function to swap two min heap nodes
         */
        void swap(MinHeapNode[] arr, int i, int j) {
            MinHeapNode temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}

class MinHeapNode {

    // The element to be stored
    int element;

    // index of array from which element is taken
    int arrayNumber;

    // index of next element to be picked from array
    int nextElement;

    public MinHeapNode(int element, int arrayNumber, int nextElement) {
        this.element = element;
        this.arrayNumber = arrayNumber;
        this.nextElement = nextElement;
    }
}