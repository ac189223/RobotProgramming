# RobotProgramming
#### Assignment from jayway.

[ Specification ](#spec)  
[ Requirements ](#requir)  
[ Solution ](#sol)  

<a name="spec"></a>
### Specification
Program the controller for a robot. 
* It's a simple robot that can walk around in a room.
* The floor is represented as a number of fields in a wire mesh.
* Input data consist of:
  * two numbers, which tell the robot how big the room is:
    * first of them stands for the width of the room,
    * second stands for the depth of the room (height on the computer screen),
    * example: 8 12,
  * two numbers and one letter indicate the starting position of the robot:
    * numbers stands for the point located in the room,
    * letter provides orientation in space,
    * example: 2 4 E,
  * a number of navigation commands in the form of characters:
    * L for left turn,
    * R for turn right,
    * F for step forward,
    * example: LFFRFRFRFF.
* The robot should:
  * start from provided starting point,
  * execute all received commands,
  * report his final position after the last command is executed (point and direction),
  * example of the report: 1 3 N.

<a name="requir"></a>
### Requirements
The solution must present competence in several areas, including: 
  * Java in general,
  * object oriented analysis and design,
  * tests,
  * user interface.

<a name="sol"></a>
### Solution
Implemented according to 
[UML diagram](https://github.com/ac189223/SDA_03_IndividualProject/blob/ChangesAreComing/src/main/resources/IndividualProject_UML_miniature.png)
within MVC pattern with GUI.
* [Model](https://github.com/ac189223/RobotProgramming/tree/master/src/main/java/Model)
  * class to represent a robot (RobotJim)
    * including methods to report coordinates of actual position,
  * class to represent a room (RoomOfTheRooms)
    * giving possibility to check one room of four with different specifications:
      * room to die in doesn't have walls
        * robot can fall out of the room and crash, 
        * after third crash he dies and the program is stopped,
      * room with walls is the regular one
        * robot hits the wall and cannot go any further,
      * room goes round in the shape of torus
        * robot appears on the other side of the room when he crosses the border,
      * room of magic in Kleins bottle shape
        * the robot apprears on the other side of the room when he crosses the border vertically,
        * if he crosses the border horizontally, he appears on the other side but his vertical position is mirrored.
* [View](https://github.com/ac189223/RobotProgramming/tree/master/src/main/java/View)
  * GUI to control the robot consisting of:
    * info view with:
      * description of the application, 
      * short manual,
    * programming view with possibility of:
      * setting start parameters of the room and the robot,
        * default size of the room is 1x1 and chosen mode is room to die in, 
        * default starting point of the robot is (1,1) and he is facing North,
        * user may choose from the lists and set width and height of the room (up to 50),
        * then lists of robot possible coordinates are created - all locations inside the room are avaliable,
        * user may choose coordinates of the starting point of the robot from the lists,
        * user may choose the direction that the robot is facing to at the beginning,
        * user may choose the type of the room using radio buttons,
      * programming moves of the the robot,
        * user may set the program using dedicated buttons that add one command for every click,
        * user may use two additional buttons to correct written program,
        * typed in program is visible in the field below the buttons,
        * maximum lenght of the program is 90 commands,
      * running the application,
    * results view, to control the results after execution of the program, consists of:
      * header with short description of chosen room and the robot starting position,
      * details of all executed commands.
* [Controller](https://github.com/ac189223/RobotProgramming/tree/master/src/main/java/Controller)
  * class containing functions needed to run the application  (Operator),
  * class to control the flow of the application (Controller) containing for example methods for:
    * creating descriptions and reporting results in GUI,
    * moving the robot forward and making turns left and right,
    * checking if the robot is at the border of the room,
    * crossing the border of the room with behaviour depending on the room type,
    * checking if the robot did not crash and if he is still alive after crossing the border,
    * moving the robot to the starting point after crash,
    * adding commands to the program and erasing one command or the whole program,
    * executing the whole program and one command,
    * reporting position of the robot,
    * creating lists of avaliable sizes of the room, coordinates of starting position and possible directions,
    * creating the room and the robot according to the set parameters,
    * and others.
* [Test](https://github.com/ac189223/RobotProgramming/tree/master/src/test/java)
  * tests for all methods that were provided in four classes:
    * RobotJim - 10 tests in total,
    * RoomOfTheRooms - 10 tests in total,
    * Operator - 4 tests in total,
    * Controller - 113 tests in total,
  * there is no separate class with tests for View class 
    * all the activities in the view are taken by the controller (MVC pattern),
    * all are tested in ControllerTest class.
* [Resources](https://github.com/ac189223/RobotProgramming/tree/master/src/main/resources)
  * UML diagram of the application (jpeg and pdf).
