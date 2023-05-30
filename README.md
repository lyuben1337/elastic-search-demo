# Java Spring Boot 3.0.4 ElasticSearch Example

This project is an example demonstrating the usage of Java Spring Boot Framework with ElasticSearch. Please note that this project is for demonstration purposes only and should not be built or used in a production environment.

## Description

This project provides a simple RESTful API for managing talents. It includes CRUD (Create, Read, Update, Delete) operations for talent objects stored in an ElasticSearch index.

The main components of this project are:

- `TalentController`: This class defines the REST endpoints for interacting with talents. It handles HTTP requests and delegates the operations to the `TalentService`.
- `Talent`: This class represents a talent object. It is annotated with `@Document` to specify the ElasticSearch index name and contains fields such as `name`, `surname`, and `about`.
- `TalentRepository`: This interface extends `ElasticsearchRepository` and provides methods for querying talents in the ElasticSearch index.
- `TalentService`: This class contains the business logic for managing talents. It interacts with the `TalentRepository` to perform CRUD operations.

## API Endpoints

The following API endpoints are available:

- `POST /api/talents`: Create a new talent. The talent information should be provided in the request body as a `TalentDTO` object.
- `GET /api/talents/{id}`: Retrieve a talent by its ID.
- `GET /api/talents`: Search talents by a given text. The text should be provided in the request body as a string.
- `DELETE /api/talents`: Delete all talents.

## Getting Started

To run this project locally, follow these steps:

1. [Set up ElasticSearch](https://www.elastic.co/downloads/elasticsearch): Make sure you have ElasticSearch installed and running on your local machine.
2. Clone the project: Clone this repository to your local machine.
3. Build the project: Build the project using your preferred build tool (e.g., Maven).
4. [Configure ElasticSearch connection](https://stackoverflow.com/questions/71492404/elasticsearch-showing-received-plaintext-http-traffic-on-an-https-channel-in-con): Update the ElasticSearch connection properties in the project's configuration file to match your local ElasticSearch setup.
5. Run the application: Start the Spring Boot application and verify that it is running successfully.

## Dependencies

This project relies on the following dependencies:

- Spring Boot: A framework for building Java applications.
- Spring Data Elasticsearch: Provides integration with Elasticsearch for data access.
- Spring Web: Provides RESTful web service capabilities.
- Lombok: Simplifies the creation of Java classes by generating boilerplate code.

## Disclaimer

This project is an example meant for educational and demonstration purposes only. It may not include all necessary features, error handling, or security measures required for a production-ready application. Use it at your own risk.

## Contact Information

For any questions or inquiries, please feel free to contact the project maintainer at vladyslav.liubchyk@nure.ua
