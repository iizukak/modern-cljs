// Compiled by ClojureScript 0.0-2173
goog.provide('modern_cljs.login');
goog.require('cljs.core');
modern_cljs.login.validate_form = (function validate_form(){var email = document.getElementById("email");var password = document.getElementById("password");if(((cljs.core.count.call(null,email.value) > 0)) && ((cljs.core.count.call(null,password.value) > 0)))
{return true;
} else
{alert("Please, complete the form!");
return false;
}
});
modern_cljs.login.init = (function init(){if(cljs.core.truth_((function (){var and__3431__auto__ = document;if(cljs.core.truth_(and__3431__auto__))
{return document.getElementById;
} else
{return and__3431__auto__;
}
})()))
{var login_form = document.getElementById("loginForm");return login_form.onsubmit = modern_cljs.login.validate_form;
} else
{return null;
}
});
window.onload = modern_cljs.login.init;
