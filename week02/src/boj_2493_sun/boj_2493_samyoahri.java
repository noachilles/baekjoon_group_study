package boj_2493_sun;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_2493_samyoahri {
    //성능 좋은 코드
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> indexStack = new Stack<>();

        int n = Integer.parseInt(in.readLine());
        ArrayList<Integer> arr = new ArrayList<>(n);
//        String[] strArr = in.readLine().split(" ");
        StringTokenizer strArr = new StringTokenizer(in.readLine(), " ");

//        StringBuilder tmp = new StringBuilder(n);
//        ArrayList<Integer> tmp = new ArrayList<>(n);
        int[] tmp = new int[n];

        while(strArr.hasMoreTokens()){
            arr.add(Integer.parseInt(strArr.nextToken()));
        }
//        for(int i = 0; i < strArr.length; i++){
//            arr.add(Integer.parseInt(strArr[i]));
////            tmp.add(Integer.parseInt(strArr[i]));
//        }

        for(int i = arr.size()-1; i >= 0; i--){
            //pop
            while(!indexStack.isEmpty() && arr.get(i) >= arr.get(indexStack.peek())){
                int index = indexStack.pop();
                tmp[index] = i;
//                int value = arr.get(index);
//                tmp.insert(index, i);
//                tmp.add(index, i);

            }
            //push
            indexStack.push(i);


        }
        while(!indexStack.isEmpty()){
            int index = indexStack.pop();
//            tmp.insert(index, 0);
//            tmp.add(index, 0);
            tmp[index] = -1;
        }
        StringBuilder res = new StringBuilder();
        for (int a : tmp) {
            res.append((a+1));
            res.append(' ');
        }
        out.write(res.toString());
        out.flush();
        in.close();
        out.close();
    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        Stack<Integer> indexStack = new Stack<>();
//
//        int n = Integer.parseInt(in.readLine());
//        ArrayList<Integer> arr = new ArrayList<>(n);
//        String[] strArr = in.readLine().split(" ");
//
////        StringBuilder tmp = new StringBuilder(n);
////        ArrayList<Integer> tmp = new ArrayList<>(n);
//        int[] tmp = new int[n];
//
//
//        for(int i = 0; i < strArr.length; i++){
//            arr.add(Integer.parseInt(strArr[i]));
////            tmp.add(Integer.parseInt(strArr[i]));
//        }
//
//        for(int i = arr.size()-1; i >= 0; i--){
//            //pop
//            while(!indexStack.isEmpty() && arr.get(i) >= arr.get(indexStack.peek())){
//                int index = indexStack.pop();
//                tmp[index] = i;
////                int value = arr.get(index);
////                tmp.insert(index, i);
////                tmp.add(index, i);
//
//            }
//            //push
//            indexStack.push(i);
//
//
//        }
//        while(!indexStack.isEmpty()){
//            int index = indexStack.pop();
////            tmp.insert(index, 0);
////            tmp.add(index, 0);
//            tmp[index] = -1;
//        }
////        System.out.println(tmp);
//        for (int a : tmp) {
//            System.out.print((a+1) + " ");
////            char c = (char) (a + 1);
////            out.write(c);
//        }
//    }
}
