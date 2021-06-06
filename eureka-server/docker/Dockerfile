# 基础镜像
FROM openjdk:8-jdk-alpine
# 作者（可选）
MAINTAINER LiuZhenghua
# 删除无用组件 优化容器体积（可选）
RUN rm -rf /var/lib/apt/lists/*
# 创建jar包存放目录
RUN mkdir -p /usr/local/eureka
# 获取pom文件中build参数
ARG JAR_FILE
# TODO 应当创建用户，把应用放到用户文件夹，以非root用户执行，USER xxx
# copy当前工程jar包至容器内
COPY ${JAR_FILE} /usr/local/eureka/app.jar
# 运行jar包
ENTRYPOINT ["java","-jar","/usr/local/eureka/app.jar"]