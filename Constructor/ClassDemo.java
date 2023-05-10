package basics;

public class ClassDemo {
	int l;
	int b;
	int h;
	
	ClassDemo(int len, int bred, int height){
		l = len;
		b = bred;
		h = height;
	}
	
	int volume(){
		return l*b*h;
	}
}
