# 表结构

见DDL

# 接口列表
API:

| Method | URI                            | Desc                  |
|:-------|:-------------------------------|:----------------------|
| PUT    | /jdwa/exchanger/policyset/{id} | modify one policyset  |

Request data: 
```javacript
{
    "name": string,         //策略集名字
}
```

Response data: 
```javascript
{
    "id": number,           //策略集id
    "type": string,         //策略集类型
    "name": string,         //策略集名字
    "filterType": string   //过滤类型（黑名单：black,白名单：white）
}
```

