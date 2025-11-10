# Use OpenJDK 21 as base image
FROM eclipse-temurin:21.0.9_10-jdk-noble

# Set working directory
WORKDIR /workspace

# Install additional tools (optional)
RUN apt-get update && apt-get install -y \
    vim \
    nano \
    tree \
    && rm -rf /var/lib/apt/lists/*

# Set JAVA_HOME environment variable
ENV JAVA_HOME=/usr/local/openjdk-21
ENV PATH=$JAVA_HOME/bin:$PATH

# Default command to keep container running
CMD ["bash"]