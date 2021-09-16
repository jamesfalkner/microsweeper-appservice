FROM gitpod/workspace-full:latest

USER gitpod

# Install custom tools, runtime, etc.
RUN brew install az openjdk@11

ENV JAVA_HOME="/home/linuxbrew/.linuxbrew/opt/openjdk@11"
ENV PATH="$JAVA_HOME/bin:$PATH"

RUN curl -Ls https://sh.jbang.dev | bash -s - app install --fresh --force quarkus@quarkusio
ENV PATH="$HOME/.jbang/bin:$PATH"
RUN quarkus completion > $HOME/.bash_completion

# RUN env
# RUN mvn --version
# # Pre-populate .m2 maven repo
# RUN $M2_HOME/bin/mvn -fn dependency:resolve-plugins dependency:resolve dependency:go-offline clean compile package

