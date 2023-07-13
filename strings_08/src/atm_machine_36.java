public class atm_machine_36 {
    public static void main(String[] args) {
        int atm=10;
        int people =5;
        int arr[]={3,5,3,2,1};
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<people;i++){
            if(atm>=arr[i]){
            atm=atm-arr[i];
            sb.append('1');
            }
            else{
                sb.append('0');
            }
        }
        System.out.println(sb.toString());
    }
}
