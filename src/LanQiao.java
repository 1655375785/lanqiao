import java.util.Scanner;
public class LanQiao {
	public static void main(String[]args){
		int number=-1;//用户选择的数
		Scanner input=new Scanner(System.in);//从控制台获取输入对象
		System.out.println("-----------------------------------");
		System.out.println("                     蓝桥计划java工程师管理系统                                                    ");
		System.out.println("-----------------------------------");
		System.out.println("1、请输入java工程师资料：");
		System.out.println("2、删除指定java工程师资料");
		System.out.println("3、查询java工程师资料");
		System.out.println("4、修改java工程师资料");
		System.out.println("5、计算java工程师月薪");
		System.out.println("6、保存新添加的工程师资料");
		System.out.println("7、对java工程师信息排序（1编号升序，2姓名升序)");
		System.out.println("8、输出所有java工程师信息");
		System.out.println("9、清空所有java工程师数据");
		System.out.println("打印java工程师数据报表");
		System.out.println("从文件重新导入java工程师数据");
		System.out.println("0、结束");
		System.out.println("请输入您的选择：");
	    number=input.nextInt();
		switch(number){
		case 1:
			System.out.println("该模块功能未实现！");
			break;
		case 2:
			System.out.println("该模块功能未实现！");
			break;
		case 3:
			System.out.println("该模块功能未实现！");
			break;
		case 4:
			System.out.println("该模块功能未实现！");
			break;
		case 5:
			System.out.println("请输入java工程师的底薪：");
			int basSalary=input.nextInt();//从控制台获取输入的工程师底薪，赋值给basSalary
			System.out.println("请输入java工程师月工作完成分数（最小值为0；最大值为150）：");
			int comResult=input.nextInt();//从控制台获取输入的月工作完成分数，赋值给comResult
			System.out.println("请输入java工程师实际工作天数：");
			double workDay=input.nextDouble();//从控制台获取输入的月实际工作天数，赋值给workDay
			System.out.println("请输入java工程师月应扣保险数：");
			int insourance=input.nextInt();//从控制台获取输入的月应扣保险数，赋值给insourance
			double engSalary=basSalary+basSalary*0.25*comResult/100+15*workDay-insourance;//计算月薪
			System.out.println("java工程师月薪为："+engSalary);
			break;
		case 6:
			System.out.println("该模块功能未实现！");
			break;
		case 7:
			System.out.println("该模块功能未实现！");
			break;
		case 8:
			System.out.println("该模块功能未实现！");
			break;
		case 9:
			System.out.println("该模块功能未实现！");
			break;
		case 10:
			System.out.println("该模块功能未实现！");
			break;
		case 11:
			System.out.println("该模块功能未实现！");
			break;
		case 0:
			System.out.println("程序结束！");
			break;
			
		
		}
		
		
	}

}
