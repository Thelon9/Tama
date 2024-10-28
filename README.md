# git
git init
git remote add origin https://github.com/Thelon9/Tama.git

# compile
```
mvn clean compile assembly:single install
```

# start
```bash
docker compose up -d
```

## tama-care

### check the connection to redis

```bash
redis-cli -h redis -p 6379
```