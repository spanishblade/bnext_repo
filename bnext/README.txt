DOCKER:

FROM - The keyword FROM tells Docker to use a given base image as a build base. We have used 'java' with tag '8-jdk-alpine'. 
Think of a tag as a version. The base image changes from project to project. You can search for images on docker-hub.

COPY - This tells Docker to copy files from the local file-system to a specific folder inside the build image. 
Here, we copy our .jar file to the build image (Linux image) inside /usr/app.

WORKDIR - The WORKDIR instruction sets the working directory for any RUN, CMD, ENTRYPOINT, COPY and ADD instructions that follow in the Dockerfile. 
Here we switched the workdir to /usr/app so as we don't have to write the long path again and again.

RUN - This tells Docker to execute a shell command-line within the target system. 
Here we practically just "touch" our file so that it has its modification time updated (Docker creates all container files in an "unmodified" state by default).

ENTRYPOINT - This allows you to configure a container that will run as an executable. 
It's where you tell Docker how to run your application. We know we run our spring-boot app as java -jar <app-name>.jar, so we put it in an array.


PRACTICE EXAMPLE TO DOCKERIZE SPRINGBOOT+GRADLE APP:

Sure you gradle build and springboot:run work

1. 	Create 1 file called Dockerfile in main root of project:




2. 	Git Bash (develop branch) build the docker image:

	$ docker build -t bnext .

3. 	Check our docker image  dockerappimage has been created:

	$ docker images

	REPOSITORY                         TAG        IMAGE ID       CREATED          SIZE
	bnext                              latest     1b4188a371df   43 seconds ago   567MB


	
4. 	Run a container/app with our docker image dockerappimage previously created:
	[Una vez tenemos creada la imagen, nos aparece en el Docker Desktop/Panel Izquierdo/Imagenes. 
	Ahora corremos un contenedor/app a partir de esa imagen con boton RUN o directamentemente usamos en CMD el comando:]


	$  docker run -d -p 8080:8080 bnext

5.	We check our new container/app:

	$ docker ps -a
	
	CONTAINER ID   IMAGE                                       COMMAND                    CREATED          STATUS                      PORTS                              NAMES
	05398d722bba   dockerappimage                              "java -jar dockerappÔÇª"   49 seconds ago   Exited (1) 49 seconds ago                                      jolly_maxwell
		
6.	We check http://localhost:8888/bnext/hello2
	
	
	
	$ docker run -d -p 8080:8080 bnext
	
	
