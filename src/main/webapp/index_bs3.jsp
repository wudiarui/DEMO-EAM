<!DOCTYPE html>
<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="pages/include/path.jsp" %>

<html lang="zh-CN">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="x-ua-compatible" content="IE-edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>MK-EAM 全球统一KKS标准编码设备管理系统</title>
    <link href="<c:url value='/plugins/bootstrap/css/bootstrap.min.css'/>" rel="stylesheet"/>
    <link href="<c:url value='/css/signin.css'/>" rel="stylesheet"/>
    <script type="text/javascript" src="<c:url value='/plugins/angular/angular.min.js' />"></script>
    <script type="text/javascript" src="<c:url value='plugins/angular/components/angular-animate.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/plugins/jquery/jquery.min.js' />"></script>
    <script type="text/javascript" src="<c:url value='/plugins/bootstrap/js/bootstrap.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/js/signinApp.js'/>"></script>

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]>
    <script src="//v3.bootcss.com/assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="//v3.bootcss.com/assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body ng-app="signinApp">
<header id="cta" class="banner">
    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                        aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">MK-EAM</a>
            </div>
            <div id="navbar" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">体验</a></li>
                    <li><a href="#product">介绍</a></li>
                    <li><a href="#help">帮助</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container">
        <div class="row" ng-controller="ShowSigninPanelController">
            <div class="col-sm-6">
                <h1>MK-EAM<br> 设施资产&middot;管理大师</h1>
                <p class="lead">
                    不仅仅支持国际KKS标准编码<br> 多级分析系统，从部件 - 采购<br>
                    辅助价值工程,
                    便捷式操作, 及 <i class="glyphicon glyphicon-play"></i><strong>全生命周期管理</strong>.
                </p>
                <p id="button-row" ng-hide="visible">
                    <a href="#" class="btn btn-large btn-success proxima-bold" ng-click="toggle()">体验!</a>
                </p>
                <!--
                <a href="#">Or watch a video</a>
                -->
            </div>
            <div class="col-lg-6" ng-show="visible">
                <form class="form-signin">
                    <h2 class="form-signin-heading">登录即开始</h2>
                    <label for="inputAccount" class="sr-only">Account </label>
                    <input type="text" id="inputAccount" class="form-control" placeholder="请输入帐号名称" required autofocus/>
                    <label for="inputPassword" class="sr-only">Password</label>
                    <input type="password" id="inputPassword" class="form-control" placeholder="请输入账号密码" required>

                    <div class="checkbox">
                        <label>
                            <input type="checkbox" value="remember-me">记住我
                        </label>
                    </div>
                    <button class="btn btn-large btn-success btn-block" type="submit">登&nbsp;&nbsp;录</button>


                </form>
            </div>
        </div>
    </div>
</header>

</body>
</html>
