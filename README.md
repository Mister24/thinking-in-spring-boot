# thinking-in-spring-boot

![Java](https://img.shields.io/badge/Java-8-orange.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.1.4-blue.svg)

> 按章节组织的 Spring Boot 学习工程，集成模板引擎与常用组件，并附带学习笔记。

## 项目简介
以 `chapter` 为单元拆解 Spring Boot 知识点，并配套 `docs` 学习笔记（常用注解、问题汇总）。根工程为 Spring Boot，另含若干独立章节子模块，方便分章演练。

## 技术栈
- Java 8
- Spring Boot 2.1.4
- spring-boot-starter-web
- Beetl 模板引擎（beetl-framework-starter）
- Lombok
- 构建：Maven

## 目录结构
```
├── spring-boot-chapter3/   # 第 3 章示例
├── spring-boot-chapter5/   # 第 5 章示例
├── spring-boot-chapter6/   # 第 6 章示例
├── spring-boot-chapter9/   # 第 9 章示例
├── docs/                   # 学习笔记
│   ├── spring常用注解.md
│   └── 项目问题解决方案汇总.md
└── src/                    # 根工程源码（main / test）
```

## 运行方式
各章节为独立 Maven 工程，进入对应目录启动：
```bash
cd spring-boot-chapter3 && mvn spring-boot:run
```

## 说明
- 个人学习项目。原 README 中的 Apache-2.0 徽标不准确——仓库**未包含 LICENSE 文件**，本次已移除。
- Spring Boot 2.1.x 已不在官方支持周期，新项目建议使用 2.7+/3.x。
- 仓库未声明开源协议（LICENSE）。
