//array
var empArr=[];

function feedentry(){
	var Name = document.getElementById("name").value;
	var Age = document.getElementById("age").value;
	var Salary = document.getElementById("salary").value;
	var Dob = document.getElementById("dob").value;
	
	var emp = new Object();
	emp.name=Name;
	emp.age=Age;
	emp.salary=Salary;
	emp.dob=Dob;

	//document.getElementById("show").innerHTML+= emp.name + " " + emp.age + " " + emp.salary + " " + emp.dob + "<br>";	
			empArr.push(emp);
			document.getElementById("s_tableBody").innerHTML +=`<tr>
				<td colspan="2">`+name+`</td>
				<td>`+age+`</td>
				<td>`+salary+`</td>
				<td>`+dob+`</td>
			</tr>`;
			document.getElementById("form").reset();
}

function showtables(){
	var k = 0;
			for(k=0;k<empArr.length;k++)
			{	
				document.getElementById("s_tableBody").innerHTML +=`<tr>
				<td colspan="2">`+empArr[k]['name']+`</td>
				<td>`+empArr[k]['age']+`</td>
				<td>`+empArr[k]['salary']+`</td>
				<td>`+empArr[k]['dob']+`</td>
			</tr>`;
		
			}
	}

function fless5()
		{	var k=0;
			document.getElementById("s_tableBody").innerHTML =`<tr>
				<td colspan="2"></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>`;

			for(k=0;k<empArr.length;k++)
			{
				if(empArr[k]['salary']>5000)
			{		document.getElementById("s_tableBody").innerHTML +=`<tr>
				<td colspan="2">`+empArr[k]['name']+`</td>
				<td>`+empArr[k]['age']+`</td>
				<td>`+empArr[k]['salary']+`</td>
				<td>`+empArr[k]['dob']+`</td>
			</tr>`;
		}
			}
		}


		function falll()
		{	var k=0;
			document.getElementById("s_tableBody").innerHTML =`<tr>
				<td colspan="2"></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>`;

			for(k=0;k<empArr.length;k++)
			{
				
				document.getElementById("s_tableBody").innerHTML +=`<tr>
				<td colspan="2">`+empArr[k]['name']+`</td>
				<td>`+empArr[k]['age']+`</td>
				<td>`+empArr[k]['salary']+`</td>
				<td>`+empArr[k]['dob']+`</td>
			</tr>`;
		
			}
		}
function finc()
	{	var k=0;
		document.getElementById("s_tableBody").innerHTML =`<tr>
			<td colspan="2"></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>`;
			for(k=0;k<empArr.length;k++)
		{		
			if(empArr[k]['salary']<1000 && empArr[k]['age']>20)
		{		document.getElementById("s_tableBody").innerHTML +=`<tr>
			<td colspan="2">`+empArr[k]['name']+`</td>
			<td>`+empArr[k]['age']+`</td>
			<td>`+empArr[k]['salary']+`</td>
			<td>`+empArr[k]['dob']+`</td>
		</tr>`;
			empArr[k]['salary']*=5;
		alert("Salary incremented..!! \n Click Fetch All to see changes")
	}
	
		}
	}
