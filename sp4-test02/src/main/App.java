package main;

import java.util.Scanner;

import main.DTO.RegisterRequest;
import main.service.MemberListPrinter;
import main.service.MemberRegisterService;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("��ɾ �Է����ּ���");
			String command = sc.nextLine();
			if (command.startsWith("new ")) {
				// ������ü[Ŭ���� �ȿ� �ִ� ��ü]{dependency object}
				String[] arg = command.split(" ");
				if (arg.length != 5) {
					printHelp();
					System.out.println();
					continue;
				}
				RegisterRequest req = new RegisterRequest();
				req.setEmail(arg[1]);
				req.setName(arg[2]);
				req.setPassword(arg[3]);
				req.setConfirmPassword(arg[4]);
				boolean bl = req.isPasswordEqualConfirmPassword();
				
				if (!bl) {
					System.out.println("��й�ȣ�� ��ġ�����ʽ��ϴ�");
					continue;
				}
				// dependency object
				MemberRegisterService mrs = new MemberRegisterService();
				mrs.regist(req);
			} else if (command.startsWith("change ")) {

			} else if (command.equals("list")) {
				// dependency object
				MemberListPrinter listPrint = new MemberListPrinter();
				listPrint.printAll();
				

			} else if (command.startsWith("info ")) {

			} else if (command.equals("exit")) {

				System.exit(0);
			}
		}
	}

	public static void printHelp() {
		System.out.println();
		System.out.println("��ɾ� ����:");
		System.out.println("new �̸��� �̸� ��ȣ ��ȣȮ��");
		System.out.println("change �̸��� ������ ������");
		System.out.println("list");
		System.out.println("info �̸���");
		System.out.println("���α׷� ����� exit");
	}

}
