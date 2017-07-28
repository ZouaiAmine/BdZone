<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:ui="http://java.sun.com/jsf/facelets"
      xmlns:f="http://java.sun.com/jsf/core"
      xmlns:h="http://java.sun.com/jsf/html"> 



<h:head>
  <meta name="UTF-8" />
  <title>Day 001 Login Form</title>
  <link rel="stylesheet" type="text/css" href="css/style.css"/>
  <h:outputStylesheet library="login/day-001-login-form/css" name="style.css"></h:outputStylesheet>
  <!-- <link rel="stylesheet" href="login/day-001-login-form/css/style.css" type="text/css" media="screen" charset="utf-8"/> -->
  <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Open+Sans:600'/>

     
  
</h:head>

<h:body>
  <div class="login-wrap">
	<div class="login-html">
		<h:outputText id="tab-1" type="radio" name="tab" class="sign-in" checked="checked" />
		<label for="tab-1" class="tab">Sign In</label>
		<h:outputText id="tab-2" type="radio" name="tab" class="sign-up" />
		<label for="tab-2" class="tab">Sign Up</label>
		<div class="login-form">
			<div class="sign-in-htm">
				<div class="group">
					<label for="user" class="label">login</label>
					<h:inputText id="user" type="text" class="input" value="#{loginBean.login}"></h:inputText>
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<h:inputText id="pass" type="password" class="input" value="#{loginBean.password}" data-type="password"></h:inputText>
				</div>
				<div class="group">
					<h:inputText id="check" type="checkbox" class="check" checked ="checked"></h:inputText>
					<label for="check">
					<span class="icon"></span> Keep me Signed in</label>
					
					
				</div>
				<div class="group">
					<h:commandButton action="#{loginBean.doLogin()}" value="Login" />
				<form id="form-1">
				</form>
				</div>
				
				<div class="hr"></div>
				<div class="foot-lnk">
					<a href="#forgot">Forgot Password?</a>
				</div>
			</div>
			<div class="sign-up-htm">
				<div class="group">
					<label for="user" class="label">login</label>
					<h:inputText id="user" type="text" class="input"></h:inputText>
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<h:inputText id="pass" type="password" class="input" data-type="password"></h:inputText>
				</div>
				<div class="group">
					<label for="pass" class="label">Repeat Password</label>
					<h:inputText id="pass" type="password" class="input" data-type="password"></h:inputText>
				</div>
				<div class="group">
					<label for="pass" class="label">Email Address</label>
					<h:inputText id="pass" type="text" class="input"></h:inputText>
				</div>
				<div class="group">
					<h:commandButton action="#{subscribtionBean}" value="submit" />
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<label for="tab-1">Already Member?</label>
				</div>
			</div>
		</div>
	</div>
</div>
  
  
</h:body>
</html>
