FROM airhacks/glassfish
COPY ./target/footballtournament.war ${DEPLOYMENT_DIR}
