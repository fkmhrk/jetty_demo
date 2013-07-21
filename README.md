jetty_demo
==========

Jetty demo project

How to use

    $ git clone https://github.com/fkmhrk/jetty_demo.git
    $ cd jetty_demo/
    $ ./gradlew clean build
    $ cd build/libs/
    $ java -jar jetty_demo.jar
    
You will see the following output on your console.

    2013-07-21 23:20:41.109::INFO:  Logging to STDERR via org.mortbay.log.StdErrLog
    2013-07-21 23:20:41.128::INFO:  jetty-7.0.x
    2013-07-21 23:20:41.170::INFO:  Started SelectChannelConnector@0.0.0.0:8080
  
Let's go to http://localhost:8080 !
