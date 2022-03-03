package net.zerotoweb.api.algo;

import java.util.Scanner;

/**
 * packageName: net.zerotoweb.api.algo
 * fileName   : Quiz20
 * author     : parkjungkwan
 * date       : 2022-03-03
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-03-03   parkjungkwan  최초 생성
 */
public class Quiz20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("20팀");
            switch (scanner.next()){
                case "20": quiz20team(); break;

            }
        }
    } // main

    static void quiz20team(){
        String[] arr = {"권혜민","조현국","김진영","김한슬","서성민",
                "정렬","해시","힙","완전탐색","DP",
                "스택","깊이우선탐색","그래프","탐욕법","이중탐색",
                "큐","너비우선탐색"};
        System.out.println("00-1.팀별 과제");
        String s = "";
        for(int i=0; i< arr.length; i++ ){
            if(i%5==1){s += "\n";}
            s += i + ":" +arr[i] + "\t";
        }
        System.out.println(s);
        System.out.println("00-2.팀장이 맡은 과제");
        s = "";
        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요. 예) 김진영, 힙, 그래프 ");
        for(int i = 0; i< arr.length; i++ ) {
            if (arr[i].equals("김진영")) {
                for(int j=0; j < 3; j++){
                    s += arr[i + j * 5]+ ","
                    ;
                }
                if(i==17){break;}
            }
        }
        System.out.println(s);
        System.out.println("00-3.큐를 담당한 사람");
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 권혜민 ");
        /**
         * Q3. 입력한 과목의 인덱스를 추출하세요
         * 5, 10, 15 -> 0
         * 6, 11, 16 -> 1
         * 7, 12, 17 -> 2
         */
        s = "";
        for(int i = 0; i< arr.length; i++ ) {
            if(arr[i].equals("힙")){
                // System.out.println("큐의 인덱스 : "+i);
                s = arr[i] + "의 담당자는 "+ arr[i%5];
            }

        }
        System.out.println(s);
        System.out.println("00-4.팀원별 과제 수");
        System.out.println("Q4. 팀원별 과제 수를 출력하세요 "
                +"예) 권혜민(3개), 조현국(3개), 김진영(2개), 김한슬(2개), 서성민(2개) ");


        /**
         *  String[] arr = {"권혜민",   "조현국",     "김진영",  "김한슬",  "서성민",
         *                 "정렬",     "해시",        "힙",   "완전탐색", "DP",
         *                 "스택",  "깊이우선탐색 ",  "그래프", "탐욕법", "이중탐색",
         *                 "큐",    "너비우선탐색"                        };
         *   4 * 5
         * */

        s = "";
        int[] intArr = new int[5];
        int[] resArr = new int[5];
        for(int i = 5; i< arr.length; i++){
            int a = i % 5;
            for(int j = 0; j<5; j++){
                if(a == j){
                    intArr[j]++;
                }
                resArr = intArr;
            }
        }
        for(int i = 0; i< 5; i++){
            System.out.println(arr[i]+"("+resArr[i]+"), ");
        }
    }
    static void quiz10(){

    }
    static void quiz11(){
        System.out.println("01주사위");
    }
    static void quiz12(){
        System.out.println("02가위바위보");
    }
    static void quiz13(){

    }
    static void quiz14(){

    }
    static void quiz15(){

    }
    static void quiz16(){

    }
    static void quiz17(){

    }
    static void quiz18(){

    }
    static void quiz19(){

    }
}
