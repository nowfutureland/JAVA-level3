package _0716;

public class Main {

	public static void main(String[] args) {
		SmartPhone[] 폰가방 = {
				new Iphone(50, "블랙", "아이폰14","얼굴"),
				new SamSung(50, "화이트", "S24","카드")
		};
		
		for(SmartPhone s : 폰가방) {
			s.자기소개();
			s.전원켜기();
			s.set볼륨(100);
		}

		
	}

}
