function joinCheck(){
	var photo = document.joinF.photo;
	var id = document.joinF.id;
	var pw = document.joinF.pw;
	var pw2 = document.joinF.pw2;
	var name = document.joinF.name;
	var email = document.joinF.email;
	var addr1 = document.joinF.addr1;
	var addr2 = document.joinF.addr2;
	var addr3 = document.joinF.addr3;
	
	if(reqCk(photo) || fileType(photo, img) || fileType(photo, png) || fileType(photo, jpg)){
		alert("������ ������ Ȯ�����ּ���.");
		photo.value = "";
		photo.focus();
		
		return false;
	}
	
	if(reqCk(id) || korCk(id)){
		alert("���̵� ��Ȯ�� �Է� ���ּ���.");
		id.value = "";
		id.focus();
		
		return false;
	}
	
	var pattern = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890!@#$%^";
	if(reqCk(pw) || pwPattern(pw, pattern)){
		alert("��й�ȣ�� ��Ȯ�� �Է� ���ּ���.");
		pw.value = "";
		pw2.value = "";
		pw.focus();
		
		return false;
	}
	
	if(pwCrossCk(pw, pw2)){
		alert("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		pw.value = "";
		pw2.value = "";
		pw.focus();
		
		return false;
	}
	
	if(reqCk(name)){
		alert("�̸��� ��Ȯ�� �Է����ּ���");
		name.value="";
		name.focus();
		
		return false;	
	}
	
	if(reqCk(email) || korCk(email)) {
		alert("�̸����� ��Ȯ�� �Է����ּ���.");
		email.value="";
		email.focus();
		
		return false;
	}
	
	if(reqCk(addr1) || reqCk(addr2) || reqCk(addr3)){
		alert("�ּҸ� ��Ȯ�� �Է����ּ���.");
		addr1.value="";
		addr2.value="";
		addr3.value="";
		addr1.focus="";
		
		return false;
	}
	return true;
}