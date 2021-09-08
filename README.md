Red Hat Microsweeper demo on Azure App Service
=========================

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
TBD
