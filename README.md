# Getting Started - Introduction

* Unified Medical Language System consists of some data obtained from different biomedical source vocabularies such as MeSH, SNOMED-CT, ICD10 etc. 
* The data can be downloaded from metathesaurus download link available in [2021AA UMLS Metathesaurus Files](https://www.nlm.nih.gov/research/umls/licensedcontent/umlsknowledgesources.html)
* There is a book describing the data grouping and overall concepts and structuring used for the metathesaurus in the [UMLS® Reference Manual](https://www.ncbi.nlm.nih.gov/books/NBK9685/)

### Local development

* Download the data files
* Install mysql on local and run the db scripts (some modifications in the scripts are required and are committed as part of this repository)
* Need to set some env variables specific to the running mysql and run the service in the following fashion -

```
mvn clean install
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

### Guides

* [Install mysql on MAC](https://flaviocopes.com/mysql-how-to-install/)
* [Springboot JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference)
* [Install lombok in Intellij](https://plugins.jetbrains.com/plugin/6317-lombok)
