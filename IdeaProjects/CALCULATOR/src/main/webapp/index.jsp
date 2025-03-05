<html>
<body style="background-color:black;color:white;">
    <h2 style='color:white;text-align:center;'>Calculator App 2</h2>
    <div style='display:flex;justify-content:center;align-items:center;height:80vh;'>
    <form action="/CALCULATOR/calculate" method="GET">


        <table>
            <tr>
                <td>Enter number 1</td>
                <td> <input type="number " name="number1" /> </td>
            </tr>
            <tr>
                <td>Enter number 2</td>
                <td> <input type="number" name="number2" /> </td>
            </tr>
            <tr>
                <td>Enter the operation</td>
                <td> <input type="text" name="operation" /> </td>
            </tr>
            <tr>
                <td> <input type="submit" value="calculate" style="background-color:red; margin-left:50px;" />
                </td>
            </tr>
        </table>
    </form>
</div>
</body>

</html>