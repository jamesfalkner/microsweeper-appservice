FROM gitpod/workspace-full:latest

USER gitpod

# Install custom tools, runtime, etc.
RUN brew install az 

# RUN env
# RUN mvn --version
# # Pre-populate .m2 maven repo
# RUN $M2_HOME/bin/mvn -fn dependency:resolve-plugins dependency:resolve dependency:go-offline clean compile package

