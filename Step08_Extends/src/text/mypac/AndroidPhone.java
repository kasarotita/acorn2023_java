package text.mypac;

public class AndroidPhone extends HandPhone{
	//생성자
	public AndroidPhone() {
		System.out.println("AndroidPhone 생성자 호출됨");
	}
	//메소드
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	// 아래의 @Override 는 해당 메소드가 재정의 되었다고 단순히 표시하는 용도이며 특별한 기능을 가지지는 않는다.
	@Override // 오버라이드는 덮어쓰기라 생각하면 이해가 쉽다. 덮어쓰니 30만 화소는 묻히고 1000만 화소로 실행된다.
	public void takePicture() {
		System.out.println("1000 만 화소의 사진을 찍어요!");
	}
}
