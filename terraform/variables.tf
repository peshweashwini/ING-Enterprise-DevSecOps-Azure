variable "location" {
  description = "Azure region"
  type        = string
  default     = "Central India"
}

variable "resource_group_name" {
  description = "Resource group for the DevSecOps POC"
  type        = string
  default     = "rg-ing-devsecops-poc"
}

variable "acr_name" {
  description = "Globally unique Azure Container Registry name"
  type        = string
}

variable "aks_name" {
  description = "AKS cluster name"
  type        = string
  default     = "aks-ing-devsecops-poc"
}
