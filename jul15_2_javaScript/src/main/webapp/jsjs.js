function gogogo(){
	alert("������");
}
function arrayTest(){
	var ar = [1, 21, 45];
	alert(ar[0]);
	alert(ar.length);
	for (var i = 0; i < ar.length; i++) {
		alert(ar[i]);
	}
}

function objTest() {
	var d = { name:"ö��", age:3};
	alert(d);
	alert(d.name);
	alert(d.age);
}

function aoTest(){
	var dogs = [
		{name:"ö��", age:1},
		{name:"�μ�", age:2},
		{name:"����", age:4}
	]
	for (var i = 0; i < dogs.length; i++) {
		alert("�̸� : " + dogs[i].name +", ���� : "+ dogs[i].age);
	}
}