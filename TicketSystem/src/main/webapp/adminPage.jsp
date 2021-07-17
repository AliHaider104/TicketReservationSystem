<%@page import="java.util.ArrayList" %>
<% ArrayList user = (ArrayList)request.getAttribute("Users");%>

<html>
<style>
    .btn {
        text-align: center;
        margin-left: 148px;
        background-color: #ff1493;
        border-color: #ff1493;
        color: white;
        border-radius: 50%;
        width: 100px;
        height: 50px;
        opacity: 1;
    }

    .btn1 {
        margin-left: 92%;
        text-align: center;
        border-radius: 50%;
        width: 100px;
        height: 50px;
        opacity: 1;
        background-color: white;
        color: black;
        border-color: black;
        margin-top: 100px;
    }

    .btn1:hover {
        background-color: black;
        color: white;
    }

    .btn:hover {
        opacity: 0.8;
    }
</style>

<body>
<div
        style="
        height: 730px;
        width: 100%;
        border: 2px solid black;
        display: flex;
        flex-direction: column;
        background-color: #f0f0f0;
        background-image: url(https://i.pinimg.com/originals/00/a3/b4/00a3b40b86615300462c2f229db1a8e9.jpg);
      "
>
    <form
            action="View"
            style="
          background-color: black;
          margin-left: 35%;
          margin-top: 10%;
          height:fit-content;
          width: 400px;
          border: 2px solid #f0f0f0;

        "
    >
        <h2 style="color: white; margin-left: 100px">View Ticket Owners</h2>
        <div style="color: #f0f0f0; display: flex; flex-direction:column" >
        <% for(int i=0;i< user.size();i++){%>
            <div style="display: flex; flex-direction: row">
                <img style="width: 50px; height: 50px; border:1px solid black" src="https://tse3.mm.bing.net/th?id=OIP.xZ36f3apx8ML1xPq6c5ExwHaHa&amp;pid=Api&amp;P=0&amp;w=300&amp;h=300">
            <h style="font-size: 18px">

        <%= user.get(i)%>
            </h>
                <h style="font-size: 12px; color: red; margin-top:3px ">  You have a reservation for today!!!</h>
            </div>
        <%}%>
        </div>

    </form>
    <form action="login">
        <input class="btn1" type="submit" value="Login" />
    </form>
</div>
</body>
</html>
