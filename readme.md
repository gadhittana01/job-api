# Job API Project
This repository is the API where you can browse all jobs.

# Example Request
```sh
// Register
$ curl --location --request POST 'http://localhost:8080/api/v1/auth/register' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=2CE66497DA0DB778A4BAE95734B37AAB' \
--data-raw '{
    "firstName" : "Giri Putra",
    "lastName" : "Adhittana",
    "email" : "giri.adhittana@icloud.com",
    "password" : "123"
}'

// Login
$ curl --location --request POST 'http://localhost:8080/api/v1/auth/login' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=2CE66497DA0DB778A4BAE95734B37AAB' \
--data-raw '{
    "email" : "giri.adhittana@icloud.com",
    "password" : "123"
}'

// Get All Job
$ curl --location --request GET 'http://localhost:8080/api/v1/job/' \
--header 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJnaXJpLmFkaGl0dGFuYUBpY2xvdWQuY29tIiwiZXhwIjoxNjc1NTQzMzA3LCJpYXQiOjE2NzU1MDczMDd9.v1TZzF-OLyFwwgUhN_hdcMLbDNsLbY0yfqFIQobxNxU' \
--header 'Cookie: JSESSIONID=2CE66497DA0DB778A4BAE95734B37AAB'

// Get Job By ID
curl --location --request GET 'http://localhost:8080/api/v1/job/32bf67e5-4971-47ce-985c-44b6b3860cdb' \
--header 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJnaXJpLmFkaGl0dGFuYUBpY2xvdWQuY29tIiwiZXhwIjoxNjc1NTQzMzA3LCJpYXQiOjE2NzU1MDczMDd9.v1TZzF-OLyFwwgUhN_hdcMLbDNsLbY0yfqFIQobxNxU' \
--header 'Cookie: JSESSIONID=2CE66497DA0DB778A4BAE95734B37AAB'


```