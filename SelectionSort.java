class SelectionSort
{
    void sort(int arr[])
    {
        int n = arr.length;
 
        
        for (int i = 0; i < n-1; i++)                                                     // One by one move boundary of unsorted subarray
        {
            int min_idx = i;                                                              // Find the minimum element in unsorted array
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            int temp = arr[min_idx];                                                      // Swap the found minimum element with the first element
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
