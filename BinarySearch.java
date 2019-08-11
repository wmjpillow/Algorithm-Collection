// Binary Search
// https://zh.wikipedia.org/wiki/二分搜索算法

public static int binarySearch( int[] arr, int start, int end, int hkey){
    if(start>end)
       return -1;

    int mid= start+(end-start)/2;
    if (arr[mid]> hkey)
       return binarySearch(arr, start, mid-1, hkey);
    if (arr[mid]<hkey)
       return binarySearch(arr, mid+1, end, hkey);
    return mid;
}


//java while 
Public static int binarySearch( int[] arr, int start, int end, int hkey){
    int result = -1;

    while (start<=end){
        int mid= start+(end-start)/2;
        if(arr[mid]>hkey)
           end= mid-1;
        else if(arr[mid]<hkey)
           start= mid+1;
        else{
            result= mid;
            break;
        }
    }
    return result;
}
