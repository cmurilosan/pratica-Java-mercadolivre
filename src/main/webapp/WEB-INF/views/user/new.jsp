<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form action="/user" method="post">

    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
    <div>
        <label for="login">Login</label>
        <input name="login" id="login">
        <form:errors path="userForm.login" />
    </div>
    <div>
        <label for="password">Senha</label>
        <input name="password" type="password" id="password">
        <form:errors path="userForm.password" />
    </div>
    <button type="submit">Cadastrar</button>
</form>