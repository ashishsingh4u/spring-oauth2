## Spring-oauth2

### To get OAuth2 token use:
`http://localhost:8080/oauth/token?grant_type=password&username=user&password=user`

### To call secured method call:
`http://localhost:8080/v1/secured?access_toke=<Auth Token>`

### To call un-secured method call:
`http://localhost:8080/v1/`