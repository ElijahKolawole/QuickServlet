<html>
<head>
    <title>Quick Servlet Demo</title>
</head>
<body>
    <a href="quickservlet">Click here to send GET request</a>
     
    <br/><br/>
     
    <form action="quickservlet" method="post">
        Width: <input type="text" size="5" name="width"/>
        &nbsp;&nbsp;
        Height <input type="text" size="5" name="height"/>
        &nbsp;&nbsp;
        <input type="submit" value="Find Area" name="calculate" /><br>
    </form>
       <form action="quickservlet" method="post">
        Value 1: <input type="text" size="5" name="width"/>
        &nbsp;&nbsp;
        Value 2: <input type="text" size="5" name="height"/>
        &nbsp;&nbsp;
        <input type="submit" value="Add" name="add" /><br>
    </form>
       <form action="quickservlet" method="post">
        Value 1: <input type="text" size="5" name="width"/>
        &nbsp;&nbsp;
        Value 2: <input type="text" size="5" name="height"/>
        &nbsp;&nbsp;
        <input type="submit" value="Subtract" name="subtract" /><br>
    </form>
       <form action="quickservlet" method="post">
        Value 1: <input type="text" size="5" name="width"/>
        &nbsp;&nbsp;
        Value 2: <input type="text" size="5" name="height"/>
        &nbsp;&nbsp;
        <input type="submit" value="Divide" name="divide" /><br>
    </form>
</body>
</html>