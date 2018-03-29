[![Build Status](https://travis-ci.org/buraksarp/apache-traffic-server-exporter.svg?branch=master)](https://travis-ci.org/buraksarp/apache-traffic-server-exporter)

Apache Traffic Server Exporter for Prometheus TSDB.
=========================

This demo assumes you know how to run Docker.

Building Containers
---------------------

Nothing special if you already have Docker installed. 

    $ git clone https://github.com/buraksarp/apache-traffic-server-exporter.git
    $ cd apache-traffic-server-exporter

Edit following file, set the public ip or address of your ATS Edge node;

    apache-traffic-server-exporter/src/main/resources/application.properties 
    > apache-traffic-server.stats.uri = http://<ats_edge_server_address>/_stats 

Build the docker images. 

    $ docker-compose build 

Running Containers with the docker-compose
---------------------
To run these containers:

    $ docker-compose up
    
To view Apache Traffic Server Dashboard on Grafana
---------------------

go to grafana UI: [http://localhost:3000](http://localhost:3000)

Default username & password : admin

Install grafana dashboard template for prometheus - [https://grafana.com/dashboards/2914](https://grafana.com/dashboards/2914)

1. create data source

    Name   : edge-data (or your favourite data source name)
    Type   : prometheus

    
    
    URL    : http://prometheus:9090
    Access : proxy
    leave the other fields default

![Alt text](docs/new-datasource.png?raw=true "New data source")
