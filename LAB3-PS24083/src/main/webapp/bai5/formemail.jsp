<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Email</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Fira+Sans:ital,wght@0,100;0,200;0,300;0,400;0,500;1,100;1,200;1,300;1,400;1,500&display=swap');

        * {
            margin: 0;
            padding: 0;
        }

        .container {
            font-family: 'Fira Sans', sans-serif;
            width: 40%;
            margin: 10px auto;
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
            padding: 10px;
            border-radius: 10px;
        }
        h1{
            text-align: center;
            font-weight: 400 ;
           font-style: italic;
           color: #FF9551;
        }
         .box{
            margin-bottom: 10px;
        }
        label{
            color:#3CCF4E ;
            font-style: italic;

        }
        input{
            font-family: 'Fira Sans', sans-serif;
            display: block;
            width: 70%;
            line-height: 25px;
            outline: none;
            border: none;
            border-radius: 5px;
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);

        }
        input:focus:hover{
            transition: all 0.3s linear;
            transform: scale(1.05);
            background-color: antiquewhite;

        }
        textarea{
            display: block;
            width: 100%;
            outline: none;
            font-family: 'Fira Sans', sans-serif;
            border: none;
            border-radius: 5px;
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
        }
        .but{
            width: 100%;
            text-align: center;
        }
        button{
            width: 20%;
            line-height: 30px;
            outline: none;
            border: none;
            margin: 5px;
            font-family: 'Fira Sans', sans-serif;
            
        }
        .cancel{
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
            background-color: white;
            border-radius: 5px;
            

        }
        .done{
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
            background-color: #3CCF4E;
            border-radius: 5px;
        }
        .cancel:hover{
            transition: all 0.3s linear;
            transform: scale(1.05); 
            background-color: #D1512D;
            color: aliceblue;
        }
        .done:hover{
            transition: all 0.3s linear;
            transform: scale(1.05); 
            color: aliceblue;
        }

    </style>
</head>

<body>
    <div class="container">
        <h1>Send Email</h1>
        <form action="SendEmail" method="post" enctype="multipart/form-data">
            <div class="box">
                <label for="user">Email</label>
                <input type="text" name="user" id="user" value="truongnvps24083@fpt.edu.vn">

            </div>
            <div class="box">
                <label for="pass">Password</label>
                <input type="password" name="pass" id="pass" value="dkfkilftpeszjupq">

            </div>
            <div class="box">
                <label for="user">TO</label>
                <input type="text" name="to" id="to">

            </div>
            <div class="box">
                <label for="cc">CC</label>
                <input type="text" name="cc" id="cc">

            </div>
            <div class="box">
                <label for="user">BCC</label>
                <input type="text" name="bcc" id="bcc">

            </div>
            <div class="box">
                <label for="sub">Subject</label>
                <input type="text" name="sub" id="sub">

            </div>
             <div class="box">
                <label for="ct">File</label>
               <input type="file" name="fileupload" >

            </div>
            <div class="box">
                <label for="ct">Content</label>
                <textarea name="content" id="ct" cols="30" rows="10"></textarea>

            </div>
            <div class="but">
                <button class="cancel" type="button">Cancel</button>
                <button class="done">Send</button>
            </div>
            <h1>${message }</h1>
           
        </form>
    </div>
</body>

</html>