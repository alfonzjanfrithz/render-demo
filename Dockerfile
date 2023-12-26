# Use the official nginx image as a base
FROM nginx:latest

# Copy the static HTML files into the nginx container
COPY ./*.html /usr/share/nginx/html/

# Expose port 80
EXPOSE 80

# Start Nginx and keep it running in the foreground
CMD ["nginx", "-g", "daemon off;"]