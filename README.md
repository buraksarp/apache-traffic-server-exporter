Apache Traffic Server Exporter for Prometheus TSDB.
=========================

This demo assumes you know how to run Docker.

Building Containers
---------------------

Nothing special if you already have Docker installed:

    $ git clone https://github.com/buraksarp/apache-traffic-server-exporter.git
    $ cd apache-traffic-server-exporter
    $ docker-compose build 

Running Containers with the docker-compose
---------------------
To run these containers:

    $ docker-compose up
    
To view Apache Traffic Server Dashboard on Grafana
---------------------

go to grafana UI: [http://localhost:3000](http://localhost:3000)

Default username & password : admin

Install grafana dashboard template for prometheus - [https://grafana.com/dashboards/2914(https://grafana.com/dashboards/2914)


    

