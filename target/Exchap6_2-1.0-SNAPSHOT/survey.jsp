<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="main.css" type="text/css"/>
</head>
<body>
    <h1>Thanks for taking our survey!</h1>
    <p>Here is the information that you entered:</p>
    
    <label class="survey">Email:</label>
    <span>${user.email}</span><br>
    <label class="survey">First Name:</label>
    <span>${user.firstName}</span><br>
    <label class="survey">Last Name:</label>
    <span>${user.lastName}</span><br>
    <label class="survey">Heard From:</label>
    <span>${user.heardFrom}</span><br>
    <label class="survey">Updates:</label>
    <span>${user.updates}</span><br>
    <label class="survey">Contact Via:</label>
    <span>${user.contactVia}</span><br>

    <form action="" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>
</body>
</html>
