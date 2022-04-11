<html>  
<head>  
</head>  
<body style = "text-align: center; font-size: 20px;">  
<h1> Find the Factors Biriyani </h1>  
Enter a number: <input id = "num">  
<br><br>  
<button onclick = "fact()"> Factorial </button>  
<p id = "res"></p>  
<script>  
function fact(){  
var i, num, f;  
f = 1;  
num = document.getElementById("num").value;  

if(num > 0){
for(i = 1; i <= num; i++)    
{  
f = f * i;  
}  
}

document.getElementById("res").innerHTML = "The factorial of the number " + num  + " is: " + f ;  
}  
</script>  
</body>  
</html> 
