<html>
    <#include "../common/header.ftl">
<body>
<#--边栏-->
<div id="wrapper" class="toggled">
            <#include "../common/nav.ftl">
<#--主要内容区-->
    <div id="page-content-wrapper">
        <div class="container-fluid">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <table class="table table-bordered">
                        <thead>
                        <tr>
                            <th>类目id</th>
                            <th>名字</th>
                            <th>type</th>
                            <th>创建时间</th>
                            <th>修改时间</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <#list categoryList as category>
                        <tbody>
                            <td>${category.categoryId}</td>
                            <td>${category.categoryName}</td>
                            <td>${category.categoryType}</td>
                            <td>${category.createTime}</td>
                            <td>${category.updateTime}</td>
                            <td>
                                <a href="/sell/seller/category/index?categoryId=${category.categoryId}">修改</a>
                            </td>
                        </tbody>
                        </#list>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>