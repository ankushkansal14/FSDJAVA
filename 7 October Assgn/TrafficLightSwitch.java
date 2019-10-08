import java.util.*;


class TrafficLightSwitch{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.print("Enter The Signal : ");
		String str=sc.nextLine();

		switch(str)
		{
			case "Red":
			System.out.println("Stop");
			break;

			case "Yellow":
			System.out.println("Ready");
			break;

			case "Green":
			System.out.println("Go");
			break;

			default:
			System.out.println("Please give Input as Red,Yellow,Green only");
		}
		
	}
}