const binarySearch = (array, target) => {
    let i = 0,  j = array.length - 1;
    while(i <= j) {
        const mid = parseInt( i + (j - i)/2);
        if(array[mid] < target) {
           i = mid + 1; 
        } else if(array[mid] > target) {
            j = mid - 1;
        } else {
            return mid
        }
    }
}

console.log(binarySearch([1, 2, 3, 4, 5, 6], 2))
console.log(binarySearch([1, 2, 3, 4, 5, 6], 1))
console.log(binarySearch([1, 2, 3, 4, 5, 6], 4))
console.log(binarySearch([1, 2, 3, 4, 5, 6], 6))