function gogogo(){
	alert("六六六");
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
	var d = { name:"繹熱", age:3};
	alert(d);
	alert(d.name);
	alert(d.age);
}

function aoTest(){
	var dogs = [
		{name:"繹熱", age:1},
		{name:"團熱", age:2},
		{name:"艙熱", age:4}
	]
	for (var i = 0; i < dogs.length; i++) {
		alert("檜葷 : " + dogs[i].name +", 釭檜 : "+ dogs[i].age);
	}
}