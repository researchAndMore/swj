# Semantic Web Journal Submission
This is the submission folder for the paper "A Semantic Approach to Reducing Greenhouse Gas Emissions" for the Semantic Web Journal Submission.
The folder contains the following:
- the :open_file_folder:[WISER Ontology](Ontologies/WISEROntology/)
- the :open_file_folder:[Assessment Standard Ontology](Ontologies/AssessmentStandardOntology/)
- a :open_file_folder: [SAMOD folder](SAMOD) containing all the artifacts used in the SAMOD methodology 
- a :page_facing_up:[Sample Data Generator programm](SampleDataGenerator/dataGenerator.py) to generate data sets without having to worry about licensing
- a :open_file_folder:[React App](GUI) to illustrate and test the behaviour of the semantic backbone with a GUI
- a :bar_chart:[Benchmarking App](Benchmarking) to test performance of different features of the queries
- a :page_facing_up:[RDFifier program](RDFifier) to transform ILCD and EcoSpold02 data to RDF

## Important Note on Ontology URIs

The ontologies in this collection use the following URIs:
- `https://purl.org/wiser/`
- `https://purl.org/wiser#`

These URIs currently serve as namespace placeholders and are not yet HTTP-dereferenceable. Full URI resolution functionality is planned for future implementation.
