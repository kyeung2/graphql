# Playing with GraphQL
This project was created following the excellent tutorials at [howtographql.com](https://www.howtographql.com/graphql-java/0-introduction/)


TODO blog post coming soon
Blog post: [Comparing REST and GraphQL](https://ioflyingnimbus.blogspot.com)

### Setup Mongo

You can also setup a local Mongo running from a local [Docker](https://www.docker.com/docker-mac) image. Pull the [Mongo image](https://hub.docker.com/_/mongo/) and run remembering to use the **-p** option to the port. e.g:

`docker run -p 27017:27017 --name some-mongo mongo`

Useful connecting to the Mongo shell during development viewing contents of collections etc:

`docker exec -it some-mongo bash`


### GraphQL features
* one endpoint
* backed by a schema which can be introspected by clients
* declarative style queries by clients to get exactly the data it wants


* notes:
    - pretty cool idea but early technology
    - declarative like SQL but unlike SQL, many features missing no inbuilt support for filtering, pagination style queries. Backend needs to invent SQL engine features if features desired.
    - extra effort is needed to guard against malicious queries. 
    - cannot easily cache queries as REST due to the dynamic nature of client requests
    - since GraphQL can be used with any transport protocol cannot use OAuth or even Basic HTTP Authentication. Again need to invent into the schema itself.
    - efficient data collection is probably the most difficult to achieve. That is like trying to reinvent a DBMS