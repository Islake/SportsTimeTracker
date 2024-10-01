## Docker on Virtual Machine - Experience Report
Introduction
This project involved developing a Java application to log sports activities, setting up continuous integration and deployment with Jenkins, containerizing the application with Docker, and running the container on a Linux virtual machine. The process required configuring several tools and platforms, including GitHub for version control, Jenkins for CI/CD, Docker for containerization, and a Linux VM to run the Docker container.

## Experience Summary
The overall experience was challenging but insightful, requiring me to troubleshoot various technical issues at different stages. Each task built upon the previous one, demanding careful attention to configurations and dependencies.

## Challenges Faced
- Maven and pom.xml Configuration:
Initially, I struggled with the correct configuration in the pom.xml file for managing dependencies, setting up Maven for building, and ensuring compatibility with JUnit and JaCoCo for testing and coverage.
Solution: I used online resources, especially Maven's official documentation, to configure the build and test lifecycle correctly.
Jenkins Pipeline Creation:

- Setting up Jenkins and writing the pipeline script was challenging, particularly when adding stages for testing, Docker image creation, and pushing the image to Docker Hub.
Solution: I relied heavily on Jenkins documentation and community examples to write a working pipeline script. Breaking the script into manageable steps helped in debugging individual stages.
Docker and Docker Hub:

- Creating the Dockerfile and building the image was straightforward, but I faced issues when pushing the image to Docker Hub due to authentication and configuration problems.
Solution: Configuring Docker credentials in Jenkins and using the correct Docker commands resolved the issue. Docker's documentation provided clear steps for managing images and authentication.
Linux Virtual Machine Setup:

- I had forgotten my Ubuntu VM password and needed to reset it, which delayed the setup process. More significantly, I encountered difficulties when installing Docker on the VM, particularly around configuring permissions and user groups.
Solution: After researching, I learned to reset the password via recovery mode. For Docker installation, I followed Docker's documentation for Ubuntu, ensuring I added the correct user to the Docker group to manage permissions.
Running Docker Container on the VM:

- Once Docker was installed, running the container presented issues related to image compatibility and resource allocation within the VM.
Solution: I resolved these by adjusting the VM's resource settings and verifying that the correct Docker image was pulled from Docker Hub.
Time Management:

- Time was a significant constraint, as I faced several technical hurdles that delayed progress.
Solution: Prioritizing critical tasks and troubleshooting efficiently through Google searches helped me stay on track. I often found that others had faced similar issues, which accelerated problem-solving.
Conclusion
The project was a valuable learning experience, especially in understanding the complexities of continuous integration, containerization, and virtualization. Despite the challenges, such as Jenkins pipeline configuration, Docker permissions, and VM setup, I overcame them through diligent research and troubleshooting. Overall, the experience strengthened my skills in Java development, Docker, Jenkins, and Linux system administration.
