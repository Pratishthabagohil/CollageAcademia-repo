<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My Course</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
        }
        header {
            background-color: #de0a26; 
            color: white; /* Black text color */
            padding: 10px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .header-right {
            display: flex;
            align-items: center;
        }
        .header-right i {
            margin-left: 10px;
        }
        main {
            padding: 20px;
        }
        .info-box {
            width: 100%;
            height: 120px;
            background-color: white;
            margin-bottom: 20px;
            box-sizing: border-box;
            padding: 10px;
            border: 1px solid lightgrey;
            box-shadow: 0px 0px 5px rgba(0,0,0,0.3);
            position: relative;
        }
        .info-box:before {
            content: "\f02d";
            font-family: "Font Awesome 5 Free";
            position: absolute;
            top: 50%;
            left: 5px;
            transform: translateY(-50%);
            font-size: 20px;
        }
        .info-box:after {
            content: "\f141";
            font-family: "Font Awesome 5 Free";
            position: absolute;
            bottom: 5px;
            right: 5px;
            font-size: 20px;
        }
        .info-box p {
            margin: 5px 0;
        }
        .light-text {
            color: #949494; /* Light gray color */
        }
        .info{
            padding-left: 50px;
        }
        .book-icon {
            position: absolute;
            top: 20px;
            left: 20px;
            font-size: 20px;
        }
    </style>
</head>
<body>
    <header>
        <h1>My Course</h1>
        <div class="header-right">
            <i class="fa fa-bell"></i>
        </div>
    </header>

    <main>
        <div class="info-box">
            <i class="fas fa-book-open book-icon"></i>
            <div class = "info">
            <b>Theory Of Computation</b>
            <p><span class="light-text">Course Code:</span> <span>CE0617</span></p>
            <p><span class="light-text">Teacher:</span> <span>Gargi Nayan Bhatt</span></p>
            <p><span class="light-text">Credits:</span> <span>4</span></p>
            </div>
            <i class="fa fa-ellipsis-v" style="position: absolute; top: 20px; right: 30px;"></i>
        </div>
         <div class="info-box">
            <i class="fas fa-book-open book-icon"></i>
            <div class = "info">
            <b>Internet Of Things</b>
            <p><span class="light-text">Course Code:</span> <span>CE0617</span></p>
            <p><span class="light-text">Teacher:</span> <span>Abhishek Vaghela</span></p>
            <p><span class="light-text">Credits:</span> <span>4</span></p>
            </div>
            <i class="fa fa-ellipsis-v" style="position: absolute; top: 20px; right: 30px;"></i>
        </div>
         <div class="info-box">
            <i class="fas fa-book-open book-icon"></i>
            <div class = "info">
            <b>Advance Java Technology</b>
            <p><span class="light-text">Course Code:</span> <span>CE0618</span></p>
            <p><span class="light-text">Teacher:</span> <span>Shruti Bhupesh Yagnik</span></p>
            <p><span class="light-text">Credits:</span> <span>4</span></p>
            </div>
            <i class="fa fa-ellipsis-v" style="position: absolute; top: 20px; right: 30px;"></i>
        </div>
         <div class="info-box">
            <i class="fas fa-book-open book-icon"></i>
            <div class = "info">
            <b>Data Science</b>
            <p><span class="light-text">Course Code:</span> <span>CE0630</span></p>
            <p><span class="light-text">Teacher:</span> <span>Jaya Shukla</span></p>
            <p><span class="light-text">Credits:</span> <span>4</span></p>
            </div>
            <i class="fa fa-ellipsis-v" style="position: absolute; top: 20px; right: 30px;"></i>
        </div> <div class="info-box">
            <i class="fas fa-book-open book-icon"></i>
            <div class = "info">
            <b>Cryptography and Network Security</b>
            <p><span class="light-text">Course Code:</span> <span>CE0634</span></p>
            <p><span class="light-text">Teacher:</span> <span>Shruti Bhupesh Yagnik</span></p>
            <p><span class="light-text">Credits:</span> <span>4</span></p>
            </div>
            <i class="fa fa-ellipsis-v" style="position: absolute; top: 20px; right: 30px;"></i>
        </div> <div class="info-box">
            <i class="fas fa-book-open book-icon"></i>
            <div class = "info">
            <b>Software Engineering With UML</b>
            <p><span class="light-text">Course Code:</span> <span>CE0616</span></p>
            <p><span class="light-text">Teacher:</span> <span>Roshani Solanki</span></p>
            <p><span class="light-text">Credits:</span> <span>4</span></p>
            </div>
            <i class="fa fa-ellipsis-v" style="position: absolute; top: 20px; right: 30px;"></i>
        </div>
         <div class="info-box">
            <i class="fas fa-book-open book-icon"></i>
            <div class = "info">
            <b>Data Science - Practical</b>
            <p><span class="light-text">Course Code:</span> <span>CE0630</span></p>
            <p><span class="light-text">Teacher:</span> <span>Jaya Shukla</span></p>
            <p><span class="light-text">Credits:</span> <span>4</span></p>
            </div>
            <i class="fa fa-ellipsis-v" style="position: absolute; top: 20px; right: 30px;"></i>
        </div>
         <div class="info-box">
            <i class="fas fa-book-open book-icon"></i>
            <div class = "info">
            <b>Internet Of Things - Practical</b>
            <p><span class="light-text">Course Code:</span> <span>CE0622</span></p>
            <p><span class="light-text">Teacher:</span> <span>Abhisekh Vaghela</span></p>
            <p><span class="light-text">Credits:</span> <span>4</span></p>
            </div>
            <i class="fa fa-ellipsis-v" style="position: absolute; top: 20px; right: 30px;"></i>
        </div>
         <div class="info-box">
            <i class="fas fa-book-open book-icon"></i>
            <div class = "info">
            <b>Software Engineering With UML - Practical</b>
            <p><span class="light-text">Course Code:</span> <span>CE0616</span></p>
            <p><span class="light-text">Teacher:</span> <span>Sanjay Prajapati</span></p>
            <p><span class="light-text">Credits:</span> <span>4</span></p>
            </div>
            <i class="fa fa-ellipsis-v" style="position: absolute; top: 20px; right: 30px;"></i>
        </div>
         <div class="info-box">
            <i class="fas fa-book-open book-icon"></i>
            <div class = "info">
            <b>Advance Java - Practical</b>
            <p><span class="light-text">Course Code:</span> <span>CE0618</span></p>
            <p><span class="light-text">Teacher:</span> <span>Shruti Yagnik</span></p>
            <p><span class="light-text">Credits:</span> <span>4</span></p>
            </div>
            <i class="fa fa-ellipsis-v" style="position: absolute; top: 20px; right: 30px;"></i>
        </div>
        
        
        
        <!-- Additional info-boxes -->
    </main>
</body>
</html>
