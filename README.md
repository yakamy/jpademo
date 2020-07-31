# jpademo
spring data jpa demo

### 增加 AbstractEntity 抽象类

所有实体继承此类，这样新增一条数据不会再执行一次查询。默认jpa不能判断出是否是新增还是修改，会先执行一次查询语句。
