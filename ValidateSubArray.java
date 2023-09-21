class ValidateSubArray{
    public static void main(String[] args) {
        
        int [] arr_1 = {5,1,22,25,6,-1,8,10};
        int [] arr_2 = {22,25,6};
        int j = 0;
        int count = 0;

        for (int i = 0; i < arr_1.length; i++){
            if (j < arr_2.length && arr_1[i] == arr_2[j]){
                j += 1;
                count += 1;
            }
        }
        
        if (count == arr_2.length){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}