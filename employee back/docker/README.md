# DockerFile - employee-services project

### Commands:

Build:
cd into employee-services folder and issue the following commands:

```sh
$ docker build -t employee-services -f docker/Dockerfile .
```

Run Locally to test:

```sh
$ docker run -p 8080:8080 employee-services
```

Open browser and go to: http://192.168.99.100:8080/employees
`Note that 192.168.99.100 is the local ip for the local docker instance`

Remember to clean up locally (docker rmi and docker rm).


Tag:
```sh
$ docker tag employee-services tomvmac/employee-services:1
```


Push to Docker Hub:
```sh
$ docker push tomvmac/employee-services:1
```

Pull from Docker Hub and test locally again:
```sh
$ docker pull tomvmac/employee-services:1
$ docker run --name employee-services -p 8080:8080 -d tomvmac/employee-services:1
```


