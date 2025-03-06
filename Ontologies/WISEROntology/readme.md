# Bridge Ontology for Life Cycle Assessment Data

## Overview

This repository contains a Bridge Ontology designed to work with multiple Life Cycle Assessment (LCA) data formats, specifically Ecospold02, Ecospold01, and ILCD XML files. The ontology provides a semantic framework for integrating and harmonizing LCA data across different standards, facilitating interoperability and data exchange in environmental science applications.

## Repository Structure

- **Ontology**[LINK_MISSING]: Contains the terminological component (schema) of our bridge ontology
- **RDFifier**[LINK_MISSING]: Tool for transforming Ecospold02, Ecospold01, and ILCD XML files into RDF format
- **SampleDataGenerator**[LINK_MISSING]: Utility for generating sample ABox data for testing and demonstration purposes

## TBox

Please find the different TBoxes here:
- [LINK_MISSING] EcoSpold02-Bridge-TBox
- [LINK_MISSING] EcoSpold01-Bridge-TBox
- [LINK_MISSING] ILCD-Bridge-TBox

## ABox

Due to licensing restrictions, we are unable to share the actual instance data (ABox) used in our implementation. However, we have provided a `SampleDataGenerator` tool that can be used to create synthetic ABox data for testing and evaluation purposes.

> **Note**: The `SampleDataGenerator` is not a full implementation of the real ABox and some features might be missing. It is intended primarily to demonstrate the approach and to show that the ABox component has been considered.

## Usage

### RDFifier

The RDFifier tool enables the transformation of LCA data in various formats (Ecospold02, Ecospold01, ILCD) into RDF, which can then be used with the bridge ontology. Detailed usage instructions can be found in the RDFifier directory.

### Sample Data Generation

To generate sample data for testing:

1. Navigate to the `SampleDataGenerator` directory
2. Follow the instructions in the README to generate sample ABox data
3. Use the generated data with the TBox to test queries and applications
