var employee = [];
function feedEntry(){
	var name = document.getElementById("name").value;
	var age = document.getElementById("age").value;
	var salary = document.getElementById("salary").value;
	var dob = document.getElementById("dob").value;

	if(name != "" && age != "" && salary != "" && dob != ""){
		var Emp = new Object();
		Emp.name = name;
		if(age > 18 && age < 70){
		Emp.age = age;			
		Emp.salary = salary;

		var today = new Date();
		var dd = today.getDate();
		var mm = today.getMonth()+1; //January is 0!
		var yyyy = today.getFullYear();
			if(dd<10) {
			    dd = '0'+dd
			} 
			if(mm<10) {
			    mm = '0'+mm
			} 
		today = yyyy + '-' + mm + '-' + dd;
			var datelimit = new Date("1960-01-01");
			var datetoday = new Date(today);
			var mydate = new Date(dob);
			if(mydate > datelimit && mydate <= datetoday){
				Emp.dob = dob;

				employee.push(Emp);

				var table = document.getElementById("myTable");
				var tableLength = (table.rows.length);

				var row = table.insertRow(tableLength);
				
				var nameCol = row.insertCell(0);
				var ageCol = row.insertCell(1);
				var salaryCol = row.insertCell(2);
				var dobCol = row.insertCell(3);
				
				nameCol.innerHTML = Emp.name;
				ageCol.innerHTML = Emp.age;
				salaryCol.innerHTML = Emp.salary;
				dobCol.innerHTML = Emp.dob;
			}
			else{
				alert("Date should between 01-01-1960 & Current Date");
			}
		}
		else{
		alert("Age should be between 18 & 70 years");			
		}
	}
}
function salGreaterThan5000(){
	var i,k;
	var table = document.getElementById("myTable");
	for(i = table.rows.length -1 ; i > 0 ; i--){
		table.deleteRow(i);
	}
	for(k=0; k<employee.length; k++){
		if(employee[k]['salary'] > 5000){
				var tableLength = (table.rows.length);

				var row = table.insertRow(tableLength);
				
				var nameCol = row.insertCell(0);
				var ageCol = row.insertCell(1);
				var salaryCol = row.insertCell(2);
				var dobCol = row.insertCell(3);
				
				nameCol.innerHTML = employee[k]['name'];
				ageCol.innerHTML = employee[k]['age'];
				salaryCol.innerHTML = employee[k]['salary'];
				dobCol.innerHTML = employee[k]['dob'];
			}
	}
}
function showAll(){
var i,k;
	var table = document.getElementById("myTable");
	for(i = table.rows.length -1 ; i > 0 ; i--){
		table.deleteRow(i);
	}
	for(k=0; k<employee.length; k++){
				var tableLength = (table.rows.length);

				var row = table.insertRow(tableLength);
				
				var nameCol = row.insertCell(0);
				var ageCol = row.insertCell(1);
				var salaryCol = row.insertCell(2);
				var dobCol = row.insertCell(3);
				
				nameCol.innerHTML = employee[k]['name'];
				ageCol.innerHTML = employee[k]['age'];
				salaryCol.innerHTML = employee[k]['salary'];
				dobCol.innerHTML = employee[k]['dob'];
	}	
}
function groupOnAge(){
	var i = 0 , val, index, values = [], result = [];
	for (i = 0; i < employee.length; i++) {
		val = employee[i]['age'];
		index = values.indexOf(val);
		if(index > -1){
			result[index].push(employee[i]);
		}
		else{
			values.push(val);
			result.push([employee[i]]);
		}
	}
	console.log(result);
}
function fetch(){
var i,k;
	var table = document.getElementById("myTable");
	for(i = table.rows.length -1 ; i > 0 ; i--){
		table.deleteRow(i);
	}
	for(k=0; k<employee.length; k++){
		if(employee[k]['salary'] < 1000 && employee[k]['age'] >20){
				employee[k]['salary']*=5;
				var tableLength = (table.rows.length);

				var row = table.insertRow(tableLength);
				
				var nameCol = row.insertCell(0);
				var ageCol = row.insertCell(1);
				var salaryCol = row.insertCell(2);
				var dobCol = row.insertCell(3);
				
				nameCol.innerHTML = employee[k]['name'];
				ageCol.innerHTML = employee[k]['age'];
				salaryCol.innerHTML = employee[k]['salary'];
				dobCol.innerHTML = employee[k]['dob'];
			}
	}	
}