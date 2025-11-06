public class MATRIX {
    public static void main(String[] args) {
        int arr1[][]={{2,4,3},{2,6,8}};
        int arr2[][]={{5,7,3},{8,9,4}};
        int sum[][]= new int[2][3];
        for(int i=0;i<2;i++){
            for (int j = 0; j < 3; j++) {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("sum of matrices");
        for(int i=0;i<2;i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j]);
            }
            System.out.println();
        }

    }
}
