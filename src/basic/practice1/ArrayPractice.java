package basic.practice1;


public class ArrayPractice {
    public static void main(String[] args) {
//        int a[]= {34, 67, 45, 66, 34, 90, 55, 12, 88};
//        System.out.println(a.length);
//        System.out.println(a[1]);
//
////        for(int i=0; i<a.length; i++){//i stands for index value
////            System.out.println(a[i]);
////        }
//         for(int e:a){ //for each loop : no condition /increment , will simply print all values of the array
//             System.out.println(e);
//         }

        //Multidimensional Array-example 4 row and 3 column

        int b[][]= {{45, 76, 44}, {55, 86, 34}, {88, 32, 44}, {55, 33, 11}};
//        System.out.println(b.length);
//        System.out.println(b[0].length);
//        System.out.println(b[2][0]);
////
//      for(int i=0; i<b.length;i++){
//          for(int j=0;j<b[i].length;j++){
//              System.out.println(b[i][j]);
//          }
//        }
      for(int i[]:b){
          for(int j:i){
              System.out.println(j);
          }
      }
    }
}
