package play_with_data_structure.Array.src;

public class Main {
    public static void main(String[] args) {
        // int[] arr = new int[10];
        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = i;
        //     System.out.println(i);
        // }

        // // 开辟长度为三个数的数组
        // int[] scores = new int[] {100, 90, 99};
        // for(int i = 0; i < scores.length; i++)
        //     System.out.println(scores[i]);

        // for(int score: scores){
        //     System.out.println(score);
        // }

        Array arr = new Array(20);
        for (int i = 0; i < 10; i++){
            arr.addLast(i);
        }
        System.out.println(arr);
    }
}