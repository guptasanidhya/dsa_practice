import java.util.ArrayList;
import java.util.List;

class finding_key_25 {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        ArrayList<String> ls1=new ArrayList<>();
        ArrayList<String> ls2=new ArrayList<>();
        ArrayList<String> ls3=new ArrayList<>();
        ls1.add("phone");
        ls1.add("blue");
        ls1.add("pixel");
        ls2.add("computer");
        ls2.add("silver");
        ls2.add("lenovo");
        ls3.add("phone");
        ls3.add("gold");
        ls3.add("iphone");

        items.add(ls1);
        items.add(ls2);
        items.add(ls3);
        System.out.println(items);
        System.out.println(items.get(1).get(1));
        String ruleKey="type";
        String ruleValue="phone";
        int x = countMatches(items,ruleKey,ruleValue);
        System.out.println(x);
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int j=-1;
            if(ruleKey=="type"){
                j=0;
            }
            else if(ruleKey=="color"){
                j=1;
            }
            else{
                j=2;
            }

            int count=0;
            for(int i=0;i<items.size();i++){
                if(items.get(i).get(j)==ruleValue){
                    count++;
                }
            }
            return count;

        }
}