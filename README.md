Red Hat Microsweeper demo on Azure App Service
==========================

This demo uses a number of cloud technologies to implement a simple game from the earlier days of computing: Minesweeper!

![Screenshot](docs/microsweeper.png)

Technologies include:

* JQuery-based Minesweeper written by [Nick Arocho](http://www.nickarocho.com/) and [available on GitHub](https://github.com/nickarocho/minesweeper).
* Backend based on [Quarkus](https://quarkus.io) to persist scoreboard and provide a reactive frontend and backend connected to [Postgres](https://azure.microsoft.com/en-us/services/postgresql/).
* Deployed using [Azure App Service](https://azure.microsoft.com/en-us/services/app-service/)

-----------
```
# run quarkus in dev mode (it will automatically use Quarkus' dev services to create a DB)
$ mvn quarkus:dev

# access at http://localhost:8080
```

To run demo on Azure App Service
-----------
> There is a [demo!](https://www.youtube.com/watch?v=xBDT4gbcdIk)

Steps to run this with App Service:

* Create App Service w/Postgres
* Enable networking connectivity from Azure services to Postgres via the _Networking_ page for the Postgres service
* add `QUARKUS_HTTP_PORT=80` to App Service Configuration
* Configure GitHub Action through App Service _Deployment Center_, including adding `-Dquarkus.package.type=uber-jar` to build command
* Enable App Insights
