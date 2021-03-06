/* 
High Array App

Name  : andi irham Marhamuddin
class : TRPL 1B;
BP    : 1911082006
 */

class HighArray {               //class high array
    private int[] arr;          // Declaration of arr arrays
    private int nElement;       // declaration integer nElement
    
    public HighArray(int max){      //Constructor
        arr = new int[max];         //Create Array
        nElement = 0;
    }
    public void insert(int value){              //Insert into Array
        arr[nElement] = value;
        nElement++;
    }
    public boolean find(int key){               // Binary Search
        int i;
        for (i = 0; i < nElement; i++) {
            if (arr[i]==key) {                  //is it match?
                break;
            }
        }
        if (i==nElement) {                      //not match?
            return false;
        }else
            return true;                        //matched
    }
    public boolean delete(int value){           //Array delete me
        int i;
        for (i = 0; i < arr.length; i++) {
            if (value==arr[i]) {
                break;
            }
        }
                if (i==nElement) {
                return false;
                }
        else
        {
            for (int j = i; j < nElement; j++) {
                arr[j]=arr[j+1];
            }
            nElement--;  //decrement size
            return true;
        }
    }

    int size()
    {
        return nElement;
    }
    
    public void display(){
        for (int i = 0; i < nElement; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    //TUGAS
    // a
    public int getMax(){
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=x) {
                x = arr[i];
            }
        }
        return x;
    }

    //b
    public void removeMax(){
        int x=0, index = 0;
        for (int i = 0; i < nElement; i++) {
            if (arr[i]>=x) {
                x = arr[i];
                index=i;
            }
        }
        System.out.println("nilaiMax = "+x);
        if (arr[index]>arr[index+1]) {
            arr[index]=arr[index+1];
        } else{
            arr[index]=0;
        }
        nElement--;
    }

    //c
    public void noDuplicater(){
        int[] x = new int[arr.length];          // new object
        for (int i = 0; i < nElement; i++) {        //search the array
            if (arr[i] != arr[i+1]) {
                x[i] = arr[i];
            }
        }
        arr = x;
        for (int i = 0; i < nElement; i++) {        //delete specified array
            while (arr[i] == 0) {
                delete(0);
            }
        }
    }
    
    public void BubbleSort(){
        int batas, i, n=0;                                  // declaration of variable
        for (batas = nElement-1; batas > 0; batas--) { // outer loop
            for (i = 0; i < batas; i++) {              // inner loop
                n++;
                System.out.println("i = "+i+" i+1 = "+(i+1));
                if (arr[i] > arr[i+1]) {                
                    swap(i,i+1);
                    display();
                    
                }
            }
        }
        System.out.println("\nJumlah perbandingan sebannyak "+n);
    }
    
    public void SelectionSort(){
        int awal, i, min;
        
        for (awal = 0; awal < nElement; awal++) {
            min = awal;
            for (i = awal+1; i < nElement; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
            }
            swap(awal, min);
            display();
        }
    }
    
    public void InsertionSort(){
        int i, j;
        
        for (j= 1; j < nElement; j++) {
            int temp = arr[j];
            
            i = j;
            
            while (i > 0 && arr[i-1] >= temp) {  
                //ystem.out.println("arr[i]= "+arr[i]+" arr[i-1] = "+arr[i-1]);
                arr[i] = arr[i - 1];
                display();
                i--;
            }
            arr[i] = temp;
            //System.out.println("arr[i] = "+arr[i]);
            display();
        }
    }
    
    public void swap(int one, int two){
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
public class HighArrayApp{
    public static void main(String[] args) {
        int maxSize=100;
        HighArray arr;
        arr = new HighArray(maxSize);
        
        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(25);
        //arr.insert(25);
        //arr.insert(30);
        //arr.insert(00);
        //arr.insert(40);
        //arr.insert(90);
        
        arr.display();
        System.out.println("");
        arr.InsertionSort();
        System.out.println("");
        arr.display();
        
       /* int key=25;
        if (arr.find(key)) {
            System.out.println(key+" ditemukan");
        }else
            System.out.println(key+" tidak ditemukan");
        
        arr.delete(00);
        arr.delete(80);
        arr.delete(55);
       
        arr.display();
        arr.getMax();
        //arr.removeMax();
        arr.noDuplicater();
        arr.display();
        */
    }
}