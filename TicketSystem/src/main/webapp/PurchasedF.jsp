<html>
<style>
    .btn {
        text-align: center;
        margin-left: 148px;
        background-color: #ffbf00;
        border-color: #ffbf00;
        color: black;
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
            action="Purchase"
            style="
          background-color: black;
          margin-left: 35%;
          margin-top: 10%;
          height: 350px;
          width: 400px;
          border: 2px solid #f0f0f0;
        "
    >
        <h1 style="color: white; margin-left: 130px">Buy Ticket</h1>
        <h1 style="color: yellow; margin-left: 130px">WHY US?</h1>

        <p style="color: white">
            There is no time constraint. Just buy the ticket today and feel relax.
            You can come at anytime and use your ticket to enjoy a comfortable
            journey to ISB, KAR and BAHAWALNAGAR.
        </p>
        <h2 style="margin-left: 47px; color: yellow">
            "Your Comfort is our Priority"
        </h2>
        <p></p>
        <input class="btn" type="submit" value="Purchase" />
    </form>
    <form action="login">
        <input class="btn1" type="submit" value="Logout" />
    </form>

    <dialog
            open
            style="
          margin-left: 45%;
          background-color: red;
          color: white;
          opacity: 0.8;
        "
    >
        Purchase Fail.
    </dialog>
</div>
</body>
</html>
