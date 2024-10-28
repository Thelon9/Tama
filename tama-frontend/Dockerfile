# Stage 1: Build the React app
FROM node:16 AS build

# Set working directory in the container
WORKDIR /app

# Copy package.json and package-lock.json
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy the entire frontend source code into the container
COPY . .

# Build the React app for production
RUN npm run build

# Stage 2: Serve the React app with a lightweight web server
FROM node:16-slim AS production

# Install 'serve' to serve the static files
RUN npm install -g serve

# Copy the build output from the first stage
COPY --from=build /app/build /app/build

# Expose port 3000 to access the app
EXPOSE 3000

# Run 'serve' to serve the built files on port 3000
CMD ["serve", "-s", "/app/build", "-l", "3000"]
