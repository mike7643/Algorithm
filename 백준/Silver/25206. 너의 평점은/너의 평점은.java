import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String name;//전공이름
        double hak;//학점
        String grade;//등급
        double total=0;//학점 총합
        double junkong=0;//전공과목별 합

        for(int i=0;i<20;i++){
            st =new StringTokenizer(br.readLine());

            name=st.nextToken();
            hak=Double.parseDouble(st.nextToken());
            grade=st.nextToken();

            double sco=0;

            if (grade.equals("P")) {
                continue; // P 과목은 계산에서 제외
            }

            if(grade.length()==2) {
                switch (grade.charAt(0)) {
                    case 'A':
                        sco = 4.0;
                        break;
                    case 'B':
                        sco = 3.0;
                        break;
                    case 'C':
                        sco = 2.0;
                        break;
                    case 'D':
                        sco = 1.0;
                        break;
                }
                if(grade.charAt(1)=='+')
                    sco+=0.5;

            }else sco+=0.0;

            total+=hak;
            junkong += sco*hak;
        }
        System.out.printf("%.6f\n", junkong/total);
    }
}