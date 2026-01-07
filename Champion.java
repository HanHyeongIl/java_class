import java.util.Scanner;

class Champion {      //사용할 변수 생성
    String name;
    int kills = 0;
    int deaths = 0;
    int assists = 0;

    public Champion() {}

    //str이어서 따로 클래스 생성
    public Champion(String name) {  
        this.name = name;  
    }

    int getKill() {
        return kills;
    }

    int getDeath() {
        return deaths;
    }

    int getAssist() {
        return assists;
    }

    String getName() {
        return name;
    }

    void setKill(int kill) {
        kills = kill;        
    }

    void setDeath(int death) {
        deaths = death;
    }

    void setAssist(int assist) {
        assists = assist;
    }

    void setName(String name) {
        this.name = name;
    }


    /*
     * 	- D가 0인경우는 어떻게 처리할껀가?
		1.1) K / A가 둘중 하나라도 0 초과인 경우
			 "완벽한"으로 return
		1.2) K / A 가 모두 0인 경우
			0.00으로 return
     */
    //kda의 값을 계산 후 반환 메소드
    public double calKDA() {
        double KDA = 0.0;
        if (deaths == 0 && kills == 0 && assists == 0) {
            return KDA;
        } else if (deaths == 0 && (kills > 0 || assists > 0)) {
            KDA = (double)(kills + assists);
            return KDA;
        } else {
            KDA = (double)(kills + assists) / deaths;
            return KDA;
        }
    }

    //메인 함수 3개의 캐리터의 값 입력받기
    public static void main(String[] args) {  
        Champion nafiri = new Champion("나피리");
        Champion darius = new Champion("다리우스");
        Champion ahri = new Champion("아리");
 /*
  * 
        Scanner sc = new Scanner(System.in);
        Champion[] champs = new Champion[3];

        champs[0].setName("나피리");
        champs[1].setName("다리우스");
        champs[2].setName("아리");
        /*
         *for (Champion champ: champs) {
            System.out.print("챔피언의 이름을 작성하세요: ");
            String name = sc.next();
            champ.setName(name);
        }
 
         *

        int[] rates = {3, 1, 2, 5, 2, 1, 1, 3, 6};
        i * a + b

        0 <= b < a
        for (int i=0; i < champs.length; i++) {
            champs[i].setKill(rates[3*i + 0]);
            champs[i].setDeath(rates[3*i + 1]);
            champs[i].setAssist(rates[3*i + 2]);
        }

*/

        nafiri.setKill(10);
        nafiri.setDeath(0);
        nafiri.setAssist(3);
        

        System.out.println(nafiri.calKDA());

    }        
}


