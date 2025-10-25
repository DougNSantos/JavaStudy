public class CommonArray {

    public static void main(String[] args) {
        
        String[] myList = new String[2];

        String a = "Wohoo";
        String b = "Frog";

        myList[0] = a;
        myList[1] = b;

        int theSize = myList.length;

        String str = myList[1];

        myList[0] = "";

        boolean isIn = false;
        for (String word : myList){
            if (word == b){
                isIn = true;
            }
            else{
                isIn = false;
            }
        }
        System.out.println(isIn);


    }
    
}
