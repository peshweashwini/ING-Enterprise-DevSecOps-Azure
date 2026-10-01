# ING Enterprise DevSecOps Azure

Enterprise-style DevSecOps CI/CD project demonstrating secure application delivery using Microsoft Azure and Azure DevOps.

## Project Overview

This project simulates an enterprise payment-service deployment pipeline with security, infrastructure-as-code, containerization, and controlled application deployment.

## Technology Stack

- Microsoft Azure
- Azure DevOps
- Azure Kubernetes Service (AKS)
- Azure Container Registry (ACR)
- Terraform
- Docker
- Kubernetes
- Helm
- Maven
- Java
- Azure DevOps YAML Pipelines
- SonarQube
- Trivy
- Git
- Linux

## DevSecOps Pipeline

```text
Developer
    |
    v
Git Repository
    |
    v
Azure DevOps CI Pipeline
    |
    +--> Maven Build
    |
    +--> Unit Tests
    |
    +--> SonarQube Code Analysis
    |
    +--> Trivy Security Scan
    |
    +--> Docker Build
    |
    +--> Container Image
    |
    v
Azure Container Registry
    |
    v
AKS Deployment
    |
    +--> ST
    |
    +--> ACC / UAT
    |
    +--> PROD
    |
    v
RBAC + Approvals + Security Gates