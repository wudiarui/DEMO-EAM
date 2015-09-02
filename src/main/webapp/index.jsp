<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="pages/include/path.jsp" %>
<!DOCTYPE html>
<html>
<head lang="zh-CN">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1"/>
    <title>MK-EAM 全球统一KKS标准编码设备管理系统</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/plugins/semantic-ui/semantic.min.css'/>"/>
    <link href="<c:url value='/css/signin.css'/>" rel="stylesheet"/>
    <script type="text/javascript" src="<c:url value='/plugins/semantic-ui/semantic.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/plugins/angular/angular.min.js' />"></script>
    <script type="text/javascript" src="<c:url value='/plugins/angular/components/angular-animate.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/js/signinApp.js'/>"></script>

</head>
<body ng-app="signinApp">
<!-- 构建top nav -->
<div class="ui large top fixed hidden menu">
    <div class="ui container">
        <a class="active item">MK-EAM</a>
        <a class="item">体验</a>
        <a class="item">概况</a>
        <a class="item">帮助</a>

        <div class="right menu">
            <div class="item">
                <a class="ui button">Log in</a>
            </div>
            <div class="item">
                <a class="ui primary button">Sign up</a>
            </div>
        </div>
    </div>
</div>
<!-- 缩小时的侧边栏 -->
<div class="ui vertical inverted sidebar menu">
    <a class="active item">MK-EAM</a>
    <a class="item">体验</a>
    <a class="item">概况</a>
    <a class="item">帮助</a>
    <a class="item">Login</a>
    <a class="item">Signup</a>
</div>
<!-- Page Contents -->
<div class="pusher"  ng-controller="LoginController">
    <div class="ui banner_self inverted vertical masthead center aligned">
        <div class="ui container">
            <div class="ui large secondary inverted pointing menu">
                <a class="toc item">
                    <i class="sidebar icon"></i>
                </a>
                <a class="active item">MK-EAM</a>
                <a class="item">体验</a>
                <a class="item">概况</a>
                <a class="item">帮助</a>

                <div class="right item">
                    <a class="ui huge button teal" ng-click="toggle()">Sign In</a>
                    <a class="ui inverted button teal">Sign Up</a>
                </div>
            </div>
        </div>
        <div class="ui grid">
            <div class="container row sixteen column">
                <div class="two wide column"></div>
                <div class="eight wide column left aligned">
                    <h1 class="ui inverted header">MK-EAM<br> 设施资产&middot;管理大师</h1>

                    <h2 class="content signin-panel-h2">
                        不仅仅支持国际KKS标准编码<br>
                        多级分析系统，从部件 - 采购<br>
                        辅助价值工程,
                        便捷式操作, 及 <i class="right arrow icon"></i><strong>全生命周期管理</strong>.
                    </h2>


                    <%--<div class="ui huge primary button">Get Started <i class="right arrow icon"></i></div>--%>

                </div>

                <div class="ui middle aligned left four wide column" ng-show="visible">

                    <h2 class="ui image header ">
                        <%--<img src="assets/images/logo.png" class="image"/>--%>

                        <div class="content signin-panel-h2">
                            登录即开始
                        </div>
                    </h2>
                    <form class="ui large form" ng-submit="accountLogin()">
                        <div class="ui stacked segment">
                            <div class="field">
                                <div class="ui left icon input">
                                    <i class="user icon"></i>
                                    <input type="text" name="accName" ng-model="formData.accName" placeholder="Account">
                                </div>
                            </div>
                            <div class="field">
                                <div class="ui left icon input">
                                    <i class="lock icon"></i>
                                    <input type="password" name="accPwd" ng-model="formData.accPwd" placeholder="Password">
                                </div>
                            </div>

                        </div>
                        <button class="ui fluid large teal button" type="submit">Login</button>
                        <div class="ui error message">{{ errorName }} : {{ errorMessage }}</div>
                    </form>

                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>