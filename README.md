# Logging

This application make : 
- a HTTP `GET` call; 
- to `https://httpbin.org/` baseURL;
- on  `/get` resource;
- with headers.

It logs URL and headers to standard output. 

```shell
./gradlew bootRun
```

You'll get

```text
TRACE o.s.w.r.f.client.ExchangeFunctions - [26425897] HTTP GET https://httpbin.org/get, headers=[Accept:"application/json", my-header:"value"]
```

[Documentation](https://github.com/GradedJestRisk/java-training/wiki/Web#log-calls)