# Docker-Application-Launcher #

Developed by: Adarsh Cavale and Matthew Dodson

#### A data science toolbox featuring the following services: ####
- RStudio
- Spyder **(Not implemented)**
- IBM SAS
- Git
- Jupyter Notebook
- Orange
- Visual Studio Code IDE
- Apache Hadoop **(Not implemented)**
- Apache Spark **(Not implemented)**
- Tableau
- SonarQube & SonarScanner
- Tensorflow
- Markdown IDE




## Live Demo ##

**Link to the demo:** {link here}



## Configuration and Dependencies ##

You need the following applications installed on your computer to run this Docker application:
- Docker Desktop
  - You will need this to access passwords for some headless browser applications that store their passwords in config files on their specific containers.
- Eclipse
  - If you have a Linux machine, you will need to change your URL for the headless browser applications and re-compile the JAR file. We go more into detail further down in the README.
- Xming (Windows) or XQuartz (Mac OS)
  - You need this to perform X-forwarding. We go into further detail in how to perform this in later steps. If Wayland is your default display server, you must install xorg in your default package distribution manager (e.g. apt, dnf, zippyr) and run a session of dnf.


In order to configure this application, you must do the following:

- Perform X-forwarding from your host machine
  - On Mac OS, download and open XQuartz and on your Terminal window, execute the command `xhost +` to allow network connections to use the `$DISPLAY` environment variable.
  - On Linux, open your Terminal window, execute the command `xhost +` to allow network connections to use the `$DISPLAY` environment variable.
  - On Windows, make sure Xming is running and add your local IP address to the `"C:\Program Files (x86)\Xming\X0.hosts"` (default installation location for Xming) file
  
- Then, open the Git repository and change the `$DISPLAY` variable to `:0` on a Linux machine, and `{your local IP address}:0` for Mac OS and Windows machines for the following files in this repository:
  - `docker-compose.yml`: lines 14 and 71
  - `src/rstudio/Dockerfile` line 5
  - `src/Dockerfile` line 7
  
Just to be safe, change the `$DISPLAY` variable according to your machine everywhere you encounter it in the repository.



**Note:** On Linux, if you cannot access `host.docker.internal` from your container's network, change every instance of `host.docker.internal` to `localhost` in the file `ApplicationRunnerGUI.java` (keeping the port numbers the same), then re-compile the jar file.

If you updated the file `ApplicationRunnerGUI.java` to change `host.docker.internal` to `localhost`, execute the following steps to create a new jar file:

1. Download and open Eclipse IDE.
2. Copy the `.java` file into a new project - create a new Class.
3. Save the file in any preferred location.
4. Check to see if there are any errors (warnings are fine).
5. Click `File > Export` and double click on the `JAR file` option.
6. Select the newly created project with the single file `ApplicationRunnerGUI.java` and specify your export destination to be `{location of this Git repository}/src/ApplicationRunnerGUI.jar`. Then click `Next` twice.
7. Select the main class to be `ApplicationRunnerGUI` and click `OK` and `Finish`. You should see some warnings appear, but these can be ignored.



## Running the Application ##

To run the application, `cd` just inside the Git repository and run `docker-compose up --build`. This command will build and run your images at the same time, including the docker images run inside the Java GUI container.


## Services ##

#### Main Java GUI ####

This service is the "main" service of the entire application. The GUI provides buttons that can be used to access each working application either through a headless web browser, Firefox, or through xterm. Both of these are preemptively installed on the Java GUI container. We used `Process` to run bash commands to run `xdg-open` (which opens Firefox) and to run a service container (built during the launch of the GUI) on xterm.


#### RStudio ####

RStudio, and many of the browser-hosted services included in this repository, runs on a headless instance of Firefox on port `8787`. When you click on the button to access RStudio, a Firefox window (hosted on either the Java GUI container or your host machine) will pop up. The username is `rstudio` and the password is `qwerty`, but you are able to change this in `docker-compose.yml` in the `rstudio` service.


#### Spyder **(Not implemented)** ####

Spyder does not work on this application.


#### IBM SAS ####

IBM works in the same way as RStudio, however instead of running a container, we were allowed to use a link to redirect the user to upon clicking the button. The link is: https://welcome.oda.sas.com/login. You would need to have an existing log-in to use the service. 


#### Git ####

Git opens on an xterm window. we first build the docker image from it's dockerfile in `src/git/Dockerfile` upon start-up of the Java GUI container. Then, once the "Git" button is clicked, we run the docker container on an xterm session and we are able to use that xterm session like one would in Git Bash.


#### Jupyter Notebook ####

The Jupyter Notebook service works in exactly the same way as the RStudio service works. However, Jupyter Notebook is hosted on port `8888`. To set up a password, look at the output for Jupyter Notebook when running `docker-compose up` to find the token number.

E.g. In this example output, the token is `de3db763754ee5c398b65f42d204416f07d3c2399a9b884e`.

```
jupyter_notebook_1  |     To access the notebook, open this file in a browser:
jupyter_notebook_1  |         file:///home/jovyan/.local/share/jupyter/runtime/nbserver-7-open.html
jupyter_notebook_1  |     Or copy and paste one of these URLs:
jupyter_notebook_1  |         http://c8dd6ee20127:8888/?token=de3db763754ee5c398b65f42d204416f07d3c2399a9b884e
jupyter_notebook_1  |      or http://127.0.0.1:8888/?token=de3db763754ee5c398b65f42d204416f07d3c2399a9b884e
````


#### Orange ####

The Orange service is another headless browser application run on port `6901`. The password to enter should be "orange".



#### Visual Studio Code IDE ####

VS Code is another headless browser application running on port `8080`. To log in, you need to use Docker Desktop to access the VS Code container's CLI. Once in the CLI, run this command to get the password: `cat ~/.config/code-server/config.yaml`:

```
c# cat ~/.config/code-server/config.yaml
bind-addr: 127.0.0.1:8080
auth: password
password: b7dab951b5899ecb60806cbd
cert: false
```



#### Apache Hadoop **(Not implemented) ####

Apache Hadoop has not been implemented.



#### Apache Spark **(Not implemented)** #### 

Apache Spark has not been implemented.



#### Tableau ####

The Tableau service is set up just like IBM SAS. We were allowed to use a defined URL, just like IBM SAS, to redirect the user to an online portal. Here is the link to that portal: https://sso.online.tableau.com/public/idp/SSO.



#### SonarQube & SonarScanner ####
Matt can you fill this in?



#### Tensorflow ####

Tensorflow is set up in the same way as Git. We pulled the image from DockerHub and ran the image/opened it on an xterm session when the button for Tensorflow was clicked.



#### Markdown IDE ####

The Markdown service is run on another headless browser application run on port `12345`. It's just a simple markdown editor.
