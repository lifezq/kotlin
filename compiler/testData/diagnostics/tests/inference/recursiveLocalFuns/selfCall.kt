// !WITH_NEW_INFERENCE
fun foo() {
    fun bar1() = <!NI;TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM!><!TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM!><!NI;DEBUG_INFO_MISSING_UNRESOLVED!>bar1<!>()<!><!>

    fun bar2() = 1 <!NI;OVERLOAD_RESOLUTION_AMBIGUITY!>+<!> <!NI;TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM!><!TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM!><!NI;DEBUG_INFO_MISSING_UNRESOLVED!>bar2<!>()<!><!>
    fun <!NI;IMPLICIT_NOTHING_RETURN_TYPE!>bar3<!>() = id(<!NI;TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM!><!TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM!><!NI;DEBUG_INFO_MISSING_UNRESOLVED!>bar3<!>()<!><!>)
}

fun <T> id(x: T) = x
