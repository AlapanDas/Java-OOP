import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class server {

    public static void main(String args[]) throws IOException {

        ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080 ....");
        while (true) {
            try (Socket socket = server.accept()) {
                Date today = new Date();
                String web="<!DOCTYPE html>\r\n" + //
                          "<html lang=\"en\">\r\n" + //
                          "\r\n" + //
                          "<head>\r\n" + //
                          "     <meta charset=\"UTF-8\">\r\n" + //
                          "     <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n" + //
                          "     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + //
                          "\r\n" + //
                          "     <!-- Title -->\r\n" + //
                          "     <title>BitBite</title>\r\n" + //
                          "\t<!-- <script src=\"./core.js\"></script> -->\r\n" + //
                          "\t<link rel=\"icon\" href=\"bit.svg\" />\r\n" + //
                          "\r\n" + //
                          "     <!-- Fonts -->\r\n" + //
                          "     <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n" + //
                          "     <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n" + //
                          "     <link href=\"https://fonts.googleapis.com/css2?family=Caveat:wght@700&display=swap\" rel=\"stylesheet\">\r\n" + //
                          "     <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n" + //
                          "     <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n" + //
                          "     <link href=\"https://fonts.googleapis.com/css2?family=Maven+Pro&display=swap\" rel=\"stylesheet\">\r\n" + //
                          "     <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n" + //
                          "     <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n" + //
                          "     <link href=\"https://fonts.googleapis.com/css2?family=Source+Sans+Pro&display=swap\" rel=\"stylesheet\">\r\n" + //
                          "     <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n" + //
                          "     <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n" + //
                          "     <link href=\"https://fonts.googleapis.com/css2?family=Audiowide&display=swap\" rel=\"stylesheet\">\r\n" + //
                          "     <link rel=\"preload\" href=\"moon.jpg\" >\r\n" + //
                          "     <script src=\"script.js\"></script>\r\n" + //
                          "     <!-- Linking CSS -->\r\n" + //
                          "     <!-- <link rel=\"stylesheet\" href=\"style.css\"> -->\r\n" + //
                          "</head>\r\n" + //
                          "\r\n" + //
                          "<body >\r\n" + //
                          "     <!-- <div class=\"navbar\">\r\n" + //
                          "               <li class=\"home\"><a  href=\"index.html\">Home</a></li>\r\n" + //
                          "               <li><a  href=\"resume.html\">Resume</a></li>\r\n" + //
                          "               <li><a  href=\"contact.html\">Contact</a></li>\r\n" + //
                          "     </div> -->\r\n" + //
                          "     <div id=\"console\">\r\n" + //
                          "          <span id=\"a\"><b><a href=\"mailto:alapandas333@gmail.com\" class=\"__cf_email__\" data-cfemail=\"c0a1b5b2af80a1b5b2af\">alapandas3</a></b></span\r\n" + //
                          "          ><span>:</span><span id=\"c\"><b>~</b></span\r\n" + //
                          "          ><span><b>$</b></span> <span><b>cd /about/</b></span>\r\n" + //
                          "\r\n" + //
                          "          <br />\r\n" + //
                          "\r\n" + //
                          "          <span id=\"a\"><b><a href=\"mailto:alapandas333@gmail.com\" class=\"__cf_email__\" data-cfemail=\"9effebecf1deffebecf1\">alapandas3</a></b></span\r\n" + //
                          "          ><span>:</span><span id=\"c\"><b>~/about</b></span\r\n" + //
                          "          ><span><b>$</b></span> <span><b>cat bitbite.txt</b></span>\r\n" + //
                          "\r\n" + //
                          "          <br />\r\n" + //
                          "          <br />\r\n" + //
                          "\r\n" + //
                          "          BitBite:\r\n" + //
                          "\r\n" + //
                          "          <br />\r\n" + //
                          "          <br />\r\n" + //
                          "\r\n" + //
                          "          I'm a programmer that enjoys learning and creating. I have worked on many projects:\r\n" + //
                          "          <br />\r\n" + //
                          "          <br />\r\n" + //
                          "\r\n" + //
                          "          <a href=\"https://github.com/AlapanDas/Face-Mask-Detection-Model\">&gt; <b>Face Mask Detection Model</b></a\r\n" + //
                          "          >, A optimised python script to detect whether the person is wearing a mask or not\r\n" + //
                          "\r\n" + //
                          "          <br />\r\n" + //
                          "          <br />\r\n" + //
                          "\r\n" + //
                          "          <a href=\"https://github.com/AlapanDas/WeatherApp\">&gt; <b>Weather App</b></a\r\n" + //
                          "          >, A windows native weather application.\r\n" + //
                          "\r\n" + //
                          "          <br />\r\n" + //
                          "          <br />\r\n" + //
                          "          \r\n" + //
                          "          <a href=\"https://solution-challenge-39387.web.app/\">&gt; <b>Code Library</b></a>, An open source website for coding and development resources.\r\n" + //
                          "\r\n" + //
                          "          <br />\r\n" + //
                          "          <br />\r\n" + //
                          "\r\n" + //
                          "     <a href=\"https://github.com/AlapanDas/Movie-Ticket-Booking-System\">&gt; <b>Movie Ticket Booking System</b></a\r\n" + //
                          "          >, A python full stack project with MySQL at the back for Movie Ticket Booking.\r\n" + //
                          "\r\n" + //
                          "          <br />\r\n" + //
                          "          <br />\r\n" + //
                          "          You can find me on:\r\n" + //
                          "\r\n" + //
                          "          <br />\r\n" + //
                          "          <br />\r\n" + //
                          "\r\n" + //
                          "          <a href=\"https://github.com/AlapanDas\">&gt; <b>GitHub</b></a>\r\n" + //
                          "\r\n" + //
                          "          <br />\r\n" + //
                          "          <br />\r\n" + //
                          "\r\n" + //
                          "          <a rel=\"me\" href=\"https://www.linkedin.com/in/alapan-das-0171131b3/\">&gt; <b>LinkedIn</b></a>\r\n" + //
                          "\r\n" + //
                          "          <br />\r\n" + //
                          "          <br />\r\n" + //
                          "\r\n" + //
                          "          <a href=\"https://twitter.com/AlapanDas4\">&gt; <b>Twitter</b></a>\r\n" + //
                          "\r\n" + //
                          "          <br />\r\n" + //
                          "          <br />\r\n" + //
                          "          <br />\r\n" + //
                          "\r\n" + //
                          "          For any professional inquiries, please <a href=\"mailto:alapandas333@gmail.com\">Email me</a>\r\n" + //
                          "          <br>\r\n" + //
                          "          Here is my <a href=\"resume.html\">Resume</a>\r\n" + //
                          "           \r\n" + //
                          "          <br />\r\n" + //
                          "     </div>\r\n" + //
                          "     <!-- <style class=\"bg\">  \r\n" + //
                          "          body  \r\n" + //
                          "          {  \r\n" + //
                          "          background-image:url(\"moon.jpg\");  \r\n" + //
                          "          }  \r\n" + //
                          "          </style> -->\r\n" + //
                          "     <!-- <center>\r\n" + //
                          "          <br>\r\n" + //
                          "          <br>\r\n" + //
                          "          <name class=\"name\">Alapan Das</name>\r\n" + //
                          "     </center> -->\r\n" + //
                          "\r\n" + //
                          "     <!-- <img class=dp src=\"image.jpg\" alt=\"\"> -->\r\n" + //
                          "\r\n" + //
                          "     <!-- INTRO -->\r\n" + //
                          "     <!-- <p class=\"Intro\">Hey, This is Alapan Das, Junior developer. I am currently a sophomore in <a class=\"gcect\"\r\n" + //
                          "               href=\"https://gcect.ac.in/\">GCECT</a>. <br>I love working on Machine Learning Projects, Android\r\n" + //
                          "          Development and Open-Source Projects. <br> I am currently working on Image Processing and Deep Learning,\r\n" + //
                          "          Google Summer of Code 2023 Events <br> I am currently learning Deep Learning, Rest2API Projects, Node js,\r\n" + //
                          "          Javascript, MongoDB\r\n" + //
                          "     </p> -->\r\n" + //
                          "\r\n" + //
                          "     <!-- EDUCATION  -->\r\n" + //
                          "     <!-- <h1 class=\"Education\">Education:</h1>\r\n" + //
                          "     <div class=\"edu\">\r\n" + //
                          "          <ol class=\"schools\">\r\n" + //
                          "\r\n" + //
                          "               <li>Government College of Engineering and Ceramic Technology, Kolkata\r\n" + //
                          "                    <ol class=\"college\">\r\n" + //
                          "                         Bachelor of Technology -Computer Science and Engineering [2021-2025]\r\n" + //
                          "                    </ol>\r\n" + //
                          "                    <ol class=\"college\">\r\n" + //
                          "                         GPA- 9.64\r\n" + //
                          "                    </ol>\r\n" + //
                          "                    <ol class=\"college\">\r\n" + //
                          "                         Courses- : Operating Systems, Data Structures, Analysis Of Algorithms, Artificial Intelligence,\r\n" + //
                          "                         Machine Learning, Computer Networks, DBMS\r\n" + //
                          "                    </ol>\r\n" + //
                          "               </li>\r\n" + //
                          "\r\n" + //
                          "               <li>Delhi Public School, Kolkata\r\n" + //
                          "                    <ol class=\"hschool\">\r\n" + //
                          "                         Computer Science [2019-2021]\r\n" + //
                          "                    </ol>\r\n" + //
                          "                    <ol class=\"hschool\">\r\n" + //
                          "                         Percentage- 90%\r\n" + //
                          "                    </ol>\r\n" + //
                          "                    <ol class=\"hschool\">\r\n" + //
                          "                         Subjects- English, Physics, Chemistry, Mathematics, Computer Science\r\n" + //
                          "                    </ol>\r\n" + //
                          "               </li>\r\n" + //
                          "\r\n" + //
                          "               <li>M.P. Birla Foundation H.S. School, Kolkata\r\n" + //
                          "                    <ol class=\"mschool\">\r\n" + //
                          "                         Elementary Science [2009-2019]\r\n" + //
                          "                    </ol>\r\n" + //
                          "                    <ol class=\"mschool\">\r\n" + //
                          "                         Percentage- 94%\r\n" + //
                          "                    </ol>\r\n" + //
                          "                    <ol class=\"mschool\">\r\n" + //
                          "                         Subjects- English, Physics, Chemistry, Mathematics, Computer Science, Hindi, History, Geography, Biologykt\r\n" + //
                          "                    </ol>\r\n" + //
                          "               </li>\r\n" + //
                          "          </ol>\r\n" + //
                          "     </div> -->\r\n" + //
                          "\r\n" + //
                          "     <!-- EXPERIENCE -->\r\n" + //
                          "     <!-- <h1 class=\"Experience\">Experience:</h1>\r\n" + //
                          "     <div class=\"exp\" >\r\n" + //
                          "          <ol class=\"exps\">\r\n" + //
                          "               <li>Hacktober Fest 2022\r\n" + //
                          "                    <ol class=\"exp1\">\r\n" + //
                          "                         Open-Source Contribution\r\n" + //
                          "                    </ol>\r\n" + //
                          "               </li>\r\n" + //
                          "               <li>Google Developer Student Club - Aug 22' to July 23'\r\n" + //
                          "                    <ol class=\"exp2\">\r\n" + //
                          "                         Position- Campus Lead, Mentored and Taught more than 300 students on Google Technologies via Bootcamp, Speaker sessions and Hackathons.\r\n" + //
                          "                    </ol>\r\n" + //
                          "               </li>\r\n" + //
                          "               <li>Girlscript Summer of Code 2022\r\n" + //
                          "                    <ol class=\"exp2\">\r\n" + //
                          "                         Open-Source Contribution\r\n" + //
                          "                    </ol>\r\n" + //
                          "               </li>\r\n" + //
                          "               <li>MultiProcessing Muggles\r\n" + //
                          "                    <ol class=\"exp2\">\r\n" + //
                          "                         Android Development- <a href=\"https://play.google.com/store/apps/details?id=dasgupta.multiprocessingmuggles.sunami.kilogramstopounds\">Pound Conversion App</a>\r\n" + //
                          "                    </ol>\r\n" + //
                          "               </li>\r\n" + //
                          "          </ol>\r\n" + //
                          "     </div> -->\r\n" + //
                          "\r\n" + //
                          "     <!-- SKILLS -->\r\n" + //
                          "     <!-- <h1 class=\"skills\">Skills: </h1>\r\n" + //
                          "          <ol class=\"skills_list\">\r\n" + //
                          "                    <li>Language: Python, MATLAB, C++, JavaScript, SQL, JAVA</li><br>\r\n" + //
                          "                    <li>Frameworks: Scikit, TensorFlow, Keras, Django, NodeJS</li><br>\r\n" + //
                          "                    <li>Tools: API, Premiere Pro, Photoshop, Adobe Audition, PixInsight, Siril, GIMP, Stellarium, GIT, MySQL, SQLite</li><br>\r\n" + //
                          "                    <li>Platforms: Linux, Google Cloud, Web, Windows</li><br>\r\n" + //
                          "                    <li>Soft Skills: Leadership, Event Management, Content Writing, Public Speaking, Collaborative Workflow</li><br>\r\n" + //
                          "          </ol>\r\n" + //
                          " -->\r\n" + //
                          "</body>\r\n" + //
                          "</html>\r\n" + //
                          "<style>\r\n" + //
                          "\tbody {\r\n" + //
                          "\t\tbackground-color: #000;\r\n" + //
                          "\t}\r\n" + //
                          "\t#console {\r\n" + //
                          "\t\tfont-family: SF Mono, monospace;\r\n" + //
                          "\t\tcolor: #fff;\r\n" + //
                          "\t\twidth: 750px;\r\n" + //
                          "\t\tmargin-left: auto;\r\n" + //
                          "\t\tmargin-right: auto;\r\n" + //
                          "\t\tmargin-top: 100px;\r\n" + //
                          "\t\tfont-size: 16px;\r\n" + //
                          "\t}\r\n" + //
                          "     .navbar {\r\n" + //
                          "     overflow: hidden;\r\n" + //
                          "     position: fixed;\r\n" + //
                          "     /* Set the navbar to fixed position */\r\n" + //
                          "     top: 0;\r\n" + //
                          "     /* Position the navbar at the top of the page */\r\n" + //
                          "     width: 99%;\r\n" + //
                          "     /* Full width */\r\n" + //
                          "     text-align: right;\r\n" + //
                          "     /* background-color: #416672b6; */\r\n" + //
                          "     font-weight: 600;\r\n" + //
                          "     }\r\n" + //
                          "\ta {\r\n" + //
                          "\t\tcolor: #00ff08;\r\n" + //
                          "\t\ttext-decoration:none;\r\n" + //
                          "\t}\r\n" + //
                          "\t#a {\r\n" + //
                          "\t\tcolor: #fffb00;\r\n" + //
                          "\t}\r\n" + //
                          "\t#c {\r\n" + //
                          "\t\tcolor: #00ff08;\r\n" + //
                          "\t}\r\n" + //
                          "\t#b {\r\n" + //
                          "\t\tcolor: #fffb00;\r\n" + //
                          "\t}\r\n" + //
                          "</style>\r\n" + //
                          "<script>\r\n" + //
                          "\tvar text = document.getElementById('console');\r\n" + //
                          "\r\n" + //
                          "\tvar textToType = text.innerHTML.split('Auro:')[0];\r\n" + //
                          "\tvar textToPut = text.innerHTML.split('Auro:')[1];\r\n" + //
                          "\r\n" + //
                          "\tvar typewriter = new Typewriter(text, {\r\n" + //
                          "\t\tloop: false,\r\n" + //
                          "\t\tdelay: 10,\r\n" + //
                          "\t\tautoStart: true,\r\n" + //
                          "\t\tcursor: '_',\r\n" + //
                          "\t});\r\n" + //
                          "\r\n" + //
                          "\ttypewriter.typeString(textToType).pauseFor(100).pasteString(textToPut).start();\r\n" + //
                          "</script>\r\n" + //
                          "";
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + web;
                socket.getOutputStream()
                      .write(httpResponse.getBytes("UTF-8"));
            }
        }
    }

}