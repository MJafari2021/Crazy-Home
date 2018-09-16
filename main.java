package hw7_java;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of the yard");
		Yard yard=new Yard();
		int lengthYard=input.nextInt();
		yard.setLength(lengthYard);
		char[][] yardMain=new char[lengthYard][lengthYard];
		for(int i=0; i<lengthYard ;i++){
				System.out.println("Enter the "+ (i+1) +" row status  ");
				String row=input.next();
				for(int j=0; j<lengthYard ;j++){
					yardMain[i][j]=row.charAt(j);
				}
			
		}
		yard.setYard(yardMain);
		ArrayList<Child> list = new ArrayList<Child>();
		System.out.println("Enter the time to the minute: ");
		int time=input.nextInt();
		System.out.println("Enter time steps");
		int dt=input.nextInt();
		System.out.println("id(int)");
		int id=input.nextInt();
		while(id!=-1){
			System.out.println("type(Coward-Peaceful-Angry)");
			String type=input.next();
			if(type.equals("Coward")==true){
				CowardChild cCh=new CowardChild();
				cCh.setId(id);
				cCh.setType(type);
				System.out.println("fragile(boolean)");
				cCh.setFragile(input.nextBoolean());
				System.out.println("posx(double)");
				cCh.setPosx(input.nextDouble());
				System.out.println("posy(double)");
				cCh.setPosy(input.nextDouble());
				System.out.println("vx(double)");
				cCh.setVx(input.nextDouble());
				System.out.println("vy(double)");
				cCh.setVy(input.nextDouble());
				System.out.println("radius(int)");
				cCh.setRadius(input.nextInt());
				System.out.println("anger(int)");
				cCh.setAnger(input.nextInt());//خشم
				System.out.println("charisma(int)");
				cCh.setCharisma(input.nextInt());//کاریزما
				System.out.println("courage(int)");
				cCh.setCourage(input.nextInt());//شجاعت
				list.add(cCh);
			}
			if(type.equals("Peaceful")==true){
				PeacefulChild pCh=new PeacefulChild();
				pCh.setId(id);
				pCh.setType(type);
				System.out.println("fragile(boolean)");
				pCh.setFragile(input.nextBoolean());
				System.out.println("posx(double)");
				pCh.setPosx(input.nextDouble());
				System.out.println("posy(double)");
				pCh.setPosy(input.nextDouble());
				System.out.println("vx(double)");
				pCh.setVx(input.nextDouble());
				System.out.println("vy(double)");
				pCh.setVy(input.nextDouble());
				System.out.println("radius(int)");
				pCh.setRadius(input.nextInt());
				System.out.println("anger(int)");
				pCh.setAnger(input.nextInt());//خشم
				System.out.println("charisma(int)");
				pCh.setCharisma(input.nextInt());//کاریزما
				System.out.println("courage(int)");
				pCh.setCourage(input.nextInt());//کاریزما
				list.add(pCh);
			}
			if(type.equals("Angry")==true){
				AngryChild aCh=new AngryChild();
				aCh.setId(id);
				aCh.setType(type);
				System.out.println("fragile(boolean)");
				aCh.setFragile(input.nextBoolean());
				System.out.println("posx(double)");
				aCh.setPosx(input.nextDouble());
				System.out.println("posy(double)");
				aCh.setPosy(input.nextDouble());
				System.out.println("vx(double)");
				aCh.setVx(input.nextDouble());
				System.out.println("vy(double)");
				aCh.setVy(input.nextDouble());
				System.out.println("radius(int)");
				aCh.setRadius(input.nextInt());
				System.out.println("anger(int)");
				aCh.setAnger(input.nextInt());//خشم
				System.out.println("charisma(int)");
				aCh.setCharisma(input.nextInt());//کاریزما
				System.out.println("courage(int)");
				aCh.setCourage(input.nextInt());//کاریزما
				list.add(aCh);
			}
			System.out.println("If you want to add a child, enter the Id, else enter -1");
			id=input.nextInt();
///commmkdmls,lijuhygtfdbhnjsmkl,.;
		}

	}
}

