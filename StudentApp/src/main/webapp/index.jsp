<head><title>Student Phone Registration</title></head> 
<html>
<body>
<h2>Student Phone Registration</h2>
<!-- This will become a logged in at time message -->
<p>
  Site entered at: <%= (new java.util.Date()).toString()%>
</p>
 <form>
First name:<br>
<input type="text" name="firstname" value="">
<br>
Surname name:<br>
<input type="text" name="lastname" value="">
<br>
Student number:<br>
<input type="text" name="lastname" value="">
<br>
Phone number:<br>
<input type="text" name="lastname" value="">
<br><br>
<input type="submit" value="Submit">
</form> 
</body>
</html>