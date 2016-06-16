package sample_0519;

public class Class_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P_object[] pob = new P_object[3];
		pob[0] = new P_object();
		pob[1] = new C1_object();
		pob[2] = new C2_object();
		
		//P_object po1 = new P_object();
		//P_object co1 = new C1_object();
		//P_object co2 = new C2_object();
		
		
		pr_all(pob[0]);
		pr_all(pob[1]);
		pr_all(pob[2]);
		
		pob[0].pr();
		pob[1].pr();
		pob[2].pr();
		
		/*for(P_object temp : pob){
			//temp = new P_object();
			//temp.pr();
			pr_all(temp);
			change_all(temp, 7, 77);
			pr_all(temp);
		}*/
	}

	public static void pr_all(P_object temp){
		temp.pr();
	}
	
	public static void change_all(P_object temp, int x, int y){
		temp.change(x, y);
	}
}

/* Object 메소드

Object clone()                객체 자신의 복사본을 생성하여 반환
boolean equals(Object obj)    obj가 현재 객체와 같은지를 반환
void finalize()               사용되지 않는 객체가 제거되기 직전에 호출
class getclass()              실행 시간에 객체의 클래스 정보를 반환
int hashCode()                객체에 대한 해쉬 코드 반환
String toString()             객체 기술하는 문자열 반환     */