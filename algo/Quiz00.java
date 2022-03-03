package net.zerotoweb.api.algo;
import java.util.Random;
import java.util.Scanner;
/**
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-03-03   parkjungkwan  최초 생성
 */
public class Quiz00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("00팀별과제 01주사위 02가위바위보 03소수 04윤년 05숫자추론 06로또 07예약 08입출금 09구구단");
            switch (scanner.next()){
                case "00": quiz00team(); break;
                case "01": quiz01dice(); break;
                case "02": quiz02rps(); break;
                case "03": quiz03prime(); break;
                case "04": quiz04leap(); break;
                case "05": quiz05guess(); break;
                case "06": quiz06lotto(); break;
                case "07": quiz07booking(); break;
                case "08": quiz08bank(); break;
                case "09": quiz09gugudan(); break;
                default:return;
            }
        }
    } // main
    static void quiz00team(){
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
    static void quiz01dice(){
        System.out.println("01 주사위");
        // 홀수나올때까지 주사위굴려 합하는 프로그래밍
        // Random random = new Random();
        Random random = new Random();
        int result = 0;
        while(true) {
            int r = random.nextInt(5)+1;
            System.out.println(" dice value : "+ r);
            if(r % 2 != 0) {
                break;
            }
            result += r;
        }
        System.out.println(result);
        // 6면인 주사위를 5회 굴려서 나온 합계를 구하시오.
        // (int) (Math.random() * 최댓값) + 최솟값
        result = 0;
        for(int i=0; i<5; i++) {
            double d = Math.random();
            int temp = (int) (d * 6) +1;  // 랜덤으로 (1-6) 정수값
            System.out.println(temp);
            result += temp;
        }
        System.out.println("Sum : "+result);
        // 플레이어(Math 랜덤값)와 컴퓨터(Random 랜덤값) 주사위 굴리기를 해 이기면
        // "Win", 비기면 "Draw.", 지면 "Lose"를 출력하세요.
        int player=(int)(Math.random()*6)+1;
        System.out.println("플레이어 숫자"+player);
        int com= new Random().nextInt(5)+1;
        System.out.println("컴퓨터 숫자"+com);
        String s = "Draw";
        if(player!=com) s = (player>com) ? "Win" : "Lose";
        System.out.println(s);
    }
    static void quiz02rps(){
        System.out.println("02 가위바위보");
        System.out.println(" ----------- 1 -------------");
        int a = (int)(Math.random()*3)+1;
        int b = (int)(Math.random()*3)+1;
        System.out.println((a == b) ? "Draw" : (b > (a+1)%3) ? "Win":"lose");
        System.out.println(" ----------- 2 -------------");
        a = (int)(Math.random()*3)+1;
        b = (int)(Math.random()*3)+1;
        System.out.println(a);
        System.out.println(b);
        String s = "";
        if (a == b) s= "Draw";
		/*
		 2%3 2 3
		 3%3 0 1
		 1%3 1 2
		 * */
        else s = (b > (a+1)%3) ? "Win":"lose";
        System.out.println(s);
        System.out.println(" ----------- 3 -------------");
        String[] arr = {"가위", "바위", "보", "Draw", "Win", "Lose"};
        int[] arr2 = new int[2];
        for(int i =0 ; i<arr2.length; i++) arr2[i] = (int)(Math.random()*3)+1;
        int p = arr2[0], c = arr2[1];
        System.out.printf("Player : %s %d\n",arr[p-1], p);
        System.out.printf("Computer : %s %d\n",arr[c-1], c);
        int i = 3;
        switch(Math.abs(p - c)) {
            case 1: i = (p > c) ? 5 : 4;
            case 2: i = (p > c) ? 4 : 5;
            default: break;
        }
        System.out.printf("Player: %s", arr[i]);
    }
    static void quiz03prime(){
        System.out.println("03 소수");
    }
    static void quiz04leap(){
        System.out.println("04 윤년");
    }
    static void quiz05guess(){
        System.out.println("05 숫자맞추기");
    }
    static void quiz06lotto(){
        System.out.println("06 로또");
    }
    static void quiz07booking(){
        System.out.println("07 예약");
    }
    static void quiz08bank(){
        System.out.println("08 은행");
    }
    static void quiz09gugudan(){
        System.out.println("09 구구단");
        System.out.println(" --------- 1 --------------");
        for(int k = 2; k < 10; k+=4) {
            for (int i = 1; i < 10; i++) {
                for (int j = k; j < k+4; j++) {
                    System.out.print(j + "*" + i+ "=" +(j*i)+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(" --------- 2 --------------");
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 6; j++) {
                System.out.print(j + "*" + i+ "=" +(j*i)+"\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 2; i < 10; i++) {
            for (int j = 6; j < 10; j++) {
                System.out.print(j + "*" + i+ "=" +(j*i)+"\t");
            }
            System.out.println();
        }
        System.out.println(" --------- 3 --------------");
        /*
        for(i 1 10 1)
        for(j 2 6 1)
        j * i = j * i
        for(i 1 10 1)
        for(j 6 10 1)
        j * i = j * i
        에서 같은 구문이 반복되므로, 다시 for 를 사용한다.
        for(k 2, 10, 4)
        for(i 1, 10, 1)
        for(j k, k+4, 1)
        j * i = (j * i)
         * */
        for (int dan = 2; dan < 10; dan += 4) { //구구단은 2단부터 시작.
            for (int i = 1; i <= 9; i++) { // 1 ~ 9 까지 곱이 나오도록 조건잡기
                for (int j = dan; j < dan + 4; j++) {
                    System.out.print(j + "*" + i + "=" + (j * i) + "\t");
                }
                System.out.print("\n"); // 4개씩 출력 되어야 하므로 j*i 값 4개가 출력된 후 엔터
            }
            System.out.println("\n"); //4개의 단(2단~5단)이 모두 출력 된 후, 엔터
        }
    }


}

