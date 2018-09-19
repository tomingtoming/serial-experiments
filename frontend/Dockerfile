# FROM nginx:1.12-alpine
# COPY build/ /usr/share/nginx/html
FROM node:10.10.0-alpine
RUN npm install -g create-elm-app@2.0.3 --unsafe-perm=true
WORKDIR /source
EXPOSE 3000
