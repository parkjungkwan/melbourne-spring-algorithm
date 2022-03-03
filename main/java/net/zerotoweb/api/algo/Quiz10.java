package net.zerotoweb.api.algo;
import java.util.Scanner;
/**
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-03-03   parkjungkwan  최초 생성
 */
public class Quiz10 {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("10버블 11삽입 12선택 13퀵 14병합 15매직 16지그재그 17직각별 18정삼각별 19");
            switch (scanner.next()){
                case "10": quiz10(); break;
                case "11": quiz11(); break;
                case "12": quiz12(); break;
                case "13": quiz13(); break;
                case "14": quiz14(); break;
                case "15": quiz15(); break;
                case "16": quiz16(); break;
                case "17": quiz17(); break;
                case "18": quiz18(); break;
                case "19": quiz19(); break;
            }
        }
    } // main
}

