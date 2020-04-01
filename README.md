# 特性

## 基础特性

1. 不用加分号
2. 默认public
3. 默认提供get,set

## 高级特性

- 可选的类型定义：

  `def version = 1`

- assert

- 括号可选

  `println version` 与`println(version)`相同

- 字符串

  提供单引号、双引号（提供表达式：${verions}）和三引号（支持换行）。

- 集合api

  ```groovy
  // list
  def buildTools = ['ant', 'maven']
  buildTools << 'gradle'
  assert buildTools.getClass() == ArrayList
  assert buildTools.size() == 3
  // map
  def buildYears = ['ant': 2000, 'maven': 2004]
  buildYears.gradle = 2009
  println buildYears.ant
  println buildYears['gradle']
  println buildYears.getClass()
  ```

- 闭包

# 生命周期

- 初始化
- 配置
- 执行

# 依赖管理

- 常用仓库：mavenLocal/mavenCentral/jcenter

- 自定义maven仓库

- 文件仓库

## 版本冲突

默认使用最高版本，可以修改策略：

```groovy
configurations.all{
	resolutionStrategy{
		failOnVersionConflict()
	}
}
```

### 排除传递性依赖

```
compile('org....Final'){
	exclude group:"org.slf4j",module:"slf4j-api"
}
```

### 强制指定版本

```
configurations.all{
	resolutionStrategy{
		force 'org.slf4j:slf4j-api:1.7.24'
	}
}
```

