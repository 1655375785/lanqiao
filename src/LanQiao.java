import java.util.Scanner;
public class LanQiao {
	public static void main(String[]args){
		int number=-1;//�û�ѡ�����
		Scanner input=new Scanner(System.in);//�ӿ���̨��ȡ�������
		System.out.println("-----------------------------------");
		System.out.println("                     ���żƻ�java����ʦ����ϵͳ                                                    ");
		System.out.println("-----------------------------------");
		System.out.println("1��������java����ʦ���ϣ�");
		System.out.println("2��ɾ��ָ��java����ʦ����");
		System.out.println("3����ѯjava����ʦ����");
		System.out.println("4���޸�java����ʦ����");
		System.out.println("5������java����ʦ��н");
		System.out.println("6����������ӵĹ���ʦ����");
		System.out.println("7����java����ʦ��Ϣ����1�������2��������)");
		System.out.println("8���������java����ʦ��Ϣ");
		System.out.println("9���������java����ʦ����");
		System.out.println("��ӡjava����ʦ���ݱ���");
		System.out.println("���ļ����µ���java����ʦ����");
		System.out.println("0������");
		System.out.println("����������ѡ��");
	    number=input.nextInt();
		switch(number){
		case 1:
			System.out.println("��ģ�鹦��δʵ�֣�");
			break;
		case 2:
			System.out.println("��ģ�鹦��δʵ�֣�");
			break;
		case 3:
			System.out.println("��ģ�鹦��δʵ�֣�");
			break;
		case 4:
			System.out.println("��ģ�鹦��δʵ�֣�");
			break;
		case 5:
			System.out.println("������java����ʦ�ĵ�н��");
			int basSalary=input.nextInt();//�ӿ���̨��ȡ����Ĺ���ʦ��н����ֵ��basSalary
			System.out.println("������java����ʦ�¹�����ɷ�������СֵΪ0�����ֵΪ150����");
			int comResult=input.nextInt();//�ӿ���̨��ȡ������¹�����ɷ�������ֵ��comResult
			System.out.println("������java����ʦʵ�ʹ���������");
			double workDay=input.nextDouble();//�ӿ���̨��ȡ�������ʵ�ʹ�����������ֵ��workDay
			System.out.println("������java����ʦ��Ӧ�۱�������");
			int insourance=input.nextInt();//�ӿ���̨��ȡ�������Ӧ�۱���������ֵ��insourance
			double engSalary=basSalary+basSalary*0.25*comResult/100+15*workDay-insourance;//������н
			System.out.println("java����ʦ��нΪ��"+engSalary);
			break;
		case 6:
			System.out.println("��ģ�鹦��δʵ�֣�");
			break;
		case 7:
			System.out.println("��ģ�鹦��δʵ�֣�");
			break;
		case 8:
			System.out.println("��ģ�鹦��δʵ�֣�");
			break;
		case 9:
			System.out.println("��ģ�鹦��δʵ�֣�");
			break;
		case 10:
			System.out.println("��ģ�鹦��δʵ�֣�");
			break;
		case 11:
			System.out.println("��ģ�鹦��δʵ�֣�");
			break;
		case 0:
			System.out.println("���������");
			break;
			
		
		}
		
		
	}

}
