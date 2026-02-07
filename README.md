# observability

1. docker run --rm \
  -p 3000:3000 \
  -p 4317:4317 \
  -p 4318:4318 \
  grafana/otel-lgtm 으로 수행, 즉시 메트릭 + 트레이스 수집
  
2. 로그 수집을 위해opentelemetry-javaagent.jar 설치 후 실행 옵션 VM에 -javaagent:/path/opentelemetry-javaagent.jar 추가

3. 로그 수집 완료
otel-lgtm을 통해 기본 메트릭, 로그, 트레이스 추가

<img width="1886" height="741" alt="image" src="https://github.com/user-attachments/assets/1306d3d1-e3ca-4c77-a328-2a2a8acfd12d" />

<img width="1882" height="802" alt="image" src="https://github.com/user-attachments/assets/1265b2fb-9dd5-45c3-a6bd-fbaac8de773f" />

<img width="1888" height="909" alt="image" src="https://github.com/user-attachments/assets/933fde58-6266-44c1-8258-e341bff624a5" />
