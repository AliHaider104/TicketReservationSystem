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
        background-color: white;
        background-image: url(https://i.pinimg.com/originals/00/a3/b4/00a3b40b86615300462c2f229db1a8e9.jpg);
      "
>
    <form
            action="Login"
            style="
          background-color: white;
          margin-left: 35%;
          margin-top: 10%;
          height: 350px;
          width: 400px;
          border: 2px solid black;
        "
    >
        <h1 style="color: black; margin-left: 130px">LOG IN</h1>
        <input
                style="
            margin: 20px;
            margin-left: 60px;
            margin-top: 30px;
            height: 40px;
            width: 70%;
          "
                placeholder="Enter Your Username"
                type="text"
                name="t1"
        /><br />
        <input
                placeholder="Enter Your Password"
                style="margin: 20px; margin-left: 60px; height: 40px; width: 70%"
                type="text"
                name="t2"
        /><br />
        <input class="btn" type="submit" />
    </form>
    <form action="signup">
        <input class="btn1" type="submit" value="Signup" />
    </form>
</div>
</body>
</html>
