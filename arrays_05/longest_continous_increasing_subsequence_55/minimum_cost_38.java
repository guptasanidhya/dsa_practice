public class minimum_cost_38 {
    public static void main(String[] args) {
//        int arr[]={2,2,2,3,3};
//        int arr[] = {1, 100000};
        int arr[] = {1,2,2,2,2};

        int even =0;
        int odd = 0;

        int max=arr[arr.length-1];
        for(int i=0;i<arr.length;i++){

            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        if(even>odd){
            System.out.println(odd);
        }
        else if(even<odd){
            System.out.println(even);

        }
        else{
            System.out.println(odd);
        }
    }
    }
