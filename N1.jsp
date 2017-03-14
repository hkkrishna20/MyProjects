
 <script src="http://code.jquery.com/jquery-1.6.1.min.js"></script>
    <script src="http://code.jquery.com/mobile/1.0b1/jquery.mobile-1.0b1.js"></script>
    <script>
        $(document).ready(function () {
            var students = new Array("Lakshmi", "Mani", "Mohan", "Mounika", "Sheik");
            for (i = 0; i < students.length; i++) {
                $("#students").append("<option value="+students[i] +">"+students[i]+"</option>");
            }
        });
    </script>
	 <script src="http://code.jquery.com/jquery-1.6.1.min.js"></script>
    <script src="http://code.jquery.com/mobile/1.0b1/jquery.mobile-1.0b1.js"></script>
    <script>

        $(document).ready(function () {
            //$("div").add(document.getElementById("ceo")_
            
            $("div").append("<b>is Trainer</b>");
            $("p").append("<b> is Attending UI/Java Training</b>");

        });
    </script>
	<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <script src="http://code.jquery.com/jquery-1.6.1.min.js"></script>
    <script src="http://code.jquery.com/mobile/1.0b1/jquery.mobile-1.0b1.js"></script>
    <script>
        $(document).ready(function () {
            $("p").add(document.getElementById("p1")).css("background", "yellow");
        });
    </script>
    <meta charset="utf-8" />
    <title></title>
</head>
<body>
    <p id="p1">
        Welcome to Jquery Paragraph
    </p>
</body>
</html>


<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
  <link rel="stylesheet" href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css"/>
  <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
  <script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
  <link rel="stylesheet" href="http://resources/demos/style.css"/>
     <script>
         $(function () {
             $(document).tooltip();
         });
  </script>
    <meta charset="utf-8" />
    <title></title>
</head>
<body>
    <br /><br />
    <center>
        Enter Age  : 
        <input type="text" id="age" title="I need your age for Validation Purpose" /> <br /> 
        Name : 
        <input type="text" id="name" title="Need your name for attendance purpose" />
    </center>
</body>
</html>

<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css"/>
    <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
    <script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
    <link rel="stylesheet" href="http://resources/demos/style.css"/>
     <script>
         $(document).ready(function () {
             $("#tabs").tabs();
         });
    </script>
    <meta charset="utf-8" />
    <title></title>
</head>
<body>
     <div id="tabs">
        <ul>
            <li>
                <a href="#tabs-1">Personal Data</a></li>
                <li><a href="#tabs-2">Academic Data</a></li>
                <li><a href="#tabs-3">Job Data</a>
            </li>
        </ul>
        <div id="tabs-1">
            <p>This is my personal data</p>
            <p>Welcome to all</p>
            <p>jQuery is a cross browser JavaScript library that helps to traverse through HTML elements, event handling, effects(animation) and Ajax interactions. 
It is very easy to learn and implement.
We will see how to work on jQuery with asp.net and few of jQuery features in this article.

</p>
        </div>
        <div id="tabs-2">
            <p>This is My Academic Data</p>
            <p>Welcome to all</p>
            <p>
                jQuery is a cross browser JavaScript library that helps to traverse through HTML elements, event handling, effects(animation) and Ajax interactions. 
It is very easy to learn and implement.
We will see how to work on jQuery with asp.net and few of jQuery features in this article.

jQuery is a cross browser JavaScript library that helps to traverse through HTML elements, event handling, effects(animation) and Ajax interactions. 
It is very easy to learn and implement.
We will see how to work on jQuery with asp.net and few of jQuery features in this article.

jQuery is a cross browser JavaScript library that helps to traverse through HTML elements, event handling, effects(animation) and Ajax interactions. 
It is very easy to learn and implement.
We will see how to work on jQuery with asp.net and few of jQuery features in this article.

jQuery is a cross browser JavaScript library that helps to traverse through HTML elements, event handling, effects(animation) and Ajax interactions. 
It is very easy to learn and implement.
We will see how to work on jQuery with asp.net and few of jQuery features in this article.


            </p>
        </div>
        <div id="tabs-3">
            <p>This is Job Data </p>
            <p>Welcome to My Page...</p>
            <p>
                jQuery is a cross browser JavaScript library that helps to traverse through HTML elements, event handling, effects(animation) and Ajax interactions. 
It is very easy to learn and implement.
We will see how to work on jQuery with asp.net and few of jQuery features in this article.

jQuery is a cross browser JavaScript library that helps to traverse through HTML elements, event handling, effects(animation) and Ajax interactions. 
It is very easy to learn and implement.
We will see how to work on jQuery with asp.net and few of jQuery features in this article.

jQuery is a cross browser JavaScript library that helps to traverse through HTML elements, event handling, effects(animation) and Ajax interactions. 
It is very easy to learn and implement.
We will see how to work on jQuery with asp.net and few of jQuery features in this article.

jQuery is a cross browser JavaScript library that helps to traverse through HTML elements, event handling, effects(animation) and Ajax interactions. 
It is very easy to learn and implement.
We will see how to work on jQuery with asp.net and few of jQuery features in this article.

jQuery is a cross browser JavaScript library that helps to traverse through HTML elements, event handling, effects(animation) and Ajax interactions. 
It is very easy to learn and implement.
We will see how to work on jQuery with asp.net and few of jQuery features in this article.


            </p>
        </div>
    </div>
</body>
</html>