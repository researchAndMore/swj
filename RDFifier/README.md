# RDFifier - XML to RDF Converter

## Overview
A reflection-based approach for converting XML-based data into RDF format, designed specifically for environmental data interchange formats.

## Supported Formats
The converter currently supports the following XML-based LCA data formats:
- **EcoSpold2** (ec2)
- **ILCD** (plasticseurope)
- **EcoSpold01** (uvek)

## Prerequisites
Ensure you have the required XML files in the appropriate directory:
```
src/main/resources/
├── ec2/            # EcoSpold2 files
├── plasticseurope/ # ILCD files 
└── uvek/           # EcoSpold01 files
```

⚠️ **Note**: These data files are not distributed with the application and must be obtained separately.

## Installation and Usage

### Building the Application
```bash
mvn clean install
```

### Running the Converter
```bash
mvn spring-boot:run
```

### Output
Upon successful execution, the application will generate RDF files in the output directory, ready for further processing or analysis.

## Technical Details
This tool utilizes Java reflection to dynamically process various XML schemas, providing a flexible and extensible approach to data conversion without requiring format-specific code for each new schema.

