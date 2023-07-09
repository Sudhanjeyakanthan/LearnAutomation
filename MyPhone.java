package week3.day1;

public class MyPhone extends IOS {

	public static void main(String[] args) {

		IPhone iph = new IPhone();
		iph.startApp();
		iph.IncreseVolume();
		iph.shutDown();
		iph.makeCall();
		iph.sendSms();

		IPad ip = new IPad();

		ip.startApp();
		ip.IncreseVolume();
		ip.shutDown();
		ip.watchMovies();
	}
}
