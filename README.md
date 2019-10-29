# nginx-solve-crossorigin-with-authentication

nginx反向代理解决前后端分离有权限认证接口调用跨域问题

**后端**

- 有权限认证的接口：`/student/{id}`
- 登录接口：`/login`
- 退出登录接口：`/logout`
- Authentication Filter：`AuthenticationFilter.java`
- 登录页：`/login.html`
    - 用户名/密码：admin/123456

**前端**
    
- 异步请求接口：`/api/student/{id}`
- 跨域请求失败后跳转：`/api/login.html`
- 退出登录跳转：`/api/logout`

**Nginx代理**

```
# 前端静态文件
# 将前端打包后的index.html和dist文件夹放到对应位置
location / {
    root /usr/share/nginx/html;
    index index.html index.htm;
}

# 后端接口代理
location /api/ {
    proxy_pass http://192.168.20.31:8081/;
}

# 后端接口redirect off,避免Ajax请求到302数据
location /api/student {
    proxy_redirect off;
    proxy_pass http://192.168.20.31:8081/student;
}

# 登录验证提交
location /login {
    proxy_pass http://192.168.20.31:8081/login;
}
```

---
