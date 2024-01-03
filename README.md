# springboot-read-cron-expression-from-k8s

Small app to demonstrate how to read CRON expression from Kubernetes deployment args to SpringBoot's `@Scheduled` annotation.

## How to run

1. Build the jar by running `./gradlew clean build`
2. Build the docker image by running `docker build -t k8scrontest -f Dockerfile .`
3. Create the K8s deployment by running `kubectl apply -f deployment.yml`
4. Check the logs by running `kubectl logs -f k8scrontest-<pod-id>`

---
<p align="center">
  ⭐ Star this repository — it helps!
</p>
