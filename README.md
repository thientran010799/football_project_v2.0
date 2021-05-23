# Build
mvn clean package && docker build -t com.axonactive.trainning.project/footballtournament .

# RUN

docker rm -f footballtournament || true && docker run -d -p 8080:8080 -p 4848:4848 --name footballtournament com.axonactive.trainning.project/footballtournament 