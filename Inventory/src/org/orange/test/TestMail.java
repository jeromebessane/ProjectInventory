package org.orange.test;

import org.orange.metier.SendMail;

public class TestMail {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		SendMail mail = new SendMail();
		mail.send_email("support.sas@orange.com", "S.A.S", "dylan06560@gmail.com", "Mail de test", "Hello World !!");
	}

}
