package hjc.sparseArray;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
     稀疏数组
 */

public class SparseArray {
    public static void main(String[] args) throws Exception {
        int[][] arr = new int[14][14];
        arr[2][6] = 6;
        arr[3][2] = 5;
        arr[4][2] = 2;

        //确定稀疏数组的行数
        int num = 0;
        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr[i].length; j ++) {
                if (arr[i][j] != 0) num ++;
            }
        }

        //创建稀疏数组
        int[][] sparseArray = new int[num + 1][3];
        sparseArray[0][0] = arr.length;
        sparseArray[0][1] = arr[0].length;
        sparseArray[0][2] = num;

        //遍历数组添加到稀疏数组中
        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr[i].length; j ++) {
                if (arr[i][j] != 0) {
                    sparseArray[num][0] = i;
                    sparseArray[num][1] = j;
                    sparseArray[num--][2] = arr[i][j];
                }
            }
        }

        //存入硬盘
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:\\1.txt"));
        List<int[][]> list = new ArrayList<>();
        list.add(sparseArray);
        oos.writeObject(list);

        //从硬盘读取
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("G:\\1.txt"));
        List<int[][]> list1 = (List<int[][]>) ois.readObject();


        int[][] newNum = list1.get(0);

        int[][] newArr = new int[newNum[0][0]][newNum[0][1]];

        for (int i = 1; i < newNum.length; i ++) {
            newArr[newNum[i][0]][newNum[i][1]] = newNum[i][2];
        }

        System.out.println();

    }
}
