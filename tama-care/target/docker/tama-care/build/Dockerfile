# Start with a lightweight Linux image
FROM alpine:latest

# Install Redis and clean up package cache to reduce image size
RUN apk update && \
    apk add --no-cache redis

# Set the default command to launch redis-cli
CMD ["sleep","5000"]
